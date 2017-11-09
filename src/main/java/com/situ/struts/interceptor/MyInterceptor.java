package com.situ.struts.interceptor;

import com.opensymphony.xwork2.ActionInvocation;
import com.opensymphony.xwork2.interceptor.Interceptor;

public class MyInterceptor implements Interceptor{
	public MyInterceptor() {
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
		
		//调用下一个拦截器，或者执行Action中方法(和Filter非常像chain.doFilter(request, response);)
		String invoke = invocation.invoke();
		
		System.out.println("拦截器，业务处理结束");
		return invoke;
	}

}
