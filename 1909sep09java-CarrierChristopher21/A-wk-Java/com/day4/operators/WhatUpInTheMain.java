package com.day4.operators;

public class WhatUpInTheMain {// extends String { cant be done if the class
								// is final

//	public static void main(String[] args) {
//		
//	}
//	public static void main(String [] dinosaur) {
//		System.out.println("dinosaur");
//	}
//	public static void main(String args) { note that is doesnt know
//										that there is a main
//		System.out.println("dinosaur rawr");
//	}
//	public static void main(String args[]) {
//		System.out.println("dino");
//		int[] arr;
//		int [] arr2;
//		int r[];
//		
//	}
//	public final static void main(String[] args) { // final method
//											//cannot be overridden
//	System.out.println("dino");	
//	}

	// this is know as var args (variable arguments)
	//you can only have the var args as the last parameter and
	//	it will treat all args as an array.

	public static void varArgExample(/* String... y, */ int y, int... x/* , int z */) {
		System.out.println("in args " + x[1]);
	}

	public static void main(String... args) {
		varArgExample(1,2,3,4,5,6);
	}
}
