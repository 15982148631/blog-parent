package com.wyf.blog.business.core;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import tk.mybatis.spring.annotation.MapperScan;

/**
 * @Author wyf
 * @ClassName CoreBusinessApplication
 * @Description 服务调用层
 * @Date 2020/11/25 11:48
 * @Version 1.0.0
 */
@SpringBootApplication
@MapperScan(basePackages = "com.wyf.blog.repository.core.mapper")
public class CoreBusinessApplication {
    public static void main(String[] args) {
        SpringApplication.run(CoreBusinessApplication.class, args);
    }
}
