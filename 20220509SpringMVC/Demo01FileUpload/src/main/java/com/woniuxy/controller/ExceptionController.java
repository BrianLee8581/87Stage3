package com.woniuxy.controller;

import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @Author： Brian
 * @Todo：
 * @Date： 2022/5/9 20:29
 * @Version： 1.0
 */
public class ExceptionController {
    @RequestMapping("/testException")
    public String test1(){
        int result = 10 / 0;  //算术异常
        return "home";
    }
    @RequestMapping("/testException2")
    public String test2(){
        String message = null;
        message = message.toString(); //空指针异常
        return "home";
    }
}
