package com.situ.struts.interceptor;

import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionInvocation;
import com.opensymphony.xwork2.ActionProxy;
import com.opensymphony.xwork2.interceptor.Interceptor;

public class CheckLoginInterceptor implements Interceptor{
	public CheckLoginInterceptor() {
		System.out.println("MyInterceptor.MyInterceptor()");
	}

	@Override
	public void destroy() {
		System.out.println("MyInterceptor.destroy()");
	}

	@Override
	public void init() {
		System.out.println("MyInterceptor.init()");
	}

	@Override
	public String intercept(ActionInvocation invocation) throws Exception {
		System.out.println("拦截器，业务处理开始");
		
		//得到当前要执行的方法的名字，如果不是login就需要验证
		//获得ActionContext这个对象
		ActionContext actionContext = invocation.getInvocationContext();
		ActionProxy actionProxy = invocation.getProxy();
		//获得当前要执行的方法
		String methodName = actionProxy.getMethod();
		if (!methodName.equals("login")) {
			//从session中得到当前登陆的用户
			Object object = actionContext.getSession().get("admin");
			if (object == null) {
				return "input";
			} 
		} 
		
		return invocation.invoke();
	}

}
