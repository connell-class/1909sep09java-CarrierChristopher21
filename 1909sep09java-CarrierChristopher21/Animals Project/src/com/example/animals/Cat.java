package com.example.animals;

public class Cat extends Animal{

	private double clawLength;
	private boolean evil;
	double getClawLength() {
		return clawLength;
	}
	void setClawLength(double clawLength) {
		this.clawLength = clawLength;
	}
	boolean isEvil() {
		return evil;
	}
	void setEvil(boolean evil) {
		this.evil = evil;
	}
	
	@Override
	public String makeSound() {
		return "Hatred";
	}
	public Cat(String name, int legs, boolean tailed, double clawLength, boolean evil) {
		super(name, legs, tailed);
		this.clawLength = clawLength;
		this.evil = evil;
	}
	public Cat() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Cat(String name, int legs, boolean tailed) {
		super(name, legs, tailed);
		// TODO Auto-generated constructor stub
	}
	@Override
	public String toString() {
		return "Cat [clawLength=" + clawLength + ", evil=" + evil + "]";
	}
	
	
}
