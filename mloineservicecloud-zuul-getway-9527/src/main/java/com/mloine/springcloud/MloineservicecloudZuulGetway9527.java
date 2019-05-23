package com.mloine.springcloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.netflix.zuul.EnableZuulProxy;
import org.springframework.cloud.netflix.zuul.EnableZuulServer;

/**
 * @className: MloineservicecloudZuulGetway9527
 * @Description:TOO   127.0.0.1	myzuul.com
 *
 *                 映射前：  http://myzuul.com:9527/mloineservicecloud-dept/dept/get/1
 *                 映射后：  http://myzuul.com:9527/mydept/dept/get/1
 *                 加前缀后： http://myzuul.com:9527/mloine/mydept/dept/get/1
 *
 * @Author:mloine
 * @Date：2019/5/2316:09
 **/
@SpringBootApplication
@EnableEurekaClient
@EnableZuulProxy
public class MloineservicecloudZuulGetway9527 {
    public static void main(String[] args) {
        SpringApplication.run(MloineservicecloudZuulGetway9527.class, args);
    }
}
