/**
 * 
 */
package com.qhit.lh.g4.wf.t3.service.impl;

import java.util.List;

import com.qhit.lh.g4.wf.t3.bean.TEmp;
import com.qhit.lh.g4.wf.t3.service.BaseService;

/**
 * @author 王飞
 *TODO
 *2017年12月16日上午14:16:11
 */
public class BaseServiceImpl implements BaseService {
	private BaseService baseService = new BaseServiceImpl();
	/* (non-Javadoc)
	 * @see com.qhit.lh.g4.perfact.t3.service.BaseService#add(java.lang.Object)
	 */
	@Override
	public void add(Object object) {
		// TODO Auto-generated method stub
		baseService.add(object);
	}

	/* (non-Javadoc)
	 * @see com.qhit.lh.g4.perfact.t3.service.BaseService#delete(java.lang.Object)
	 */
	@Override
	public void delete(Object object) {
		// TODO Auto-generated method stub
		baseService.delete(object);
	}

	/* (non-Javadoc)
	 * @see com.qhit.lh.g4.perfact.t3.service.BaseService#update(java.lang.Object)
	 */
	@Override
	public void update(Object object) {
		// TODO Auto-generated method stub
		baseService.update(object);
	}

	/* (non-Javadoc)
	 * @see com.qhit.lh.g4.perfact.t3.service.BaseService#queryAll(java.lang.String)
	 */
	@Override
	public List<Object> queryAll(String fromStr) {
		// TODO Auto-generated method stub
		return baseService.queryAll(fromStr);
	}

	/* (non-Javadoc)
	 * @see com.qhit.lh.g4.perfact.t3.service.BaseService#getObjectById(java.lang.Class, int)
	 */
	@Override
	public Object getObjectById(Class class1, int i) {
		// TODO Auto-generated method stub
		return baseService.getObjectById(class1, i);
	}

}
