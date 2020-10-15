package com.example.mybatisplussecurity;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * @Author 邢方辉
 * @Date 2020/6/2 10:09
 * @Version 1.0
 * @Content 创建一个java文本
 */
@SpringBootApplication
@MapperScan("com.example.mybatisplussecurity.mapper")
public class MybatisPlusSecurityApplication {
    public static void main(String[] args) {
        SpringApplication.run(MybatisPlusSecurityApplication.class,args);
    }
}
