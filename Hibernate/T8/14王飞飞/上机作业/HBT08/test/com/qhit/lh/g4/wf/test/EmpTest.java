/**
 * 
 */
package com.qhit.lh.g4.wf.test;

import static org.junit.Assert.*;

import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.FetchMode;
import org.hibernate.Session;
import org.hibernate.criterion.Restrictions;
import org.junit.Test;

import com.qhit.lh.g4.wf.t8.bean.Emp;
import com.qhit.lh.g4.wf.t8.service.DaseService;
import com.qhit.lh.g4.wf.t8.service.impl.BaseServiceImpl;
import com.qhit.lh.g4.wf.t8.util.HibernateSessionFactory;
/**
 * @author 王飞
 *TODO
 *2017年12月26日下午15:50:55
 */
public class EmpTest {
	private DaseService baseservice = new BaseServiceImpl();

	@Test
	public void getEmpByName() {
		List<Emp> eee = baseservice.getEmpByName("杨%");
		for (Emp emp : eee) {
			System.out.println(emp.getEid()+":"+emp.getEname());
		}

	}


	@Test
	public void add() {
		//新建角色
		Emp emp = new Emp();
		emp.setEname("山驴");
		emp.setEsex("M");
		emp.setEbirthday("1977-09-27");
		baseservice.add(emp);
	}
	/*
	 * QBC基本查询
	 * */
	@Test
	public void getEmplikeByName() {
		//获取session对象
		Session session = HibernateSessionFactory.getSession();
		//获取条件查询器
		Criteria criteria = session.createCriteria(Emp.class)
				.add(Restrictions.like("ename", "A%"));
		//执行查询
		List<Emp> list = criteria.list();
		//遍历查询
		for (Emp emp : list) {
			System.out.println(emp.getEid()+":"+emp.getEname());
		}
	}

	/*
	 * QBC连接查询
	 * */
	@Test
	public void getEmpByDeptName() {
		//获取session对象
		Session session = HibernateSessionFactory.getSession();
		//获取条件查询器
		Criteria criteria = session.createCriteria(Emp.class)
				.setFetchMode("dept", FetchMode.JOIN)
				.createAlias("dept", "d")
				.add(Restrictions.eq("d.dname", "外交部"));
		//执行查询
		List<Emp> list = criteria.list();
		//遍历查询
		for (Emp emp : list) {
			System.out.println(emp.getEid()+":"+emp.getEname());
		}


	}
}
