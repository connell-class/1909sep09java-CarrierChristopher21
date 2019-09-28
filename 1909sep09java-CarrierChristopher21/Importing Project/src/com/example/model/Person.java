package com.example.model;

import com.example.animals.Animal;

public class Person {

	private Animal pet;

	public Person() {
		super();
		// TODO Auto-generated constructor stub
	}

	Animal getPet() {
		return pet;
	}

	void setPet(Animal pet) {
		this.pet = pet;
	}

	public Person(Animal pet) {
		super();
		this.pet = pet;
	}

	@Override
	public String toString() {
		return "Person [Pet="+pet.toString()+"]";
	}

	

}
