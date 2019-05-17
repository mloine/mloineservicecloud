package com.spring.clound;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@SpringBootApplication
@EnableEurekaServer
public class MloineservicecloudEureka7003Application {

	public static void main(String[] args) {
		SpringApplication.run(MloineservicecloudEureka7003Application.class, args);
	}

}
