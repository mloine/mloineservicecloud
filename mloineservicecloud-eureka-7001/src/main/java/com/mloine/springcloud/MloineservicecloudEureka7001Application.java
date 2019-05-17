package com.mloine.springcloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@SpringBootApplication
@EnableEurekaServer //表名自己是个eureka注册中心
public class MloineservicecloudEureka7001Application {

	public static void main(String[] args) {
		SpringApplication.run(MloineservicecloudEureka7001Application.class, args);
	}

}
