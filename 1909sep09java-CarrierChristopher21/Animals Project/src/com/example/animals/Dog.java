package com.example.animals;

public class Dog extends Animal {

	private double tailLength;
	private String breath;
	public double getTailLength() {
		return tailLength;
	}
	public void setTailLength(double tailLength) {
		this.tailLength = tailLength;
	}
	public String getBreath() {
		return breath;
	}
	public void setBreath(String breath) {
		this.breath = breath;
	}
	
	@Override
	public String makeSound() {
		return "Bark";
	}
	public Dog(String name, int legs, boolean tailed, double tailLength, String breath) {
		super(name, legs, tailed);
		this.tailLength = tailLength;
		this.breath = breath;
	}
	public Dog() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Dog(String name, int legs, boolean tailed) {
		super(name, legs, tailed);
		// TODO Auto-generated constructor stub
	}
	@Override
	public String toString() {
		return "Dog [tailLength=" + tailLength + ", breath=" + breath + "]";
	}
	
	
	
	
}
