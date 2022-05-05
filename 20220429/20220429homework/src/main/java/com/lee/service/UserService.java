package com.lee.service;

import com.lee.entity.User;

/**
 * @Author： Brian
 * @Todo：
 * @Date： 2022/5/3 17:30
 * @Version： 1.0
 */
public interface UserService {
    public boolean userExist(String name);
    public void register(User user);
    public boolean active(String code);
    User login(String username, String password);
    boolean findPasswordByUserId(int userId, String oldPassword,String newPassword);

    void addHeadImage(int userId,String fileName);

    String findImageById(int id);
}
