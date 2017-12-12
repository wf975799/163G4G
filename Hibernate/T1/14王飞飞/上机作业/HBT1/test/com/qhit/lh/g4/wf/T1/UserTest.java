package com.qhit.lh.g4.wf.T1;

import org.hibernate.Hibernate;
import org.hibernate.Session;
import org.hibernate.Transaction;

import com.qhit.lh.g4.wf.T1.bean.User;
import com.qhit.lh.g4.wf.T1.utils.HibernateSessionFactory;

public class UserTest {

	public void addUser(){
		//声明实例化user对象
		User user=new User();
		user.setUname("red");
		user.setUpwd("123456");
		user.setBirthday("2017-1-9");
		user.setSex("f");
		user.setUenable(1);
		//获取session对象
		Session session=HibernateSessionFactory.getSession();
		//开启事务
		Transaction tx=session.beginTransaction();
		//操作对象，完成crud
		session.save(user);
		//提交事务
		tx.commit();
		//关闭session
		HibernateSessionFactory.closeSession();
	}
}
