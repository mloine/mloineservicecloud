package com.mloine.springcloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.circuitbreaker.EnableCircuitBreaker;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@EnableEurekaClient
@EnableDiscoveryClient
@EnableCircuitBreaker  //开启hystrx熔断器
@SpringBootApplication
public class MloineservicecloudProviderDeptHystrix8001Application {

	public static void main(String[] args) {
		SpringApplication.run(MloineservicecloudProviderDeptHystrix8001Application.class, args);
	}

}
