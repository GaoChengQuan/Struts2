package com.situ.struts.config;

import com.opensymphony.xwork2.ActionSupport;

public class AdminAction extends ActionSupport{

	@Override
	public String execute() throws Exception {
		System.out.println("AdminAction.execute()");
		return "success";
	}
	
	public String login() throws Exception {
		System.out.println("AdminAction.login()");
		return "success";
	}
	
	public String register() {
		System.out.println("AdminAction.register()");
		return "success";
	}
	
	public String add() {
		System.out.println("AdminAction.add()");
		return "add";
	}
}
