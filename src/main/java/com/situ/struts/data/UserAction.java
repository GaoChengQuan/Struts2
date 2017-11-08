package com.situ.struts.data;

import java.util.Date;

import com.opensymphony.xwork2.ActionSupport;

public class UserAction extends ActionSupport{
	private String name;
	private Integer age;
	private Date birthday;
	
	public String register() {
		System.out.println("UserAction.register()");
		System.out.println(name);
		System.out.println(age);
		System.out.println(birthday);
//		return "success";
		return "register";
	}

	public void setName(String name) {
		this.name = name;
	}

	public void setAge(Integer age) {
		this.age = age;
	}

	public void setBirthday(Date birthday) {
		this.birthday = birthday;
	}
	
	


	
	
}
