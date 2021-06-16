package com.zxx.gs;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.openfeign.EnableFeignClients;
import org.springframework.context.annotation.Bean;
import org.springframework.web.client.RestTemplate;

@SpringBootApplication(scanBasePackages = "com.zxx.gs")
@MapperScan("com.zxx.gs.mapper")
@EnableEurekaClient
@EnableFeignClients
public class FeignServerApplication {
    public static void main(String[] args) {
        SpringApplication.run(FeignServerApplication.class,args);
    }

    @Bean
    @LoadBalanced//负载
    RestTemplate restTemplate(){
        return new RestTemplate();
    }


}
