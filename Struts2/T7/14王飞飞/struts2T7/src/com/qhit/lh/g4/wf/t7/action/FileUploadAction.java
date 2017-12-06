package com.qhit.lh.g4.wf.t7.action;

import java.io.File;

import org.apache.commons.io.FileUtils;

import com.opensymphony.xwork2.Action;
import com.opensymphony.xwork2.ActionSupport;

public class FileUploadAction extends ActionSupport {

	private File filename;
	private String filenameFileName;
	private String filenameContentType;

	public String getFilenameFileName() {
		return filenameFileName;
	}

	public void setFilenameFileName(String filenameFileName) {
		this.filenameFileName = filenameFileName;
	}

	public String getFilenameContentType() {
		return filenameContentType;
	}

	public void setFilenameContentType(String filenameContentType) {
		this.filenameContentType = filenameContentType;
	}

	public File getFilename() {
		return filename;
	}

	public void setFilename(File filename) {
		this.filename = filename;
	}

	public String execute() throws Exception {
		// TODO Auto-generated method stub
		FileUtils.copyFile(filename, new File("D:\\upload", filenameFileName));
		return Action.SUCCESS;
	}

}
