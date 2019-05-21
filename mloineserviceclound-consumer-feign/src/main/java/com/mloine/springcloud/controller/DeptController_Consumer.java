package com.mloine.springcloud.controller;

import com.mloine.springcloud.entities.Dept;
import com.mloine.springcloud.service.DeptClientService;
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

    @Autowired
    private DeptClientService deptClientService;

    @RequestMapping(value="/consumer/dept/add")
    public boolean add(Dept dept){
        return deptClientService.addDept (dept);
    }

    @RequestMapping(value="/consumer/dept/get/{id}")
    public Dept get(@PathVariable("id") long id){
        return deptClientService.findById (id);
    }

    @RequestMapping(value="/consumer/dept/list")
    public List<Dept> list(){
        return deptClientService.findAll ();
    }


}
