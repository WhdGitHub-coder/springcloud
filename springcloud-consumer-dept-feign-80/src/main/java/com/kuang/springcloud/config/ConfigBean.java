package com.kuang.springcloud.config;

import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.client.RestTemplate;

/**
 * @Author 翁煌
 * @Date2020/6/15 001511:43
 * @Description:
 * @Version1.0
 */
@Configuration
public class ConfigBean {

    //配置负载均衡实例RestTemplate
    @Bean
    @LoadBalanced  //Ribbon  加了loadbalanced就默认是轮询的机制
    public RestTemplate getRestTemplate(){
        return  new RestTemplate();
    }

//    Ribbon核心组件IRule  IRule：机制、规则，根据特定算法从服务列表中选取一个要访问的服务
//    @Bean
//    public IRule myRule(){
//        return  new WengRandomRule();  //设置随机机制（规则）
//    }

}
