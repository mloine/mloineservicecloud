package com.mloine.springcloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@SpringBootApplication
@EnableEurekaServer
public class MloineservicecloudEureka7002Application {

	public static void main(String[] args) {
		SpringApplication.run(MloineservicecloudEureka7002Application.class, args);
	}

}
