package com.woniuxy.Service.impl;

import com.woniuxy.Service.RoleService;
import com.woniuxy.mapper.RoleMapper;
import com.woniuxy.model.Role;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * @Author： Brian
 * @Todo：
 * @Date： 2022/5/11 14:39
 * @Version： 1.0
 */
@Service
public class RoleServiceImpl implements RoleService {
    @Resource
    private RoleMapper roleMapper;


    /**
     * 添加角色
     *
     * @param role 角色
     * @return 成功？
     */
    @Override
    public boolean addRole(Role role) {
        return roleMapper.addRole(role);
    }

    /**
     * 获取角色列表
     *
     * @return 角色列表
     */
    @Override
    public List<Role> findAllRoles() {
        return roleMapper.findAllRoles();
    }

    /**
     * 根据角色编号获取角色对象
     *
     * @param id 角色编号
     * @return 角色对象
     */
    @Override
    public Role findRoleById(Integer id) {
        return roleMapper.findRoleById(id);
    }

    /**
     * 更新角色
     *
     * @param role 角色
     * @return 成功？5
     */
    @Override
    public boolean updateRole(Role role) {
        return roleMapper.updateRole(role);
    }


}
