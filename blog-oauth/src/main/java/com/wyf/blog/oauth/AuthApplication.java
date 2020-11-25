package com.wyf.blog.oauth;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * @Author wyf
 * @ClassName AuthApplication
 * @Description //TODO
 * @Date 2020/11/25 15:30
 * @Version 1.0.0
 */
@SpringBootApplication(scanBasePackages = "com.wyf.blog")
@MapperScan(basePackages = "com.wyf.blog.repository.core.mapper")
public class AuthApplication {

    public static void main(String[] args) {
        SpringApplication.run(AuthApplication.class, args);
    }

}