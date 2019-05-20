DROP DATABASE IF EXISTS  CLOUD002;
CREATE  DATABASE CLOUD002 CHARACTER SET UTF8;
USE CLOUD002;
CREATE TABLE dept(
  deptno BIGINT(20) NOT NULL PRIMARY KEY AUTO_INCREMENT,
  dname varchar(60),
  db_source VARCHAR (60)
);


insert into dept(dname,db_source) values('开发部',DATABASE());
insert into dept(dname,db_source) values('人事部',DATABASE());
insert into dept(dname,db_source) values('财务部',DATABASE());
insert into dept(dname,db_source) values('市场部',DATABASE());
insert into dept(dname,db_source) values('运维部',DATABASE());

select * from dept;