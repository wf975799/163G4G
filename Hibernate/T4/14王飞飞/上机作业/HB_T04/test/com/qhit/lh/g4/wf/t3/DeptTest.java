	/**
 * 
 */
package com.qhit.lh.g4.wf.t3;

import static org.junit.Assert.*;

import org.junit.Test;

import com.qhit.lh.g4.wf.t3.bean.TDept;
import com.qhit.lh.g4.wf.t3.bean.TEmp;
import com.qhit.lh.g4.wf.t3.bean.TUserinfo;
import com.qhit.lh.g4.wf.t3.service.BaseService;
import com.qhit.lh.g4.wf.t3.service.impl.BaseServiceImpl;

/**
 * @author 王飞
 *TODO
 *2017年12月16日下午16:36:21
 */
public class DeptTest {
	private BaseService baseService = new BaseServiceImpl();
	@Test
	public void add() {
		TDept dept = new TDept();
		dept.setDeptName("国防部");
		dept.setAdrress("北京");
		
		TEmp emp1 = (TEmp)baseService.getObjectById(TEmp.class,15);
		dept.getEmps().add(emp1);
		TEmp emp2 = new TEmp();
		emp2.setEmpName("QQ");
		emp2.setEmpSex("M");
		emp2.setBrithday("1984-5-3");
		
		TUserinfo userinfo = new TUserinfo();
		userinfo.setUserName("qq");
		userinfo.setUserPwd("123456");
		emp2.setTuserinfo(userinfo);
		userinfo.setTemp(emp2);
		baseService.add(emp2);
		emp2 =(TEmp) baseService.getObjectById(TEmp.class, 16);
		dept.getEmps().add(emp2);
		
		baseService.add(dept);
	}
	@Test
	public void delete() {
		TDept dept =(TDept)baseService.getObjectById(TDept.class, 5);
		baseService.delete(dept);
	}
	@Test
	public void update() {
		TDept dept =(TDept)baseService.getObjectById(TDept.class, 5);
		dept.setAdrress("拉斯维加斯");
		baseService.update(dept);
	}
	@Test
	public void query() {
		
	}

}
