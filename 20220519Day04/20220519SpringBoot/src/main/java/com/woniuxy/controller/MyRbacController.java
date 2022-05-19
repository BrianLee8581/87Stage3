package com.woniuxy.controller;

import com.woniuxy.entity.RbacManager;
import com.woniuxy.service.RbacManagerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.Iterator;
import java.util.List;
import java.util.Map;

/**
 * @Author： Brian
 * @Todo：
 * @Date： 2022/5/19 20:09
 * @Version： 1.0
 */
@RestController
@CrossOrigin
@RequestMapping("/rbacManager")
public class MyRbacController {
    @Autowired
    RbacManagerService rbacManagerService;
    @RequestMapping("/findAll")
    public List<Map<String,Object>> findAll(){
        List<Map<String, Object>> all = rbacManagerService.findAll();
        Iterator<Map<String, Object>> iterator = all.iterator();
        return rbacManagerService.findAll();
    }
    @DeleteMapping("/manager/{id}")
    public int deleteOne(@PathVariable("id") int id){
        return rbacManagerService.deleteOne(id);
    }
    @PostMapping("/manager")
    public int addOne(@RequestBody RbacManager rbacManager){
        return rbacManagerService.addOne(rbacManager);
    }
}
