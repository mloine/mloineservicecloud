package com.mloine.springcloud.controller;

import com.mloine.springcloud.entities.Dept;
import com.mloine.springcloud.service.DeptService;
import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.client.ServiceInstance;
import org.springframework.cloud.client.discovery.DiscoveryClient;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * @className: DeptController
 * @Description:TOO
 * @Author:mloine
 * @Date：2019/5/1612:47
 **/

@RestController
public class DeptController {

    @Autowired
    private DeptService deptService;

    @Autowired
    private DiscoveryClient discoveryClient;

    @RequestMapping(value = "/dept/add" ,method = RequestMethod.POST)
    public boolean add(@RequestBody Dept dept){
        return  deptService.addDept (dept);
    }

    //一旦方法出现异常 调用fallbackMethod处理 也返回一个参数！！！！！！！！ 防止微服务依赖 导致服务雪崩
    @HystrixCommand(fallbackMethod = "processHystrix_Get")
    @RequestMapping(value = "/dept/get/{id}" ,method = RequestMethod.GET)
    public Dept get(@PathVariable("id") long id){

        Dept byId = deptService.findById (id);

        if(null == byId){
            throw  new RuntimeException ("改id："+id+"没有对应的信息");
        }
        return byId;
    }

    public Dept processHystrix_Get(@PathVariable("id") long id){
        return new Dept ().setDeptno (id).setDname ("该id"+id+"没有对应的信息,null -- @HystrixCommand").setDb_source ("no this database in mysql");
    }


    @RequestMapping(value = "/dept/list" ,method = RequestMethod.GET)
    public List<Dept> list(){
        return  deptService.findAll ();
    }

    @RequestMapping(value = "/dept/discovery", method = RequestMethod.GET)
    public Object discovery()
    {
        List<String> list = discoveryClient.getServices();
        System.out.println("**********" + list);

        List<ServiceInstance> srvList = discoveryClient.getInstances("MLOINESERVICECLOUD-DEPT");
        for (ServiceInstance element : srvList) {
            System.out.println(element.getServiceId() + "\t" + element.getHost() + "\t" + element.getPort() + "\t"
                    + element.getUri());
        }
        return this.discoveryClient;
    }
}
