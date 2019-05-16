package com.mloine.springcloud.controller;

import com.mloine.springcloud.entities.Dept;
import com.mloine.springcloud.service.DeptService;
import org.springframework.beans.factory.annotation.Autowired;
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

    @RequestMapping(value = "/dept/add" ,method = RequestMethod.POST)
    public boolean add(@RequestBody Dept dept){
        return  deptService.addDept (dept);
    }


    @RequestMapping(value = "/dept/get/{id}" ,method = RequestMethod.GET)
    public Dept get(@PathVariable("id") long id){
        return  deptService.findById (id);
    }


    @RequestMapping(value = "/dept/list" ,method = RequestMethod.GET)
    public List<Dept> list(){
        return  deptService.findAll ();
    }
}
