package com.kuang.springcloud.Controller;

import com.kuang.springcloud.pojo.Dept;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import java.util.List;

/**
 * @Author 翁煌
 * @Date2020/6/15 001511:40
 * @Description:
 * @Version1.0
 */
@RestController
public class DeptConsumerController {
    //    消费者不用服务，没有service层
    // RestTemplate .... 供我们直接调用就可以了！ 注册到Spring中
    // (url, 实体：Map ,Class<T> responseType)
    @Autowired
    private RestTemplate restTemplate; //提供多种便捷访问远程http服务的方法，简单的Restful服务模板~

//    private static final String REST_PREFIX="http://localhost:8001";
    //Ribbon 我们这里的地址，应该是一个变量，通过服务名来访问
    private static final String REST_PREFIX="http://SPRINGCLOUD-PROVIDER-DEPT";
    @RequestMapping("/consumer/dept/add")
    public boolean add(Dept dept){
        return restTemplate.postForObject(REST_PREFIX+"/dept/add",dept,Boolean.class);
    }

    @RequestMapping("/consumer/dept/get/{id}")
    public Dept get(@PathVariable("id") Long id){
        return restTemplate.getForObject(REST_PREFIX+"/dept/get/"+id,Dept.class);
    }


    @RequestMapping("/consumer/dept/list")
    public List<Dept> list(){
        return restTemplate.getForObject(REST_PREFIX+"/dept/list", List.class);
    }

    @GetMapping("/consumer/dept/discovery")
    public Object discovery(){
        return restTemplate.getForObject(REST_PREFIX+"/dept/discovery",Object.class);
    }
}
