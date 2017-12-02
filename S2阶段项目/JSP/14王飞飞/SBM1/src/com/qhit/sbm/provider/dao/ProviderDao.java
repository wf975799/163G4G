/**
 * 
 */
package com.qhit.sbm.provider.dao;

import java.util.List;

import com.qhit.sbm.provider.bean.Provider;


public interface ProviderDao {

	/**
	 * @return
	 * 查询所有的供应商
	 */
	public List<Provider> getProvider();
	
	public int addprovider(Provider provider);
}
