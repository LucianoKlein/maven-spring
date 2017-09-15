package org.hexin.pojo;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component("car")
public class Car {
	@Value("玛莎拉蒂")
	private String name;
	@Value("呕吐绿")
	private String color;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color = color;
	}
	
	public Car() {
		System.out.println("汽车对象创建了");
	}
	@Override
	public String toString() {
		return "Car [name=" + name + ", color=" + color + "]";
	}
	
}
