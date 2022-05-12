package com.woniuxy.controller;

import com.woniuxy.Service.UserService;
import com.woniuxy.model.User;

import com.woniuxy.util.APIResult;

import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;

import java.util.List;

@RestController
public class UserController {

    @Resource
    private UserService userService;

    @GetMapping("/user")
    public APIResult<List<User>> findUser(){
        List<User> list = userService.findAllUsers();
//        map.addAttribute("userList",list);
        return APIResult.success(list);
    }
    @RequestMapping("/find")
    public APIResult<User> findbyloginid(String userLoginId){
        return APIResult.success(userService.findUserByLoginId(userLoginId)) ;
    }

    @PostMapping("/add")
    public APIResult<User> add(@RequestBody User user){
        //执行添加角色
        boolean flag = userService.addUser(user);
        if (flag){
            return APIResult.success(user);
        }else {
            return APIResult.error();
        }
    }

    @PostMapping ("/update")
    public APIResult<User> update(@RequestBody User user){
        //执行添加角色
        boolean flag = userService.updateUser(user);
        if (flag){
            return APIResult.success(user);
        }else {
            return APIResult.error();
        }
    }
//
//    private static List<User> list = new ArrayList<User>();
//    static {
//        User user = new User();
//        user.setName("熊大");
//        user.setId("001");
//        list.add(user);
//        User user2 = new User();
//        user2.setName("熊二");
//        user2.setId("002");
//        list.add(user2);
//    }
//    @GetMapping("/login")
//    public String login(){
//        return "index";
//    }
//    @GetMapping("/index")
//    public String index(String name, String id, ModelMap modelMap){
//        for (User user : list) {
//            if (user.getId().equals(id) && user.getName().equals(name)) {
//                modelMap.addAttribute("list",list);
//                return "home";
//            }
//        }
//        return "index";
//    }
//
//    @GetMapping("/toadd")
//    public String toadd(){
//        return "add";
//    }
//
//    @GetMapping("/add")
//    public String add(String name, String id, ModelMap modelMap){
//        User user = new User();
//        user.setId(id);
//        user.setName(name);
//        list.add(user);
//        modelMap.addAttribute("list",list);
//        return "home";
//    }
//
//    @GetMapping("/toupdate")
//    public String toupdate(String id, ModelMap modelMap){
//        User myuser = new User();
//        for (User user : list) {
//            if (user.getId().equals(id)) {
//                myuser.setName(user.getName());
//                myuser.setId(user.getId());
//            }
//        }
//        modelMap.addAttribute("user",myuser);
//        return "update";
//    }
//
//    @GetMapping("/update")
//    public String update(String name, String id, ModelMap modelMap){
//        int num = 0;
//        for (User user : list) {
//            if (user.getId().equals(id)) {
//                list.remove(num);
//                User user1 = new User();
//                user1.setName(name);
//                user1.setId(id);
//                list.add(user1);
//                break;
//            }
//            num ++;
//        }
//        modelMap.addAttribute("list",list);
//        return "home";
//    }
//
//    @GetMapping("/delete")
//    public String delete(String id, ModelMap modelMap){
//        int num = 0;
//        for (User user : list) {
//            if (user.getId().equals(id)) {
//                list.remove(num);
//                break;
//            }
//            num ++;
//        }
//        modelMap.addAttribute("list",list);
//        return "home";
//    }
}
