package com.day3.strings;

import com.day3.completeclasses.Skyscraper;

public class StringExample {

	/*
	 * what is a string?
	 * 		A class that is implemented using an array of chars;
	 * 	also, a String is immutable
	 * 
	 * what does immutable mean?
	 * 		It cannot be changed
	 */
	
	static void method(int i) {
		i++;
	}
	
	public static void main(String[] args) {
		Object o = new Object();
		String s = "this is a string";
		String s2 = new String("this is a string");
		
		String s3 = "this is a string";
		System.out.println(s.equals(s3));
		System.out.println(s.toUpperCase());
		System.out.println(s.substring(5,10));
		String s4 = s.substring(4,8);
		System.out.println(s4);
		System.out.println(s);
		
		
//		final int a =3;
//		a++; cannot be done
//		System.out.println(s2==s3);
//		System.out.println(s==s3);
		
//		int j =2;
//		method(j);
////		System.out.println(j);
//		int k=j;
//		j++;
////		System.out.println(k);
//		
//		final Skyscraper sk3 = new Skyscraper();
//		sk3.setFloors(1);
//		sk3=new Skyscraper();
//		sk3=null;
////		System.out.println(sk3.getFloors());
//		passByValue(sk3);
//		System.out.println(sk3.getFloors());
//		
	}
	static void passByValue(Skyscraper s) {
		s.setFloors(5);
	}
}
