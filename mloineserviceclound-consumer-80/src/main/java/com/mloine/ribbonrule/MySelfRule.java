package com.mloine.ribbonrule;

import com.netflix.loadbalancer.*;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * @className: MySelfRule
 * @Description:TOO
 * @Author:mloine
 * @Date：2019/5/2017:35
 **/
@Configuration
public class MySelfRule {

    @Bean
    public IRule myRule(){
        //new RoundRobinRule ();
        new RandomRule ();
        //return new RandomRule ();
        return new MyRoundRobinRule();
    }
}
