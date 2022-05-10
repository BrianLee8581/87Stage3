package com.woniuxy;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@SpringBootApplication
public class Demo03SpringBootConfigApplication {

    public static void main(String[] args) {
        SpringApplication.run(Demo03SpringBootConfigApplication.class, args);
    }

    //获取配置文件中定义的端口
    @Value("${server.port}")
    private String port;

    @GetMapping("/hello")
    public String hello() {
        return "Hello World，the server port is " + port;
    }


}
