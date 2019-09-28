package com.day3.completeclasses;

/*
 * we can use the keyword extends to inherit from another class.
 * 		we can only extend from one class, java does not support
 * 		multiple inheritance.
 * 			multiple inheritance concerns the diamond
 * 			problem.
 */
public class Skyscraper extends Building{

	private int floors;
	public String address = "down that road";
	
	public int getFloors() {
		return this.floors;
	}
	public void setFloors(int floors) {
		this.floors=floors;
	}

	//super() refers to the parents constructor
	//super() must be on the first line of the constructor
	public Skyscraper() {
		super("sally");
		System.out.println("in the skyscraper constructor");
	}
	
	public static void main(String[] args) {
		Skyscraper sk = new Skyscraper();
	}
	
	/*
	 * this is an override
	 * 		it takes the same method signature as the parents'
	 * 		but gives a different implementation
	 * 
	 * method overriding is an implementation of 
	 * 		runtime polymorphism
	 * 
	 * method overloading is an implementations of compile
	 * 		time polymorphism.
	 */
	
	public String toString() {
		return "whatever we want";
	}
	
	
	 public void holler() {
		 System.out.println("hollering with the sk");
	 }
}
