package com.mloine.springcloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.SpringBootConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.hystrix.dashboard.EnableHystrixDashboard;

/**
 * @author mloine
 * @title: mloineservicecloudConsumerHystrixDashboradApplication
 * @projectName mloineservicecloud
 * @description: TODO  http://127.0.0.1:9001/hystrix  监控地址
 *
 *                  http://127.0.0.1:8001/hystrix.stream  时时监控测试地址例子
 * @date 2019/5/2223:29
 */
@SpringBootApplication
@EnableHystrixDashboard  //豪猪 监控启动
public class mloineservicecloudConsumerHystrixDashboradApplication {
    public static void main(String[] args) {
        SpringApplication.run(mloineservicecloudConsumerHystrixDashboradApplication.class, args);
    }
}
