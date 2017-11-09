package com.situ.struts.data;

import java.util.Map;

import javax.servlet.ServletContext;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.apache.struts2.ServletActionContext;
import org.apache.struts2.interceptor.ApplicationAware;
import org.apache.struts2.interceptor.RequestAware;
import org.apache.struts2.interceptor.SessionAware;

import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionSupport;

public class DataAction2 extends ActionSupport implements RequestAware, SessionAware, ApplicationAware{
	Map<String, Object> contextMap;
	Map<String, Object> sessionMap;
	Map<String, Object> applicationMap;

	@Override
	public String execute() throws Exception {
		contextMap.put("request_data3", "request_data3_value");
		sessionMap.put("session_data3", "session_data3_value");
		applicationMap.put("application_data3", "application_data3_value");
		
		return SUCCESS;
	}
	
	public String register() {
		contextMap.put("request_data2", "request_data2_value");
		return SUCCESS;
	}

	@Override
	public void setApplication(Map<String, Object> application) {
		this.applicationMap = application;
	}

	@Override
	public void setSession(Map<String, Object> session) {
		this.sessionMap = session;
	}

	@Override
	public void setRequest(Map<String, Object> request) {
		this.contextMap = request;
	}
}
