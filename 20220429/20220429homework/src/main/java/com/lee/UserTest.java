package com.lee;

import com.lee.entity.User;
import com.lee.service.UserService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @Author： Brian
 * @Todo：
 * @Date： 2022/5/3 17:25
 * @Version： 1.0
 */
public class UserTest {
    public static void main(String[] args) {
        ApplicationContext applicationContext=new ClassPathXmlApplicationContext("applicationContext.xml");
        UserService userService = applicationContext.getBean("userServiceImpl", UserService.class);
        boolean flag = userService.userExist("root");
        System.out.println(flag);//true

        userService.addHeadImage(8,"cat.jpg");

        String image = userService.findImageById(10);
        System.out.println(image);//cat.jpg

        User user = new User("lee", "1234", "2515368832@qq.com", "catcat.jpg", "15685848919586115111");
        userService.register(user);


    }
}
