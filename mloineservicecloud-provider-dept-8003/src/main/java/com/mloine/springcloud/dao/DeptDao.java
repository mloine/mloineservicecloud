package com.mloine.springcloud.dao;

import com.mloine.springcloud.entities.Dept;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

/**
 * @className: DeptDao
 * @Description:TOO
 * @Author:mloine
 * @Date：2019/5/1516:46
 **/
@Mapper
//@Component
public interface DeptDao {

    public boolean addDept(Dept dept);

    public Dept findById(long id);

    public List<Dept> findAll();
}
