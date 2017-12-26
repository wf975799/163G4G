/**
 * 
 */
package com.qhit.lh.g4.wf.t8.dao.impl;

import java.io.Serializable;
import java.util.List;

import org.hibernate.Session;
import org.hibernate.Transaction;
import org.hibernate.Query;

import com.qhit.lh.g4.wf.t8.bean.Emp;
import com.qhit.lh.g4.wf.t8.dao.DaseDao;
import com.qhit.lh.g4.wf.t8.util.HibernateSessionFactory;

/**
 * @author 王飞
 * TODO
 *2017年12月26日下午15:36:46
 */
public class DaseDaoImpl implements DaseDao {

	@Override
	public void add(Object obj) {
		// TODO Auto-generated method stub
        //获取session对象
		Session session = HibernateSessionFactory.getSession();
        //开启 Hibernate事务
		Transaction tx = session.beginTransaction();
        //操作对象
		session.save(obj);
        //提交事务
		tx.commit();
        //关闭session
		HibernateSessionFactory.closeSession();			
	}

	@Override
	public void update(Object obj) {
		// TODO Auto-generated method stub
        //获取session对象
		Session session = HibernateSessionFactory.getSession();
        //开启 Hibernate事务
		Transaction tx = session.beginTransaction();
        //操作对象
		obj = session.get(obj.getClass(), session);
		session.save(obj);
        //提交事务
		tx.commit();
        //关闭session
		HibernateSessionFactory.closeSession();			
	}

	@Override
	public void delete(Object obj) {
		// TODO Auto-generated method stub
        //获取session对象
		Session session = HibernateSessionFactory.getSession();
        //开启 Hibernate事务
		Transaction tx = session.beginTransaction();
        //操作对象
		session.save(obj);
        //提交事务
		tx.commit();
        //关闭session
		HibernateSessionFactory.closeSession();			
	}

	@Override
	public List<Object> query(String fromStr) {
		// TODO Auto-generated method stub
        //获取session对象
		Session session = HibernateSessionFactory.getSession();
        //开启 Hibernate事务
		Transaction tx = session.beginTransaction();
		Query query = session.createQuery(fromStr);
        //查询
		List<Object> list = query.list();
        //提交事务
		tx.commit();
        //关闭session
		HibernateSessionFactory.closeSession();	
		return null;
	}


	/* (non-Javadoc)
	 * @see com.qhit.lh.g4.lkj.t8.dao.DaseDao#getObjectById(java.lang.Class, java.io.Serializable)
	 */
	@Override
	public Object getObjectById(Class clazz, Serializable id) {
		// TODO Auto-generated method stub
		// TODO Auto-generated method stub
        //获取session对象
		Session session = HibernateSessionFactory.getSession();
        //开启 Hibernate事务
		Transaction tx = session.beginTransaction();
        //操作对象
		Object obj = session.get(clazz,id);
        //提交事务
		tx.commit();
        //关闭session
		HibernateSessionFactory.closeSession();
		return obj;
	}

	/* (non-Javadoc)
	 * @see com.qhit.lh.g4.lkj.t8.dao.DaseDao#GetEmpByName(java.lang.String)
	 */
	@Override
	public List<Emp> getEmpByName(String name) {
		// TODO Auto-generated method stub
		Session session = HibernateSessionFactory.getSession();
		String hql = "select e form Emp e where e.ename like : name";
		Query query = session.createQuery(hql);
		query.setString("name", name);
		return query.list();
	}

}
