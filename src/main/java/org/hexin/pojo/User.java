package org.hexin.pojo;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;
import javax.annotation.Resource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.ImportResource;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

@Service("user")
//<bean name="user" class="org.hexin.pojo.User"/>
@Scope(scopeName = "singleton")
public class User {
	@Value("tom")
	private String name;
	@Value("18")
	private Integer age;
	private Integer height;
	//@Autowired//自动装配
	//如果你配置了多个类型一致的对象, 将无法选择具体注入哪一个对象
	//@Qualifier("car2")
	@Resource(name="car")
	private Car car;
	public Car getCar() {
		return car;
	}
	public void setCar(Car car) {
		this.car = car;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public int getHeight() {
		return height;
	}
	public void setHeight(int height) {
		this.height = height;
	}
	
	public User() {
		System.out.println("User对象创建了");
	}
	@Override
	public String toString() {
		return "User [name=" + name + ", age=" + age + ", height=" + height + ", car=" + car + "]";
	}
	@PostConstruct //在对象被创建后调用后, init-method
	public void init() {
		System.out.println("初始化方法!");
	}
	@PreDestroy //销毁之前调用.destroy method
	public void destroy() {
		System.out.println("我是销毁方法");
	}
	
	
}
