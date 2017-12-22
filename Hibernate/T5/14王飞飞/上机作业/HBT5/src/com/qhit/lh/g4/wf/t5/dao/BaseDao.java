/**
 * 
 */
package com.qhit.lh.g4.wf.t5.dao;

import java.util.List;



/**
 * @author 王飞
 *2017-12-19下午4:07:48
 * TODO
 */
public interface BaseDao {

	
	public void add(Object obj);
	public void delete(Object obj);
	public void update(Object obj);
	public List<Object> queryAll(String  tableName);
	
	public Object getObjectById(Class clazz, int id);
	
}
