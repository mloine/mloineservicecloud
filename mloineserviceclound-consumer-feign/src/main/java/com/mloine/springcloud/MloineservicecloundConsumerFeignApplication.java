package com.mloine.springcloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.netflix.feign.EnableFeignClients;
import org.springframework.cloud.netflix.ribbon.RibbonClient;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@EnableEurekaClient
@EnableFeignClients(basePackages ={"com.mloine.springcloud"})
@ComponentScan("com.mloine.springcloud")
public class MloineservicecloundConsumerFeignApplication {

	public static void main(String[] args) {
		SpringApplication.run(MloineservicecloundConsumerFeignApplication.class, args);
	}

}
