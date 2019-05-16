package com.mloine.springcloud.controller;

import com.mloine.springcloud.entities.Dept;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import java.util.List;

/**
 * @className: DeptController_Consumer
 * @Description:TOO
 * @Author:mloine
 * @Date：2019/5/1613:35
 **/
@RestController
public class DeptController_Consumer {

    private static final String REST_URL_PREFIX = "http://127.0.0.1:8001";

    @Autowired
    private RestTemplate restTemplate;

    @RequestMapping(value="/consumer/dept/add")
    public boolean add(Dept dept){
       return restTemplate.postForObject (REST_URL_PREFIX + "/dept/add",dept,Boolean.class);
    }

    @RequestMapping(value="/consumer/dept/get/{id}")
    public Dept get(@PathVariable("id") long id){
        return restTemplate.getForObject (REST_URL_PREFIX + "/dept/get/"+ id ,Dept.class);
    }

    @RequestMapping(value="/consumer/dept/list")
    public List<Dept> list(){
        return restTemplate.getForObject (REST_URL_PREFIX + "/dept/list" ,List.class);
    }

}
