/**
 * 
 */
package com.qhit.lh.g4.wf.t6.service;

import java.io.Serializable;
import java.util.List;

/**
 * @author 王飞
 *TODO
 *2017年12月20日下午3:50:13
 */
public interface DaseService {
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
}
