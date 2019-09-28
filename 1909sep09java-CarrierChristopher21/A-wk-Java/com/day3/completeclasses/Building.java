/*
 * Notice the first line of any class
 * 
 * this is always going to be the package that the class
 * 		resides in
 */

package com.day3.completeclasses;

/*
 * the class keyword defines a class in java *gasp*
 * 	A class is a blueprint for an object
 * 		an object is a set of states and behaviors
 * 		we can define the attributes of an object
 * 			(an instance of a class) in the class
 * 			it self. Since the class is the blueprint
 * 			it defines how the object will be shaped 
 * 			and how it will act.
 * 	Also note the access modifier in front of the class
 * 		A class can have any access modifier in front of
 * 		it. However, the rules are slightly different.
 * 	A class can only have public or default access, not 
 * 		private or protected. The ONLY public class allowed 
 * 		inside of a file is that class with the same name
 * 		as the file itself.
 */
 public class Building implements Comparable<Building>{
	 /*
	  * NOBODY should be able to access our member variables
	  * 	without proper encapsulation. Member variables
	  * 	should NEVER be public.
	  * We can give an instance default values by initializing
	  * 	them here;
	  */
	 
	 /*
	  * the static, non access modifier, changes the 
	  * 	variable/method to a class variable or method
	  * 
	  * remember the scopes of a variable/method
	  * 	static, instance, method, and local
	  */
	 
	 private static int counter;
	 
	 public void giveClassCounter() {
		 System.out.println(counter);
	 }
	 @Override
	public String toString() {
		return "Building [name=" + name + ", height=" + height + ", doors=" + doors + ", address=" + address + "]";
	}
	//static methods cannot refer to instances field
	 public static void giveCounter() {
		 System.out.println(counter);
	 }
	 
	 private String name;
	 private double height;
	 private int doors;
	 public String address="main street";
	 /*
	  * getters and setters
	  * 	also known as accessors and mutators
	  * 
	  * getters and setters can be made public and still 
	  * 	provide proper encapsulation
	  * 	even if you just say the member is being directly 
	  * 	set to the arg, you still provide encapsulation.
	  * 		think dog.age=23; then having to go back through
	  * 		and changing everything to dog.setAge(23);
	  */
	 public String getName() {
		 return name;
	 }
	 public void setName(String naming) {
		 name=naming;
	 }
	 public double getHeight() {
		 return height;
	 }
	 public void setHeight(double h) {
		 if(h>0) {
		 height = h;
		 }
	 }
	 public int getDoors() {
		 return doors;
	 }
	 public void setDoors(int d) {
		 this.doors=d;
	 }
	 
	 /*
	  * this is method overloading
	  * how can we achieve method overloading?
	  * 	number of args
	  * 	types of args
	  * 	order of args
	  */
	 
	 public void yell() {
		 System.out.println("yelling");
	 }
	 public void yell(String yell) {
		 System.out.println(yell);
	 }
	 public void yell(int i) {
		 System.out.println(i);
	 }
	 public void yell(String yell, int i) {
		 System.out.println(yell + i);
	 }
	 public void yell(int i, String yell) {
		 System.out.println(i+yell);
	 }
	 
	 
	 //no args constructor
	 public Building() {
//		 this() refers to this' constructor
		 //we can call another constructor from witin
		 //the class with this();
//		 this("sally", 1.0, 2);
		 System.out.println("in the no args building con.");
		 }
	 public Building(String n) {
		 this();
		 System.out.println("in the building one arg cons.");
		 name=n;
	 }
	 
	 //all-args constructor
	 public Building(String name, double height, int doors) {
		 //this refers to the object we are in
		 System.out.println("in the building all args cons.");
		 this.name=name;
		 this.height=height;
		 this.doors=doors;
	 }
	 //this is using the default constructor
	 //the default constructor is only available
	 //when there are no other constructors available
	 //Building b = new Building();

	 public void holler() {
		 System.out.println("holler");
	 }
	@Override
	public int compareTo(Building o) {
		// TODO Auto-generated method stub
		return (int) (this.height-o.height);
	}
 
 }


