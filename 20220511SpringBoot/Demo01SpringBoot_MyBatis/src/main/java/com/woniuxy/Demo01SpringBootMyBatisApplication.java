package com.woniuxy;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan("com.woniuxy.mapper")
public class Demo01SpringBootMyBatisApplication {

    public static void main(String[] args) {
        SpringApplication.run(Demo01SpringBootMyBatisApplication.class, args);
    }

}
