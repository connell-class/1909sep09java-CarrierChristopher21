package com.day3.completeclasses;

/*
 * we can import the entire class, we can use the 
 * 		fully qualified name during usage, we can import 
 * 		its static methods, import one static method, or 
 * 		import multiple classes from the same package
 * NOTE: when you use the * to import all classes inside
 * 		of a package, it DOES NOT import any packages inside 
 * 		of that package; 
 */
//import java.util.Arrays;
//import static java.util.Arrays.sort;
import static java.util.Arrays.toString;
import java.util.Arrays;

public class Driver {

	public static void main(String[] args) {
		Skyscraper sk = new Skyscraper();
		sk.setDoors(3);
		sk.setFloors(5);
		sk.setHeight(100.254);
		sk.setName("Billy Bobs IQ");
		System.out.println(sk.getDoors());
		System.out.println(sk.getFloors());
		System.out.println(sk.getHeight());
		System.out.println(sk.getName());
		
		Skyscraper[] ronSS = new Skyscraper[3];
		ronSS[0]=sk;
		ronSS[1]=new Skyscraper();
		ronSS[1].setDoors(7);
		String s = ronSS[1].toString();
//		sk.yell(1.0);
		System.out.println(s);
		System.out.println(ronSS);
		
		//Arrays is a utility, it is a helper class for arrays
		//it has alot of static methods that help us manage arrays
		//this is known as the fully qualified name
		
//		System.out.println(java.util.Arrays.toString(ronSS));
//		System.out.println(Arrays.toString(ronSS));
		
		//static method with static import
//		sort(ronSS);
		Arrays.toString(ronSS);
		
		
	}
	
	
	
	
	
	
}
