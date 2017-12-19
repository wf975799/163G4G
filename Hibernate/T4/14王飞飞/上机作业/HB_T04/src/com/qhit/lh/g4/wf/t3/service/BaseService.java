/**
 * 
 */
package com.qhit.lh.g4.wf.t3.service;

import java.util.List;

import com.qhit.lh.g4.perfact.t3.bean.TDept;
import com.qhit.lh.g4.perfact.t3.bean.TEmp;

/**
 * @author 王飞
 *TODO
 *2017年12月16日下午13:52:31
 */
public interface BaseService {
	public void add(Object object);
	public void delete(Object object);
	public void update(Object object);
	public List<Object> queryAll(String  fromStr);
	/**
	 * @param class1
	 * @param i
	 * @return
	 */
	public Object getObjectById(Class class1, int i);

}