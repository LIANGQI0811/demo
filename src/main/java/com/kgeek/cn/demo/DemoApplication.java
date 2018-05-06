package com.kgeek.cn.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class DemoApplication {

    public static void main(String[] args) {
        Class clazz = DemoApplication.class;
        System.out.println(clazz);
        System.out.println(1111111111.==1111111111);
        System.out.println("");

        SpringApplication.run(clazz, args);
    }
}
