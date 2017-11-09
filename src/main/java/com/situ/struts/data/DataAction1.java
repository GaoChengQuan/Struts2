package com.situ.struts.data;

import java.util.Map;

import javax.servlet.ServletContext;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.apache.struts2.ServletActionContext;

import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionSupport;

public class DataAction1 extends ActionSupport {

	@Override
	public String execute() throws Exception {
		// 1. 请求数据封装；
		// 2. 调用Service处理业务逻辑，拿到结果数据
		// 3. 数据保存到域中
		// Struts中对数据操作，方式1： 直接拿到ServletApi, 执行操作
		HttpServletRequest request1 = ServletActionContext.getRequest();
		HttpSession session1 = request1.getSession();
		ServletContext application1 = ServletActionContext.getServletContext();
		request1.setAttribute("request_data1", "request_data1_value");
		session1.setAttribute("session_data1", "session_data1_value");
		application1.setAttribute("application_data1", "application_data1_value");
		
		// 【推荐：解耦的方式实现对数据的操作，上面Servlet方式需要额外引入Servlet的jar包】
        // Struts中对数据操作，方式2： 通过ActionContext类
        //ActionContext是Struts提供的方便拿Struts数据的接口类
		ActionContext actionContext = ActionContext.getContext();
		//这个map是往request域中放值
		Map<String, Object> contextMap = actionContext.getContextMap();
		Map<String, Object> sessionMap = actionContext.getSession();
		Map<String, Object> applicationMap = actionContext.getApplication();
		contextMap.put("request_data2", "request_data2_value");
		sessionMap.put("session_data2", "session_data2_value");
		applicationMap.put("application_data2", "application_data2_value");
		
		
		return SUCCESS;
	}
	
	public String register() {
		ActionContext actionContext = ActionContext.getContext();
		//这个map是往request域中放值
		Map<String, Object> contextMap = actionContext.getContextMap();
		Map<String, Object> sessionMap = actionContext.getSession();
		Map<String, Object> applicationMap = actionContext.getApplication();
		
		return SUCCESS;
	}
}
