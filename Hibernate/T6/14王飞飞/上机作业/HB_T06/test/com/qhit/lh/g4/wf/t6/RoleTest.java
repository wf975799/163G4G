/**
 * 
 */
package com.qhit.lh.g4.wf.t6;

import static org.junit.Assert.*;

import org.junit.Test;

import com.qhit.lh.g4.wf.t6.bean.Role;
import com.qhit.lh.g4.wf.t6.bean.Userinfo;
import com.qhit.lh.g4.wf.t6.service.DaseService;
import com.qhit.lh.g4.wf.t6.service.impl.BaseServiceImpl;

/**
 * @author 王飞
 *TODO
 *2017年12月20日下午5:20:48
 */
public class RoleTest {
	DaseService baseservice = new BaseServiceImpl();
	@Test
	public void add() {
		//新建角色
		Role role = new Role();
		role.setRoleName("网易云经理");
		role.setMemo("CEO");
		//分配账户
		Userinfo userinfo = (Userinfo) baseservice.getObjectById(Userinfo.class, 1);
		//建立多对多关联
		role.getUser().add(userinfo);
		
		baseservice.add(role);
	}
	@Test
	public void delete() {
		Role role = (Role) baseservice.getObjectById(Role.class, 1);
		baseservice.delete(role);
	}
	@Test
	public void update() {
		Role role = (Role) baseservice.getObjectById(Role.class, 1);
		role.setMemo("执行官");
		Userinfo alice = (Userinfo) baseservice.getObjectById(Userinfo.class, 2);
		Userinfo anlsnde = (Userinfo) baseservice.getObjectById(Userinfo.class, 5);
		role.getUser().add(alice);
		role.getUser().add(anlsnde);
		baseservice.update(role);
	}
	@Test
	public void query() {
		Role role = (Role) baseservice.getObjectById(Role.class, 2);
		for (Userinfo userinfo : role.getUser()) {
			System.out.println(role.getRoleName()+":"+userinfo.getUname());
		}
	}

}
