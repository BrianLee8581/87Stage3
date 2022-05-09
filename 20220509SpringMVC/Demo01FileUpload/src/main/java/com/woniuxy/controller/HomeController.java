package com.woniuxy.controller;

import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.util.MultiValueMap;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.multipart.MultipartFile;

import javax.lang.model.element.NestingKind;
import javax.lang.model.element.VariableElement;
import javax.servlet.ServletContext;
import javax.servlet.http.HttpSession;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.UUID;

/**
 * @Author： Brian
 * @Todo：
 * @Date： 2022/5/9 10:02
 * @Version： 1.0
 */
@Controller
public class HomeController {
    @RequestMapping("/home")
    public String home(){
        return "home";
    }
    @RequestMapping("/testFileUpload")
    public String testFileUpload(){
        return "upload";
    }

    @RequestMapping("/testFileUpload2")
    public String testFileUpload2(){
        return "upload2";
    }


    @RequestMapping("/download/{fileName}")
    public ResponseEntity<byte[]> testResponseEntity(@PathVariable("fileName")String fileName, HttpSession session) throws IOException {
        //获取ServletContext对象
        ServletContext servletContext = session.getServletContext();
        //获取服务器中文件的真实路径
        String realPath = servletContext.getRealPath("/uploads/" + fileName);
        //创建输入流
        InputStream is = new FileInputStream(realPath);
        //创建字节数组
        byte[] bytes = new byte[is.available()];
        //将流读到字节数组中
        is.read(bytes);
        //创建HttpHeaders对象设置响应头信息
        MultiValueMap<String, String> headers = new HttpHeaders();
        //设置要下载方式以及下载文件的名字
        headers.add("Content-Disposition", "attachment;filename="+fileName);
        //设置响应状态码
        HttpStatus statusCode = HttpStatus.OK;
        //创建ResponseEntity对象
        ResponseEntity<byte[]> responseEntity = new ResponseEntity<>(bytes, headers, statusCode);
        //关闭输入流
        is.close();
        return responseEntity;
    }

    /**
     * 处理多文件上传的方法
     */
    @RequestMapping("/upload2")
    public String upload2(HttpSession session,String username, @RequestParam("uploadFile")MultipartFile[] uploadFiles) throws IOException {
        System.out.println("上传者为："+username);
        //获取上传文件的指定目录的物理路径
        String uploadPath = session.getServletContext().getRealPath("/uploads");
        //创建目录对象
        File airFile = new File(uploadPath);
        //判断目录是否存在，目录不存在，创建目录
        if(!airFile.exists()){
            airFile.mkdirs();
        }
        //遍历
        for (MultipartFile uploadFile : uploadFiles) {
            //获取文件名的后缀
            String suffix = uploadFile.getOriginalFilename().substring(uploadFile.getOriginalFilename().lastIndexOf("."));
            //随机生成文件名
            String fileName = UUID.randomUUID().toString().replaceAll("-","")+suffix;
            //上传文件的完整路径
            String realPath=uploadPath+"/"+fileName;
            //根据指定的路径创建文件对象
            File file = new File(realPath);
            //实现文件上传
            uploadFile.transferTo(file);
        }
        return "home";
    }

    /**
     * 处理文件上传的方法
     */
    @RequestMapping("/upload")
    public String upload(String username, MultipartFile uploadFile,HttpSession session) throws IOException {
        System.out.println("上传者为："+username);
        System.out.println("文件名为："+uploadFile.getOriginalFilename());
        //获取上传文件的指定目录的物理路径
        String uploadPath = session.getServletContext().getRealPath("/uploads");
        //获取文件名后缀
        String suffix = uploadFile.getOriginalFilename().substring(uploadFile.getOriginalFilename().lastIndexOf("."));
        //生成文件名
        String fileName = UUID.randomUUID().toString().replaceAll("-","")+suffix;
        //上传文件的完整路径
        uploadPath = uploadPath+"/"+fileName;
        //根据指定的路径创建文件对象
        File file = new File(uploadPath);
        //实现文件上床
        uploadFile.transferTo(file);
        return "home";
    }
}
