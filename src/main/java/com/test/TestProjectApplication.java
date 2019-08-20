package com.test;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;


@SpringBootApplication
public class TestProjectApplication {

    public static void main(String[] args) {
        System.out.println("jenkins 自动发布服务启动。。。。。");
        SpringApplication.run(TestProjectApplication.class, args);
    }

}
