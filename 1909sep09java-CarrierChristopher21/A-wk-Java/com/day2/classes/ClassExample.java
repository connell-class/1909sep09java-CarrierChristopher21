package com.day2.classes;

public class ClassExample {
	
	/*
	 * What is a class
	 * 		Blueprint for an object
	 * 
	 * what is an object
	 * 		an instance of a class
	 * 		a group of states and behaviors
	 * 			methods and member variables, member fields, 
	 * 				instance variables, etc.
	 * 
	 * 
	 * NAMING CONVENTIONS
	 * 		variable names:
	 * 			camelCase ex: myFirstName, buttonColors, etc.
	 * 		class names:
	 * 			TitleCase ex: Animal, CookieMonsters
	 * 			Nouns
	 * 		constants:
	 * 			UPPERCASE ex:	BLUE, YELLOW, JAPAN
	 * 		method names
	 * 			camel case ex: run(), doWork(), squat()
	 * 			verb
	 * 		packages
	 * 			lowercase
	 * 			most specific to most broad: com.something.something, instead of 
	 * 					something.something.com
	 * 		interfaces
	 * 			TitleCase ex:	Runnable, Comparable
	 * 			Adjectives
	 * 
	 * 
	 */
	
	public static void main(String[] args) {
		Animal.howManyAreThere();
		Animal animal = new Animal();
		animal.makeSound();
		animal.name="harry";
		animal.age=14;
		animal.makeSound();
		System.out.println(animal);
	}

}
