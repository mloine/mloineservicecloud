package com.mloine.springcloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EnableEurekaClient //表面eureka的客户端
@EnableDiscoveryClient //服务发现
public class MloineservicecloudConfigDept8001Application {

	public static void main(String[] args) {
		SpringApplication.run(MloineservicecloudConfigDept8001Application.class, args);
	}

}
