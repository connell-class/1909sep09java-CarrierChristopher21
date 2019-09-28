package com.day2.reflection;

public class Test {

	private String s;
	
	public Test() {
		s="jeff's curiosity";
	}
	public void method1() {
		System.out.println("the string is "+s);
	}
	public void method2(int x) {
		System.out.println("the number is "+x);
	}
	private void method3() {
		System.out.println("private method invoked");
	}
}
