package com.mloine.springcloud.service;

import com.mloine.springcloud.entities.Dept;
import feign.hystrix.FallbackFactory;
import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.stereotype.Component;
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
@Component //不要忘记添加
public class DeptClientServiceFallbackFactory implements FallbackFactory<DeptClientService>{


    @Override
    public DeptClientService create(Throwable throwable) {
        return new DeptClientService () {
            @Override
            public boolean addDept(Dept dept) {
                return false;
            }

            @Override
            public Dept findById(long id) {
                return new Dept ().setDeptno (id).setDname ("该id"+id+"没有对应的信息,null -- 工厂解耦 此刻服务已经关闭").setDb_source ("no this database in mysql");
            }

            @Override
            public List<Dept> findAll() {
                return null;
            }
        };
    }
}
