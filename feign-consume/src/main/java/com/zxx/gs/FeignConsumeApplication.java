package com.zxx.gs;

import com.zxx.gs.controller.LabourProjectController;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.openfeign.EnableFeignClients;

@SpringBootApplication(scanBasePackageClasses = LabourProjectController.class)
@EnableEurekaClient
@EnableFeignClients("com.zxx.gs.service")
public class FeignConsumeApplication {
    public static void main(String[] args) {
        SpringApplication.run(FeignConsumeApplication.class,args);
    }
}
