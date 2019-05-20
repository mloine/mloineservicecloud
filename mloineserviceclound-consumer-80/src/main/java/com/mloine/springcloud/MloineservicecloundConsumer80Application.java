package com.mloine.springcloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.DiscoveryClient;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.netflix.ribbon.RibbonClient;

@SpringBootApplication
//@EnableDiscoveryClient
@EnableEurekaClient
@RibbonClient(name = "MLOINESERVICECLOUD-DEPT" )
public class MloineservicecloundConsumer80Application {

	public static void main(String[] args) {
		SpringApplication.run(MloineservicecloundConsumer80Application.class, args);
	}


}
