package test;

import org.hexin.pojo.User;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Demo {
	@Test
	public void test1() {
		ApplicationContext ac = new ClassPathXmlApplicationContext("applicationContext.xml");

		User user = (User) ac.getBean("user");
		System.out.println("name:" + user.getName() + ",age:" + user.getAge());
		System.out.println("car.name:" + user.getCar().getName());
	}
}
