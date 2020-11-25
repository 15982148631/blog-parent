package com.wyf.blog.all;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * @Author wyf
 * @ClassName AllApplication
 * @Description //TODO
 * @Date 2020/11/25 15:06
 * @Version 1.0.0
 */
@SpringBootApplication(scanBasePackages = { "com.wyf.blog" })
@MapperScan(basePackages = "com.wyf.blog.repository.**.mapper")
public class AllApplication {

//    /**
//     * MyBatis Plus 分页插件
//     * @return {@link PaginationInterceptor}
//     */
//    @Bean
//    public PaginationInterceptor paginationInterceptor() {
//        return new PaginationInterceptor();
//    }

    public static void main(String[] args) {
        SpringApplication.run(AllApplication.class, args);
    }
}
