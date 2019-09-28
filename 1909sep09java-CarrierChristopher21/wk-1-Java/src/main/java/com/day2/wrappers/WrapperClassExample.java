package com.day2.wrappers;

import java.util.ArrayList;
import java.util.List;

/*
 * We have primitive data types:
 * 		int, long, short, double, float, char, byte, boolean
 * 
 * We have the object representation of the primitive data types
 * 		basically capitalize them and use the full name.
 * 		int->Integer
 * 		long->Long
 * 		short->Short
 * 		double->Double
 * 		float->Float
 * 		char->Character
 * 		byte->Byte
 * 		boolean->Boolean
 * 
 * 	These classes hold the primitive data types but also give us extra methods
 * 		to work with them.
 * 
 * 	When we try to convert from an object of a Wrapper to the primitive,
 * 		this is known as unboxing. it "unboxes" the primitive.
 * 	When we convert from a primitive to the wrapper object, this is 
 * 		known as boxing. it "boxes" the primitive.
 * 
 */

public class WrapperClassExample {
	
	public static void main(String[] args) {
		Integer i = new Integer("67");
		System.out.println(i);
		int x =i;// unboxing
		Integer i2 = x;//boxing
		System.out.println(x);
		System.out.println(Integer.reverse(87654));
		String s = Integer.toOctalString(7564636);
		System.out.println(s);
		
		//Collection API with primitives
		List<Integer> l = new ArrayList<>();
		l.add(5);
		l.add(17);
		System.out.println(l);
		
		ArrayList<Character> lc = new ArrayList<>();
		lc.add('c');
		lc.add((char)599);
		lc.add(new Character((char)129));
		System.out.println(lc);
	}

}







