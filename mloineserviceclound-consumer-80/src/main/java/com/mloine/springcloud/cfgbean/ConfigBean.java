package com.mloine.springcloud.cfgbean;

import com.netflix.loadbalancer.IRule;
import com.netflix.loadbalancer.RandomRule;
import com.netflix.loadbalancer.RetryRule;
import com.netflix.loadbalancer.RoundRobinRule;
import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.client.RestTemplate;

/**
 * @className: ConfigBean
 * @Description:TOO
 * @Author:mloine
 * @Date：2019/5/1613:27
 **/
@Configuration
public class ConfigBean {

    @LoadBalanced //基于ribbon实现客户端的负载均衡  很重要 相当于开启了springclound 客户端调用模式
    @Bean
    public RestTemplate getRestTemplate(){
        return new RestTemplate();
    }
    //路由算法调整 默认轮训
    @Bean
    public IRule myRule(){
        //return new RoundRobinRule () //轮询
        //return new RandomRule (); //随机
        return new RetryRule ();//档机 自动尝试其他服务实例
    }

}
