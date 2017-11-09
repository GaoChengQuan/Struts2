package com.situ.struts.controller;

import java.util.List;

import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionSupport;
import com.situ.struts.pojo.Admin;
import com.situ.struts.pojo.Student;
import com.situ.struts.service.IAdminService;
import com.situ.struts.service.IStudentService;
import com.situ.struts.service.impl.AdminServiceImpl;
import com.situ.struts.service.impl.StudentServiceImpl;

public class StudentAction extends ActionSupport{
	private Admin admin;
	
	private IAdminService adminService = new AdminServiceImpl();
	private IStudentService studentService = new StudentServiceImpl();

	public String login() {
		Admin adminResult = adminService.login(admin);
		//如果是空，登陆失败
		if (adminResult == null) {
			return INPUT;
		}
		//登陆成功：数据保存到session中
		ActionContext.getContext().getSession().put("admin", adminResult);
		
		return "loginSuccess";
	}
	
	public String list() {
		//查询所有学生列表
		List<Student> list = studentService.findAll();
		//放到域对象占用
		ActionContext.getContext().getContextMap().put("list", list);
		return "list";
	}

	public Admin getAdmin() {
		return admin;
	}

	public void setAdmin(Admin admin) {
		this.admin = admin;
	}
	
	
}
