package com.woniuxy.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @Author： Brian
 * @Todo：
 * @Date： 2022/5/5 20:30
 * @Version： 1.0
 */
@Controller
public class HelloController {
    @RequestMapping("/hello")
    public String hello(){
        System.out.println("Hello World!");
        return "hello";
    }
}
