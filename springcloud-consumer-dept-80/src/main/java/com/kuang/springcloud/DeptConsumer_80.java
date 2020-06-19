package com.kuang.springcloud;

import com.myrule.WengRule;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.netflix.ribbon.RibbonClient;

/**
 * @Author 翁煌
 * @Date2020/6/15 001512:44
 * @Description:
 * @Version1.0
 */
@SpringBootApplication
@EnableEurekaClient
//在微服务启动的时候就能去加载我们自定义ribbon类
@RibbonClient(name = "SPRINGCLOUD-PROVIDER-DEPT",configuration = WengRule.class)
public class DeptConsumer_80 {
    public static void main(String[] args) {
        SpringApplication.run(DeptConsumer_80.class,args);
    }
}
