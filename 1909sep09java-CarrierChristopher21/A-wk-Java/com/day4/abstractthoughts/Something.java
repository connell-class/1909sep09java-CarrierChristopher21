package com.day4.abstractthoughts;

/*
 * Abstract classes and Concrete classes have more similarities than they 
 * 		have differences. Some of the differences include:
 * 				-Abstract classes cannot be instantiated
 * 				-Abstract classes can have abstract methods
 * 					-an abstract method must be overridden by the 
 * 						first concrete class that inherits it
 * 		Beyond this, the inheritance works the same.
 * 
 * 	Differences between Abstract class and an interface:
 * 		Interface					Abstract class
 * 		---------					--------------
 * 		abstract					concrete and abstract methods
 * 		implements keyword			extends keyword
 * 		(extends keyword for
 * 			extending other 
 * 			interfaces)
 * 	methods implicitly:
 * 		public and abstract			no implicit modifiers
 * 		no constructor 				yes constructor
 * 
 * -------------------------
 * why would we use one over the other?
 * 	PRO i:	can implement multiple interfaces without taking up the one 
 * 				spot you have to extend a class
 * 
 * 	PRO i:	easier to come in, read and understand another dev's code
 * 	
 * 	PRO i:	smaller in size, not alot to load compared to a class
 * 
 * 	PRO ac:	can provide implementations whereas interfaces cannot provide
 * 				any (except default since java8)
 * 
 * 	PRO ac:	provides a constructor
 * 
 * 
 * 
 * 
 */


public class Something extends AbstractClassExample implements InterfaceExample {

	
	/*
	 * can classes have abstract methods
	 * 		no, you must implement them first
	 */
	@Override
	public void print() {
		// TODO Auto-generated method stub
		InterfaceExample.printStatic();
		
	}

	@Override
	public void print2() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void print3() {
		// TODO Auto-generated method stub
		
	}

	

}
