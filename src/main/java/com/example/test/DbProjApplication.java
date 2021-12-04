package com.example.test;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan("com.example.test.mapper")
public class DbProjApplication {

    public static void main(String[] args) {
        SpringApplication.run(DbProjApplication.class, args);
    }

}
