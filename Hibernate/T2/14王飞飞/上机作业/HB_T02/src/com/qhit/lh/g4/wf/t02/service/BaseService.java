/**
 * 
 */
package com.qhit.lh.g4.wf.t02.service;

import java.util.List;

/**
 * @author 王飞
 *2017年12月15日
 */
public interface BaseService {

	public void add(Object object);
	public void delete(Object object);
	public void update(Object object);
	public List<Object> queryAll(String  fromStr);

}
