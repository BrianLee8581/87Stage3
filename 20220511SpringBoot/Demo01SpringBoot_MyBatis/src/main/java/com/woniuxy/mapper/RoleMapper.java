package com.woniuxy.mapper;

import com.woniuxy.model.Role;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

/**
 * @Author： Brian
 * @Todo：
 * @Date： 2022/5/11 14:28
 * @Version： 1.0
 */
@Mapper
public interface RoleMapper {
    /**
     * 添加角色
     * @param role 角色
     * @return 成功？
     */
    public boolean addRole(Role role);

    /**
     * 获取角色列表
     * @return 角色列表
     */
    public List<Role> findAllRoles();

    /**
     * 根据角色编号获取角色对象
     * @param id 角色编号
     * @return 角色对象
     */
    public Role findRoleById(Integer id);

    /**
     * 更新角色
     * @param role 角色
     * @return 成功？
     */
    public boolean updateRole(Role role);
}
