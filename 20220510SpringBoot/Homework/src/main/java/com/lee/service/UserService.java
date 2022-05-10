package com.lee.service;

import com.lee.dao.UserDao;
import com.lee.entity.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @Author： Brian
 * @Todo：
 * @Date： 2022/5/10 20:24
 * @Version： 1.0
 */
@Service
public class UserService {
    @Autowired
    private UserDao userDao;
    /**
     * 增加用户
     */
    public void save(User user){
        userDao.save(user);
    }

    /**
     * 根据id删除用户
     */
    public int deleteById(int id){
        return userDao.deleteById(id);
    }

    /**
     * 更改用户信息
     */
    public int update(User user){
        return userDao.update(user);
    }

    /**
     * 根据id查询用户
     */
    public User selectById(int id){
        return userDao.selectById(id);
    }
    /*public void findUserById() {
        System.out.println("根据id查询用户");
    }*/

    /**
     * 查询所有用户
     */
    public List<User> selectAll(){
        return userDao.selectAll();
    }
}
