package com.wyf.blog.controller.dashboard;


import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import tk.mybatis.spring.annotation.MapperScan;

/**
 * @Author wyf
 * @ClassName DashboardControllerApplication
 * @Description //TODO
 * @Date 2020/11/25 14:37
 * @Version 1.0.0
 */
@SpringBootApplication(scanBasePackages = "com.wyf.blog")
@MapperScan(basePackages = "com.wyf.blog.repository.core.mapper")
public class DashboardControllerApplication {

    public static void main(String[] args) {
        SpringApplication.run(DashboardControllerApplication.class, args);
    }

}