/**
 * 
 */
package com.qhit.lh.g4.wf.t3.dao;

import java.io.Serializable;
import java.util.List;

/**
 * @author 王飞
 *TODO
 *2017年12月16日上午11:36:21
 */
public interface BaseDao {
	public void add(Object object);
	public void delete(Object object);
	public void update(Object object);
	public Object getObjectById(Class clazz,Serializable id);
	public List<Object> queryAll(String sql);
}
