package com.woniuxy.Service.impl;

import com.woniuxy.Service.UserService;
import com.woniuxy.mapper.UserMapper;
import com.woniuxy.model.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @Author： Brian
 * @Todo：
 * @Date： 2022/5/12 9:58
 * @Version： 1.0
 */
@Service
public class UserServiceImpl implements UserService {
    @Autowired
    private UserMapper userMapper;

    @Override
    public boolean addUser(User user) {
        return false;
    }

    @Override
    public boolean updateUser(User user) {
        return false;
    }

    @Override
    public List<User> findAllUsers() {
        return null;
    }

    @Override
    public User findUserByLoginId(String loginId) {
        return null;
    }
}
