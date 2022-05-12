package com.woniuxy.mapper;

import com.woniuxy.model.User;

import java.util.List;

/**
 * @Author： Brian
 * @Todo：
 * @Date： 2022/5/12 9:51
 * @Version： 1.0
 */
public interface UserMapper {
    /**
     * 增加用户
     */
    public boolean addUser(User user);

    /**
     * 删除用户信息
     */


    /**
     * 修改用户信息
     */
    public boolean updateUser(User user);

    /**
     * 查询所有用户信息
     */
    public List<User> findAllUsers();

    /**
     * 根据id查询用户信息
     */
    public User findUserByLoginId(Integer id);
}
