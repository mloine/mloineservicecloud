package com.mloine.springcloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

/**
 * @className: MloineservicecloudConfigClient3355Application
 * @Description:TOO
 *                      127.0.0.1       activate.navicat.com

                        127.0.0.1	eureka7001.com
                        127.0.0.1	eureka7002.com
                        127.0.0.1	eureka7003.com

                        127.0.0.1	myzuul.com

                        127.0.0.1 	config3344.com
                        127.0.0.1	client-config.com
                        127.0.0.1	eureka-dev.com
                        127.0.0.1	eureka-test.com

 * @Author:mloine
 * @Date：2019/5/2814:03
 **/
@SpringBootApplication

public class MloineservicecloudConfigClient3355Application {
    public static void main(String[] args) {
        SpringApplication.run(MloineservicecloudConfigClient3355Application.class, args);
    }
}
