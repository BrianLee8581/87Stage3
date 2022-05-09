package com.woniuxy.controller;

import com.woniuxy.util.ResponseResult;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.Date;
import java.util.HashMap;
import java.util.Map;

/**
 * @Author： Brian
 * @Todo：
 * @Date： 2022/5/9 20:31
 * @Version： 1.0
 */
public class UserController {
    /**
     * 测试@RequestBody注解，
     */
    @RequestMapping("/testRequestBody")
    public String testRequestBody(@RequestBody String content, Model model){
        model.addAttribute("content",content);
        return "success";
    }

    @RequestMapping("/testResponseBody")
    @ResponseBody
    public String testResponseBody(){
        return "这是响应内容的文本";
    }

    @RequestMapping("/testResponseBody2")
    @ResponseBody
    public ResponseResult testResponseBody2(){
        Map<String, Object> map = new HashMap<>();
        map.put("a","AAAA");
        map.put("b","BBBB");
        map.put("name","张三");
        map.put("date", new Date());
        ResponseResult responseResult = new ResponseResult(200,"成功",map);
        return responseResult;
    }
}
