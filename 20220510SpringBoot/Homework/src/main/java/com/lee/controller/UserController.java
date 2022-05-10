package com.lee.controller;

import com.lee.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @Author： Brian
 * @Todo：
 * @Date： 2022/5/10 20:33
 * @Version： 1.0
 */
@Controller
public class UserController {
    @Autowired
    private UserService userService;

}
