package com.qhit.lh.g4.wf.t7.action;

import java.io.InputStream;

import org.apache.struts2.ServletActionContext;

import com.opensymphony.xwork2.ActionSupport;

public class FileDownAction extends ActionSupport {

	// ���ص��ļ���
	private String filename;
	// ���ص��ļ����ڵ�Ŀ¼ filedown
	private String inputpath;

	public String getInputpath() {
		return inputpath;
	}

	public void setInputpath(String inputpath) {
		this.inputpath = inputpath;
	}

	public String getFilename() {
		return filename;
	}

	public void setFilename(String filename) {
		this.filename = filename;
	}

	// ִ������ʱ,��ͻ�����ļ�
	public InputStream getInputStream() {		
		String fileurl = this.getInputpath() + "/" + this.getFilename();
		System.out.println(fileurl);
		return ServletActionContext.getServletContext().getResourceAsStream(
				fileurl);

	}	
	@Override
	public String execute() throws Exception {
		// TODO Auto-generated method stub
		return super.execute();
	}

}
