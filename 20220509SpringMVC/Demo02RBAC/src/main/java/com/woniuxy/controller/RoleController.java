package com.woniuxy.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.annotation.Resource;

/**
 * @Author： Brian
 * @Todo：
 * @Date： 2022/5/9 16:15
 * @Version： 1.0
 */
@Controller
@RequestMapping("/roles")
public class RoleController {
    //调用业务逻辑层
    @Resource
    private RoleService roleService;

    @RequestMapping("/list")
    public String list(Model model){
        //将角色集合放入Model中
        model.addAttribute("roles",roleService.findAllRoles());
        return "roles/role_list";
    }
}
