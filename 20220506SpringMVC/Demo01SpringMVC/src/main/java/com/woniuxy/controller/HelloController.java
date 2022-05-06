package com.woniuxy.controller;

import com.sun.org.apache.xpath.internal.operations.Mod;
import com.sun.org.apache.xpath.internal.operations.Variable;
import com.woniuxy.entity.User;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import java.util.Map;

/**
 * @Author： Brian
 * @Todo：
 * @Date： 2022/5/6 10:40
 * @Version： 1.0
 */
@Controller
public class HelloController {
    @RequestMapping("/hello")
    public String hello() {
        return "hello";
    }

    @RequestMapping("/login")
    public ModelAndView login(String username, @RequestParam("pass") String password) {
        ModelAndView modelAndView = new ModelAndView();
        modelAndView.addObject("username", username);
        modelAndView.addObject("password", password);
        modelAndView.setViewName("/WEB-INF/views/login.jsp");
        return modelAndView;
    }

    @RequestMapping("/testpojo")
    public String testpojo(User user) {
        System.out.println(user.getUsername());
        System.out.println(user.getPassword());
        return "hello";
    }

    @RequestMapping("/testArray")
    public String testArray(String[] hobby) {
        for (String s : hobby) {
            System.out.println(s);
        }
        return "hello";
    }

    /**
     * map中的key为表单元素的名称，值为元素的值
     * 使用map类型来接受数据
     *
     */
    @RequestMapping("/testMap")
    public String testMap(@RequestParam Map<String,Object> map){
        System.out.println("用户名称："+map.get("username"));
        System.out.println("用户密码："+map.get("password"));
        return "hello";
    }
}