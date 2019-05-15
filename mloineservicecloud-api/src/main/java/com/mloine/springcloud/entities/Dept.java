package com.mloine.springcloud.entities;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.Accessors;

import java.io.Serializable;

/**
  *@className: Dept   
  *@Description:TOO
  *@Author:mloine
  *@Date：2019/5/15 11:26
  **/
//@AllArgsConstructor
@NoArgsConstructor//
@Data//get set
@Accessors(chain=true)//链式写法
public class Dept implements Serializable{

    private static final long serialVersionUID = 4911277551202897392L;

    private Long deptno; // 主键
    private String dname; // 部门名称
    private String db_source;// 来自那个数据库，因为微服务架构可以一个服务对应一个数据库，同一个信息被存储到不同数据库

    public Dept(String dname) {
        this.dname = dname;
    }

}
