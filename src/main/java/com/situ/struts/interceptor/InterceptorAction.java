package com.situ.struts.interceptor;

import com.opensymphony.xwork2.ActionSupport;

public class InterceptorAction extends ActionSupport{

	public String register(){
		System.out.println("InterceptorAction.execute()");
		return SUCCESS;
	}
}
