package org.hexin.proxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

import org.hexin.service.UserService;
import org.hexin.service.UserServiceImpl;

public class UserServiceProxyFactory implements InvocationHandler{
	private UserService us;
	public UserServiceProxyFactory(UserService us) {
		super();
		this.us = us;
	}
	public UserService getUserServiceProxy() {
		//生成动态代理
		//第一个参数是类加载器, 随便给一个
		//第二个参数是把接口给他
		//第三个参数是把InvocationHandler传进去
		UserService usProxy = (UserService) Proxy.newProxyInstance(
										UserServiceProxyFactory.class.getClassLoader(), 
										UserServiceImpl.class.getInterfaces(), 
										this
								);
		//返回
		return usProxy;
	}
	//三个参数
	//第一个参数是代理对象
	//第二个参数是调用方法
	//第三个参数是当前方法执行的参数传给你
	public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
		System.out.println("打开事务");
		Object invoke = method.invoke(us, args);
		System.out.println("提交事务");
		return invoke;
	}
	
	
}
