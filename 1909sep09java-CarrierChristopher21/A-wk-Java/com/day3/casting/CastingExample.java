package com.day3.casting;

import com.day3.completeclasses.Building;
import com.day3.completeclasses.Skyscraper;

public class CastingExample {

	public static void main(String[] args) {
		Skyscraper sk = new Skyscraper();
//		System.out.println(sk.getFloors());
//		Building b = new Building();
//		System.out.println(b.getHeight());
		
		//this is up casting
		//	this is more than acceptable in java
//		Building b1 = new Skyscraper();
//		b1.holler();
		
		//this is down casting
		//	we need to explicitly cast for this to work
//		Building b2 = new Building();
//		Skyscraper s1 = (Skyscraper) new Building();
		
//		sk.holler();
//		((Building)sk).holler();
//		System.out.println(sk.address);
		System.out.println(((Building)sk).address);
		
		/*
		 * when casting, remember:
		 * 		variables are shadowed and methods are
		 * 			overridden.
		 * if we have a child class with an overridden method,
		 * 		it doesnt matter how we treat it, we cannot
		 * 		un-override a method. we still get the implementation
		 * 		of the child class.
		 * If we have a child object that shadows a parents
		 * 		variable, the parents is shadowed. We can cast
		 * 		the object as a parent, and thus cast the variable
		 * 		forward into the light.
		 */
		
		
	}
}
