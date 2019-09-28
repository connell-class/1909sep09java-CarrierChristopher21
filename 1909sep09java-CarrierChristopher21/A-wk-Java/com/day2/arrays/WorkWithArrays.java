package com.day2.arrays;

public class WorkWithArrays {

	/*
	 * what is an array
	 * 		series of data entries of the same type, 
	 * 			it holds them sequentially in memory
	 * 
	 * how do we create an array?
	 */
		//java arrays are immutable in size
	
	public static void main(String[] args) {
		
	int[] itArr = new int[6];
	
	//arrays have a length property
//	for(int i =0; i<itArr.length; i++) {
//		System.out.println(itArr[i]);
//	}
	
	/*
	 * Default values in java
	 * 		int is 0, double is 0.0, float is 0.0,
	 * 		short is 0, long is 0, boolean is false,
	 * 		char is '' (empty character), byte is 0,
	 * 		Object is null
	 * 
	 * java gives default values to variables under these circumstances
	 * 		Arrays, when it is in static scope, when it is instance scope
	 * 		
	 * 
	 */
	
	char gargoyle[]= {'c','d','e','f','z'};
	System.out.println(gargoyle);
	
	String[] coolCats = {"we","are","cool","cats","dawgs"};
	System.out.println(coolCats);
	int[] arr = {1,2,3,4};
	System.out.println(arr);
	//check out the toString method
	Object obj;
	
	
	}
}
