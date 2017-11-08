package com.situ.struts.data;

import java.util.Date;

import com.opensymphony.xwork2.ActionSupport;
import com.situ.struts.pojo.User;

public class UserAction2 extends ActionSupport{
	private User user;
	
	public UserAction2() {
		System.out.println("UserAction2.UserAction2()");
	}
	
	public void setUser(User user) {
		this.user = user;
	}
	
	public User getUser() {
		return user;
	}

	public String register() {
		System.out.println("UserAction.register()");
		System.out.println(user.getName());
		System.out.println(user.getAge());
		System.out.println(user.getBirthday());
//		return "success";
		return "register";
	}
}
