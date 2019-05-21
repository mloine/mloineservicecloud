package com.mloine.ribbonrule;

import com.netflix.client.config.IClientConfig;
import com.netflix.loadbalancer.AbstractLoadBalancerRule;
import com.netflix.loadbalancer.ILoadBalancer;
import com.netflix.loadbalancer.RoundRobinRule;
import com.netflix.loadbalancer.Server;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.List;
import java.util.Random;
import java.util.concurrent.atomic.AtomicInteger;

/**
 * @className: MyRoundRobinRule
 * @Description:TOO
 * @Author:mloine
 * @Date：2019/5/2111:29
 **/
public class MyRoundRobinRule extends AbstractLoadBalancerRule {

    //total = 0 //total = 5 指针才能往下走
    //index = 0 //当前服务器地址

    private int total = 0;
    private int currentIndex = 0;

    public MyRoundRobinRule() {

    }

    @SuppressWarnings({"RCN_REDUNDANT_NULLCHECK_OF_NULL_VALUE"})
    public Server choose(ILoadBalancer lb, Object key) {
        if (lb == null) {
            return null;
        } else {
            Server server = null;

            while(server == null) {
                if (Thread.interrupted()) {
                    return null;
                }

                List<Server> upList = lb.getReachableServers();
                List<Server> allList = lb.getAllServers();
                int serverCount = allList.size();
                if (serverCount == 0) {
                    return null;
                }

                if(total <5){
                    server = upList.get (currentIndex);
                    total++;
                }else{
                    total = 0;
                    currentIndex++;
                    if(currentIndex>=upList.size ()){
                        currentIndex = 0;
                    }
                }
                if (server == null) {
                    Thread.yield();
                } else {
                    if (server.isAlive()) {
                        return server;
                    }

                    server = null;
                    Thread.yield();
                }
            }

            return server;
        }
    }

    public Server choose(Object key) {
        return this.choose(this.getLoadBalancer(), key);
    }

    public void initWithNiwsConfig(IClientConfig clientConfig) {
    }
}