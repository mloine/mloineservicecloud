package com.mloine.springcloud.service;

import com.mloine.springcloud.entities.Dept;
import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import java.util.List;
/**
  *@className: DeptClientService
  *@Description:TOO fegin客户端 接口形式
  *@Author:mloine
  *@Date：2019/5/21 14:32
  **/
//@FeignClient(value = "MLOINESERVICECLOUD-DEPT")
@FeignClient(value = "MLOINESERVICECLOUD-DEPT", fallbackFactory=DeptClientServiceFallbackFactory.class)
public interface DeptClientService {

    @RequestMapping(value = "/dept/add",method = RequestMethod.POST)
    public boolean addDept(Dept dept);

    @RequestMapping(value = "/dept/get/{id}",method = RequestMethod.GET)
    public Dept findById(@PathVariable("id") long id);

    @RequestMapping(value = "/dept/list",method = RequestMethod.GET)
    public List<Dept> findAll();

}
