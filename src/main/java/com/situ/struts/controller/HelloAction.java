package com.situ.struts.controller;

import com.opensymphony.xwork2.ActionSupport;

public class HelloAction extends ActionSupport{

	@Override
	public String execute() throws Exception {
		System.out.println("HelloAction.execute()");
		return "success";
	}
	
	public String register() {
		System.out.println("HelloAction.register()");
		return "register";
	}
	
	public String add() {
		System.out.println("HelloAction.add()");
		return "add";
	}
}
