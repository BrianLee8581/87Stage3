package com.woniuxy.Service;


import com.woniuxy.model.User;

import java.util.List;

public interface UserService {
    public boolean addUser(User user);


    public boolean updateUser(User user);


    public List<User> findAllUsers();


    public User findUserByLoginId(String loginId);
}

