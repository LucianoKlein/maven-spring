package org.hexin.pojo;

public class Car {
	private String name;
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
	
}
