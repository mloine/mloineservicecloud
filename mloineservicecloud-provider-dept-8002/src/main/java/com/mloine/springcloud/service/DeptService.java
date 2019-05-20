package com.mloine.springcloud.service;

import com.mloine.springcloud.entities.Dept;

import java.util.List;

public interface DeptService {

    public boolean addDept(Dept dept);

    public Dept findById(long id);

    public List<Dept> findAll();
}
