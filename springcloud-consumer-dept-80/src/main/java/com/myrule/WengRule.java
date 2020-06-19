package com.myrule;

import com.netflix.loadbalancer.IRule;
import com.netflix.loadbalancer.RandomRule;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * @Author 翁煌
 * @Date2020/6/16 001619:32
 * @Description: 不放在与启动类同目录下，是因为官方规定，只要就只针对某一微服务，如果放在同一目录，则是全局的。
 * @Version1.0
 */
@Configuration
public class WengRule {

    @Bean
    public IRule myRule(){
        return  new WengRandomRule();//默认是轮询，现在我们定义为~ WengRandomRule
    }
}
