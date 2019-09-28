package com.day2.access;

/*
 * ACCESS MODIFIERS
 * 				own class	package		children	everywhere else
 * public			X			X			X				X
 * protected		X			X			X				O
 * default			X			X			O				O
 * private			X			O			O				O
 * 
 * 
 * this is how we achieve encapsulation inside java
 * 
 * 
 */

public class AccessingTheThing {

	public static String access;
	static int numOfFingersLeft;

	protected static String IamAThing() {
		return "the thing lives";
	}

	private static void nooneCares() {
		System.out.println("i gonna get you");
	}

}
