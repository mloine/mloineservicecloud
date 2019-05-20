package com.mloine.springcloud.cfgbean;

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

}
