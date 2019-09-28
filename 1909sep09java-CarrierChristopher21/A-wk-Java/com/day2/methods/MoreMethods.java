package com.day2.methods;

public class MoreMethods {
	//a package is a way organize our classes
	static String frolic() {
		return "frog licking";
	}
	
	public static void main(String[] args) {
		System.out.println(frolic());
		int x =9;
		System.out.println(x);
		return;
	}
	
	/*
	 * The method signature:
	 * 
	 * 	[modifiers] [return type] [method name] ([param list]){
	 * 		//our logic;
	 * }
	 * 
	 * 		we have modifiers for methods, variables, and classes;
	 * 			access modifiers: public, default, protected and private
	 * 			non-access modifiers:	final, abstract, static, transient,
	 * 				synchronized, and volatile, etc.
	 * 
	 */
}
