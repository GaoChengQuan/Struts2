package com.situ.struts.upload;

import java.io.File;

import org.apache.commons.io.FileUtils;
import org.apache.struts2.ServletActionContext;

import com.opensymphony.xwork2.ActionSupport;
import com.situ.struts.pojo.User;

public class FileUploadAction extends ActionSupport{
	private User user;
	/*<input type="file" name="file1">*/
	private File file1;
	//文件名
	private String file1FileName;
	// 文件的类型(MIME)(要求必须后面是ContentType)
	private String file1ContentType;


	@Override
	public String execute() throws Exception {
		System.out.println(user);
		
		//获得上传目录的路径upload
		String uploadPath = ServletActionContext.getServletContext().getRealPath("/upload");
		//创建目标文件对象
		File destFile = new File(uploadPath, file1FileName);
		FileUtils.copyFile(file1, destFile);
		
		return SUCCESS;
	}
	
	public User getUser() {
		return user;
	}

	public void setUser(User user) {
		this.user = user;
	}

	public void setFile1(File file1) {
		this.file1 = file1;
	}

	public void setFile1FileName(String file1FileName) {
		this.file1FileName = file1FileName;
	}

	public void setFile1ContentType(String file1ContentType) {
		this.file1ContentType = file1ContentType;
	}
	
	
}
