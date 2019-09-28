package com.day1.review;

public class Primitives {

	public static void main(String[] args) {
		//primitives
		/*
		 * boolean-1bit
		 * byte-8bit
		 * short-16bit
		 * char-16bit
		 * float-32bit
		 * int-32bit
		 * double-64bit
		 * long-64bit
		 * 
		 * Because Java has primitives, it is not fully, purely,  
		 * 		100% Object Oriented
		 * 
		 * Casting- converting a value to another
		 * 
		 * type casting - converting primitive values into other
		 * 		data types
		 * 
		 */
		
//		int x =8;
//		System.out.println(x);
//		System.out.println((double)x);
		
//		double x = 8.8;
//		System.out.println(x);
//		System.out.println((int)x);

//		int a =5;
//		long b =a;
//		int c = b;//needs explicit cast due to possible overflow 
					//condition
		
		//different ways to declare stuff
		boolean b1= true;
		byte b2 = 60;
		short s = 74;
		char c = 'f';
		char c1 =63;
		char c2 = (char)64;
		float f = 16.0f;
		float f1 =(float)17.89;
		int x1 = 80;
		long l = 56;
		long l1 = 56L;
		long l2 = (long)59;
		double d1 = 88.88;
		double d2 = 90.02D;
		double d3 = (double)92.33;
		
		//when working with different size data types. these types
		//	get converted to the same type (the larger one) before 
		//	being operated on, the type of the result is the larger
		//	type.
		int x=9;
		long y=10;
		int z = x + (int)y;
		int z11 = (int)(x+y);//explicit casting
		long zi1=x;//implicit casting from int to long
		
		
		
		
		
	}
}
