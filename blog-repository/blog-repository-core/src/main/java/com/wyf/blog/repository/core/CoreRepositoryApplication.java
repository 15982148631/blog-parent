package com.wyf.blog.repository.core;


import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;


/**
 * @Author wyf
 * @ClassName CoreRepositoryApplication
 * @Description 数据层访问
 * @Date 2020/11/25 9:39
 * @Version 1.0.0
 */
@SpringBootApplication
@MapperScan(basePackages = "com.wyf.blog.repository.core.mapper")
public class CoreRepositoryApplication {
    public static void main(String[] args) {
        SpringApplication.run(CoreRepositoryApplication.class,args);
    }
}
