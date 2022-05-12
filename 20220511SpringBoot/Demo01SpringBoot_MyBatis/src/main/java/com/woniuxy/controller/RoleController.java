package com.woniuxy.controller;

import com.woniuxy.Service.RoleService;
import com.woniuxy.model.Role;
import com.woniuxy.util.APIResult;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import java.util.List;

/**
 * @Author： Brian
 * @Todo：
 * @Date： 2022/5/11 14:42
 * @Version： 1.0
 */
@RestController
@RequestMapping("/roles")
public class RoleController {
    @Resource
    private RoleService roleService;

    @GetMapping("/list")
    public APIResult<List<Role>> list(){
        return APIResult.success(roleService.findAllRoles());
    }

    @PostMapping("/add")
    //@RequestMapping(value="/add",method=RequestMethod.POST)
    public APIResult<Role> add(@RequestBody Role role){
        //执行添加角色功能
        boolean flag = roleService.addRole(role);
        if(flag){
            return APIResult.success(role);
        }else{
            return APIResult.error();
        }
    }
    @GetMapping("/{id}")
    public APIResult<Role> findById(@PathVariable("id") Integer id){
        //根据编号获取角色
        //Role role = roleService.findRoleById(id);
        //return APIResult.success(role);
        return APIResult.success(roleService.findRoleById(id));
    }

    @PostMapping("/update")
    public APIResult<Role> update(@RequestBody Role role){
        //执行添加角色功能
        boolean flag = roleService.updateRole(role);
        if(flag){
            return APIResult.success(role);
        }else{
            return APIResult.error();
        }
    }
}
