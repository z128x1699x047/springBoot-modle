package com.zxx.gs;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication(scanBasePackages = "com.zxx.gs")
@MapperScan("com.zxx.gs.mapper")
public class DruidApplication {
    public static void main(String[] args) {
        SpringApplication.run(DruidApplication.class,args);
    }
}
