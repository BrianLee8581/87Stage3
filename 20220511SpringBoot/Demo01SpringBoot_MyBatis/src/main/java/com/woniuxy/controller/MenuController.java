package com.woniuxy.controller;

import com.woniuxy.Service.MenuService;
import com.woniuxy.model.Menu;

import com.woniuxy.util.APIResult;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.List;

@RestController
@RequestMapping("/menus")
public class MenuController {

    @Resource
    private MenuService menuService;

    @RequestMapping("/list")
    public APIResult<List<Menu>> list(){
        return APIResult.success(menuService.findAllMenus());
    }


}
