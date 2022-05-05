package com.lee.service.impl;

import com.lee.dao.UserDao;
import com.lee.entity.User;
import com.lee.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @Author： Brian
 * @Todo：
 * @Date： 2022/5/3 17:31
 * @Version： 1.0
 */
@Service
public class UserServiceImpl implements UserService {
    @Autowired
    private UserDao userDao;

    @Override
    public boolean userExist(String name) {
        User user = userDao.findUserByName(name);
        if (user == null) {
            return false;
        } else {
            return true;
        }
    }

    @Override
    public void register(User user) {
        userDao.addUser(user);
    }

    @Override
    public boolean active(String code) {
        return false;
    }

    @Override
    public User login(String username, String password) {
        return null;
    }

    @Override
    public boolean findPasswordByUserId(int userId, String oldPassword, String newPassword) {
        return false;
    }

    @Override
    public void addHeadImage(int userId, String fileName) {

    }

    @Override
    public String findImageById(int id) {
        return null;
    }

    /*@Override
    public void addHeadImage(int userId, String fileName) {
        userDao.addHeadImage(userId,fileName);
    }

    @Override
    public String findImageById(int id) {
        return userDao.findImageById(id);
    }*/
}
