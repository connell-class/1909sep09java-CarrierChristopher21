package com.day4.abstractthoughts;

public interface InterfaceExample {
	/*
	 * If your wondering whether to use an abstract class or an interface
	 * 		ask yourself "am I defining the entire base structure for 
	 * 		the series of classess (abstract class) or am I simply requiring 
	 * 		a series of classes to have some additional functionality (interface)
	 * 
	 * An interface is a contract; it forces any implementing classes
	 * 		to implement its methods
	 * 
	 * 
	 */
	
	/*
	 * all methods inside of an interface are implicitly
	 * 		public and abstract
	 * 
	 * abstract vs concrete
	 * 	abstract has no implementation
	 * 	concrete does
	 * 
	 * can interfaces have concrete methods
	 * 	no, they are all implicitly abstract
	 * 	
	 * 	unless,
	 * 		they are static
	 * 			you cannot instantiate an interface
	 * 			so it cannot have concrete instance methods
	 * 		they are default
	 * 			we can give a default implementation	
	 * 			for a method in an interface.
	 * 
	 */
	
	/*
	 * implicit modifiers
	 * 	the modifiers for an interfaces variable are
	 * 		public static final
	 * 
	 * InterfaceExample.THE_END;
	 */
	int x=8;
	public static final int THE_END=8;
	
	void print();
	public void print2();
	public abstract void print3();
//	void printNo() {};
	
	static void printStatic() {
		System.out.println("static");
	}
	public default void printdef() {
		System.out.println("printdef");
	}
	
}
