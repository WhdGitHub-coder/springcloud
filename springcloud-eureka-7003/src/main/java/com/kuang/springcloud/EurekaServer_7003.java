package com.kuang.springcloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

/**
 * @Author 翁煌
 * @Date2020/6/15 001513:46
 * @Description:
 * @Version1.0
 */
@SpringBootApplication
@EnableEurekaServer  //服务端的启动 接受其他微服务注册进来！
public class EurekaServer_7003 {
    public static void main(String[] args) {
        SpringApplication.run(EurekaServer_7003.class,args);
    }
}
