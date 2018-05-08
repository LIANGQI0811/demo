package com.kgeek.cn.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class DemoApplication {

    public static void main(String[] args) {
        Class clazz = DemoApplication.class;
        SpringApplication.run(clazz, args);
    }
}
