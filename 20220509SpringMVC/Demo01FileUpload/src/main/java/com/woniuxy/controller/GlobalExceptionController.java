package com.woniuxy.controller;

import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

/**
 * @Author： Brian
 * @Todo：
 * @Date： 2022/5/9 17:24
 * @Version： 1.0
 */
@ControllerAdvice
public class GlobalExceptionController {
    //@ExceptionHandler用于设置所标识方法处理的异常
    @ExceptionHandler({ArithmeticException.class})
    //ex表示当前请求处理中出现的异常对象
    public String handleArithmeticException(Exception ex, Model model){
        model.addAttribute("ex", ex);
        return "error";
    }
}
