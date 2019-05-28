package com.mloine.springcloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

/**
  *@className: MloineservicecloudEureka7001Application
  *@Description:TOO  	 修改host文件 做域名映射  集群
 * 						127.0.0.1	eureka7001.com
						127.0.0.1	eureka7002.com
						127.0.0.1	eureka7003.com
  *@Author:mloine
  *@Date：2019/5/17 16:58
  **/
@SpringBootApplication
@EnableEurekaServer //表名自己是个eureka注册中心
public class MloineservicecloudConfigEurekaClient7001Application {

	public static void main(String[] args) {
		SpringApplication.run(MloineservicecloudConfigEurekaClient7001Application.class, args);
	}

}
