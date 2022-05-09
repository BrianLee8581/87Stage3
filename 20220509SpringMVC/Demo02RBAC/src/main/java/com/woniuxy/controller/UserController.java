package com.woniuxy.controller;

import com.woniuxy.model.User;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpSession;

/**
 * @Author： Brian
 * @Todo：
 * @Date： 2022/5/9 16:39
 * @Version： 1.0
 */
@RequestMapping("/users")
@Controller
public class UserController {
    @RequestMapping("/login")
    public String login(String loginId, String loginPwd, HttpSession session) {
        if("admin".equals(loginId) && "admin".equals(loginPwd)) {
            //登陆成功，创建用户对象，将用户对象保存在session中
            User user = new User();
            session.setAttribute("loginedUser", user);
        }
        return "redirect:/roles/list";
    }
}
