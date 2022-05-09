package com.woniuxy.interceptor;

import org.springframework.web.servlet.HandlerInterceptor;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * @Author： Brian
 * @Todo：SpringMVC拦截器初体验
 * @Date： 2022/5/9 14:23
 * @Version： 1.0
 */
public class HelloInterceptor implements HandlerInterceptor {
    //在目标方法执行之前执行
    public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler) throws Exception {
        System.out.println("preHandle...拦截器在执行目标方法前执行了");
        return true;
    }
    //在目标方法执行之后执行,视图对象返回之前执行
    public void postHandle(HttpServletRequest request, HttpServletResponse response, Object handler, ModelAndView modelAndView){
            System.out.println("postHandle...视图对象返回之前执行");
    }
    //在流程都执行完毕后执行
    public void afterCompletion(HttpServletRequest request, HttpServletResponse response, Object handler, Exception ex) throws Exception {
        System.out.println("afterCompletion...流程都执行完毕后执行");
    }
}
