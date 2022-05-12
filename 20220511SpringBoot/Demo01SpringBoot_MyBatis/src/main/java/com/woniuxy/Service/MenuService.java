package com.woniuxy.Service;

import com.woniuxy.model.Menu;
import com.woniuxy.model.Role;

import java.util.List;

/**
 * @Author： Brian
 * @Todo：
 * @Date： 2022/5/12 9:30
 * @Version： 1.0
 */
public interface MenuService {

    public Menu findMenuById(Integer id);

    public List<Menu> findAllMenus();

    public List<Menu> findMenusByParentId(Integer parentId);

    public List<Menu> findMenusByRoleId(Integer roleId);
}
