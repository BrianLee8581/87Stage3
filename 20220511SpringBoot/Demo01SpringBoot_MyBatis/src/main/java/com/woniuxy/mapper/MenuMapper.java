package com.woniuxy.mapper;

import com.woniuxy.model.Menu;

import java.util.List;

/**
 * @Author： Brian
 * @Todo：
 * @Date： 2022/5/12 9:29
 * @Version： 1.0
 */
public interface MenuMapper {
    /**
     * 根据编号获取Menu对象
     * @param id 菜单编号
     * @return 菜单对象
     */
    public Menu findMenuById(Integer id);
    /**
     * 显示所有菜单
     * @return
     */
    public List<Menu> findAllMenus();

    /**
     * 根据父菜单的编号获取子菜单列表
     * @param parentId 父编号
     * @return 菜单列表
     */
    public List<Menu> findMenusByParentId(Integer parentId);

    /**
     * 根据角色编号获取菜单列表
     * @param roleId 角色编号
     * @return 菜单列表
     */
    public List<Menu> findMenusByRoleId(Integer roleId);
}
