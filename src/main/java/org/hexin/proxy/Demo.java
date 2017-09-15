package org.hexin.proxy;

import org.hexin.service.UserService;
import org.hexin.service.UserServiceImpl;
import org.junit.Test;

public class Demo {
	@Test
	public void fun1() {
		UserService us = new UserServiceImpl();
		UserServiceProxyFactory factory = new UserServiceProxyFactory(us);
		UserService usProxy = factory.getUserServiceProxy();
		
		usProxy.save();
	}
	
	@Test
	public void fun2() {
		
		UserServiceProxyFactory2 factory = new UserServiceProxyFactory2();
		UserService usProxy = factory.getUserServiceProxy();
		
		usProxy.save();
		System.out.println(usProxy instanceof UserServiceImpl); //判断代理对象是否属于被代理对象
	}
}
