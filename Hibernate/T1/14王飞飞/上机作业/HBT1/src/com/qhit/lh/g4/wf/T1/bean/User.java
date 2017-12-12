package com.qhit.lh.g4.wf.T1.bean;

import java.util.Date;

public class User {
	private int id;
	private String uname;
	private String upwd;
	private String birthday;
	private String sex;
	private int uenable;
	
	public User() {
		super();
	}
	public User(String uname, String upwd, String birthday, String sex, int uenable) {
		super();
		this.uname = uname;
		this.upwd = upwd;
		this.birthday = birthday;
		this.sex = sex;
		this.uenable = uenable;
	}
	public User(int id, String uname, String upwd, String birthday, String sex, int uenable) {
		super();
		this.id = id;
		this.uname = uname;
		this.upwd = upwd;
		this.birthday = birthday;
		this.sex = sex;
		this.uenable = uenable;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getUname() {
		return uname;
	}
	public void setUname(String uname) {
		this.uname = uname;
	}
	public String getUpwd() {
		return upwd;
	}
	public void setUpwd(String upwd) {
		this.upwd = upwd;
	}
	public String getBirthday() {
		return birthday;
	}
	public void setBirthday(String birthday) {
		this.birthday = birthday;
	}
	public String getSex() {
		return sex;
	}
	public void setSex(String sex) {
		this.sex = sex;
	}
	public int getUenable() {
		return uenable;
	}
	public void setUenable(int uenable) {
		this.uenable = uenable;
	}
	@Override
	public String toString() {
		return "User [id=" + id + ", uname=" + uname + ", upwd=" + upwd + ", birthday=" + birthday + ", sex=" + sex
				+ ", uenable=" + uenable + "]";
	}
	
	
}
