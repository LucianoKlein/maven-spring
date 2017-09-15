package test;

import javax.annotation.Resource;

import org.hexin.pojo.User;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
//帮我们创建容器
@RunWith(SpringJUnit4ClassRunner.class) 
//指定创建容器时, 使用哪一个配置文件
@ContextConfiguration("classpath:applicationContext.xml")
public class AnnotationDemo {
	//获得user对象
	//将名为user的对象注入到u变量
	@Resource(name="user")
	private User u;
	
	@Test
	public void fun1() {
		System.out.println(u);
	}
}
