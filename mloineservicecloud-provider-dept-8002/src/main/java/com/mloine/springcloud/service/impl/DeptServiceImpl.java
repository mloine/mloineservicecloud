package com.mloine.springcloud.service.impl;

import com.mloine.springcloud.entities.Dept;
import com.mloine.springcloud.dao.DeptDao;
import com.mloine.springcloud.service.DeptService;
import lombok.Data;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @className: DeptServiceImpl
 * @Description:TOO
 * @Author:mloine
 * @Date：2019/5/1612:39
 **/
@Service
@Data
public class DeptServiceImpl implements DeptService {

    @Autowired
    private DeptDao deptDao;

    @Override
    public boolean addDept(Dept dept) {

        return deptDao.addDept (dept);
    }

    @Override
    public Dept findById(long id) {
        return deptDao.findById (id);
    }

    @Override
    public List<Dept> findAll() {
        return deptDao.findAll ();
    }
}
