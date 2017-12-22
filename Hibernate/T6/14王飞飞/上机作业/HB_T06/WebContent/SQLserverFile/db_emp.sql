create database db_emp;
use db_emp;
create table emp(
eid  int primary key identity(1,1),
ename varchar(20) not null,
esex varchar(2) not null,
ebirthday varchar(20) not null,
did int 
)

create table userinfo (
uid int primary key,
uname varchar(20) not null,
upwd varchar(20) not null
)

create table dept(
did int primary key identity(1,1),
dname varchar(20) not null,
daddress varchar(20) not null
)

create table role (
	roleId int primary key identity(1,1),
	roleName varchar(20) not null,
	memo varchar(20) not null
)

create table role_user(
	id int primary key identity(1,1),
	userId int ,
	roleId int
)
select * from emp;
select * from userinfo;
select * from dept;
select * from role;
select * from role_user;