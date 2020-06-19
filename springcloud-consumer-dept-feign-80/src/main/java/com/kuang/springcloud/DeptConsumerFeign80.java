package com.kuang.springcloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.netflix.ribbon.RibbonClient;
import org.springframework.cloud.openfeign.EnableFeignClients;

/**
 * @Author 翁煌
 * @Date2020/6/15 001512:44
 * @Description:
 * @Version1.0
 */
@SpringBootApplication
@EnableEurekaClient
@EnableFeignClients(basePackages = {"com.kuang.springcloud"})
public class DeptConsumerFeign80 {
    public static void main(String[] args) {
        SpringApplication.run(DeptConsumerFeign80.class,args);
    }
}
