package com.mloine.springcloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
/**
  *@className: MloineservicecloudProviderDept8003Application
  *@Description:TOO
  *@Author:mloine
  *@Date：2019/5/23 16:26
  **/
@EnableEurekaClient
@EnableDiscoveryClient
@SpringBootApplication
public class MloineservicecloudProviderDept8003Application {

	public static void main(String[] args) {
		SpringApplication.run(MloineservicecloudProviderDept8003Application.class, args);
	}

}
