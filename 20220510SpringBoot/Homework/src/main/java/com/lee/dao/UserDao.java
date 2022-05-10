package com.lee.dao;

import com.lee.entity.User;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * @Author： Brian
 * @Todo：
 * @Date： 2022/5/10 20:03
 * @Version： 1.0
 */
@Repository
public interface UserDao {
    /**
     * 增加用户
     */
    void save(User user);

    /**
     * 根据id删除用户
     */
    int deleteById(int id);

    /**
     * 更改用户信息
     */
    int update(User user);

    /**
     * 根据id查询用户
     */
    User selectById(int id);
    /*public void findUserById() {
        System.out.println("根据id查询用户");
    }*/

    /**
     * 查询所有用户
     */
    List<User> selectAll();
}

