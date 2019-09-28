package com.example;

import com.example.animals.Dog;
import com.example.model.Person;

public class Driver {
	
	public static void main(String[] args) {
		Person p = new Person(new Dog("Scruffy", 4, true, 13, "foolish"));
		System.out.println(p);
	}
}
