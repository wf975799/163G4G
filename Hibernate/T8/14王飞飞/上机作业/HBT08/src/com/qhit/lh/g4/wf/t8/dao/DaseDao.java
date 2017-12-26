/**
 * 
 */
package com.qhit.lh.g4.wf.t8.dao;

import java.io.Serializable;
import java.util.List;

import com.qhit.lh.g4.wf.t8.bean.Emp;

/**
 * @author 王飞
 *TODO
 *2017年12月26日下午15:40:33
 */
public interface DaseDao {
	//添加
	public void add(Object obj);
	//删除
	public void delete(Object obj);
	//修改
	public void update(Object obj);
	//查询
	public Object getObjectById(Class clazz,Serializable id);
	//遍历查询
	public List query(String fromStr);
	
	public List<Emp> getEmpByName(String name);
}
