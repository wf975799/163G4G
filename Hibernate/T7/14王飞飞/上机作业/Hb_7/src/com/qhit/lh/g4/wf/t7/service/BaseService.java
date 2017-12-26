package com.qhit.lh.g4.wf.t7.service;

import java.util.List;

import com.qhit.lh.g4.wf.t7.been.Emp;



public interface BaseService {

	/**
	 * 按员工姓名进行查询
	 * 
	 * */
	public List<Emp> getEmpname(String name);
	
	/**
	 * @param user
	 */
	public void add(Object obj);

	/**
	 * @param user
	 * @param i
	 */
	public void update(Object obj);

	/**
	 * @param user
	 */
	public void delete(Object obj);

	/**
	 * @param string
	 */
	public List<Object> queryAll(String fromStr);   
	
	/**
	 * @param string
	 */
	public Object getObjectById(Class clazz,int id);



	  
}
