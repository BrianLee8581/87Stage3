package com.lee.dao;

import com.lee.entity.User;
import org.apache.ibatis.annotations.Param;

/**
 * @Author： Brian
 * @Todo：
 * @Date： 2022/5/3 17:19
 * @Version： 1.0
 */
public interface UserDao {
    public User findUserByName(String name);
    public  void addUser(User user);
    public  User findByCode(String code);
    public void updateStatusById(int id);
    public User findUserByUsernameAndPassword(@Param("username") String username, @Param("password") String password);

    //查询用户名是否存在
    //String findPasswordByUserId(int userId);

    //更改密码
    //void updatePassword(@Param("id") int userId,@Param("newPassword") String newPassword);

    //添加头像
    //void addHeadImage(@Param("id") int userId,@Param("image")String fileName);

    //查询头像
    //String findImageById(int id);
}
