package com.day2.classes;

/*
 * Scopes of java
 * 		Static	(aka class) - one copy of the variable and/or method
 * 		Instance (aka object) - each instance has a copy of the variables 
 * 									and/or methods
 * 		Method - the variables only exist within the method
 * 		Block (aka local, or loop) - only exists within the curlybraces
 */

public class Animal {

	boolean furred; // these are member fields, states, etc.
	int age;
	int eyeballs, legs;
	String name;

	static int instanceCounter;

	public void makeSound() {
		//you  may access a static variable inside of an instance method
		//you may also access an instance variable inside of an instance method
		
		System.out.println(name + " is " + age + " years old");
		System.out.println("making sounds");
		System.out.println(instanceCounter);
		// Since we are already inside the object, we know what object, the 
		//variables will be associated with
		//also, every object knows the blueprint, so it can grab the variables
		//that are static
		
	}

	public static void howManyAreThere() {
//		System.out.println(age);
		/*
		 * static methods can grab static variables, but not instance
		 * 		because it does not know which instance you are referring
		 * 		to
		 * 
		 */
		System.out.println("There are " + instanceCounter + " many animals out there");
	}
	
	
//	constructors do not have return types
	//it takes the name of a class and requires the new keyword to invoke
	//if there are no other constructors then it will provide one for you
	Animal(){
		//this is not the default constructor
		System.out.println("this is a no args constructor");
	}
	
	//the default constructor IS A no args constructor that java provides for you
	// if you do not provide one yourself	
	Animal(String names){
		System.out.println("we are making an object");
		name=names;
	}

}










