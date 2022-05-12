package com.woniuxy.Service.impl;

import com.woniuxy.Service.MenuService;
import com.woniuxy.mapper.MenuMapper;
import com.woniuxy.model.Menu;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * @Author： Brian
 * @Todo：
 * @Date： 2022/5/12 9:31
 * @Version： 1.0
 */
@Service
public class MenuServiceImpl implements MenuService {

    @Resource
    private MenuMapper menuMapper;

    @Override
    public Menu findMenuById(Integer id) {
        return menuMapper.findMenuById(id);
    }

    @Override
    public List<Menu> findAllMenus() {
        return menuMapper.findAllMenus();
    }

    @Override
    public List<Menu> findMenusByParentId(Integer parentId) {
        return menuMapper.findMenusByParentId(parentId);
    }

    @Override
    public List<Menu> findMenusByRoleId(Integer roleId) {
        return menuMapper.findMenusByRoleId(roleId);
    }

}
