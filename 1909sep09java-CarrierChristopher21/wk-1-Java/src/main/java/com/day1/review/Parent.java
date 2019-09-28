package com.day1.review;

public class Parent {

	static {
		System.out.println("parent static");
	}
	private String name;
	private int age;
	
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
	public Parent() {
//		super();
		System.out.println("in the parent");
	}
	public Parent(String name, int age) {
//		super();
		System.out.println("in the parent args");
		this.name = name;
		this.age = age;
	}
	public void doTheThing() {
		System.out.println("in the thing");
	}
}
