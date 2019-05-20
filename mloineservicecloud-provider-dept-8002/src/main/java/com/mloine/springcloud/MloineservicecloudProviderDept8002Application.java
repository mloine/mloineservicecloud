package com.mloine.springcloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
@EnableDiscoveryClient
@EnableEurekaClient
@SpringBootApplication
public class MloineservicecloudProviderDept8002Application {

	public static void main(String[] args) {
		SpringApplication.run(MloineservicecloudProviderDept8002Application.class, args);
	}

}
