package com.mloine.springcloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.config.server.EnableConfigServer;

/**
 * @className: MloineservicespringcloudConfig3344Application
 * @Description:TOO
 *               修改host文件   127.0.0.1 config3344.com
 *               http://config3344.com:3344/application-dev.yml
 *               http://config3344.com:3344/application-test.yml
 *
 *               http://config3344.com:3344/application/dev/master
 *               http://config3344.com:3344/master/application-dev.yml
 * @Author:mloine
 * @Date：2019/5/2413:42
 **/
@SpringBootApplication
@EnableConfigServer //启动cloudconfig 服务端口
public class MloineservicespringcloudConfig3344Application {

    public static void main(String[] args) {
        SpringApplication.run(MloineservicespringcloudConfig3344Application.class, args);
    }
}
