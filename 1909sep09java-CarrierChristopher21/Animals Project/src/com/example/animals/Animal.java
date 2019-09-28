package com.example.animals;

public class Animal {

	private String name;
	private int legs;
	private boolean tailed;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getLegs() {
		return legs;
	}
	public void setLegs(int legs) {
		this.legs = legs;
	}
	public boolean isTailed() {
		return tailed;
	}
	public void setTailed(boolean tailed) {
		this.tailed = tailed;
	}
	
	public String makeSound() {
		return "Arrfarah????";
	}
	@Override
	public String toString() {
		return "Animal [name=" + name + ", legs=" + legs + ", tailed=" + tailed + "]";
	}
	public Animal(String name, int legs, boolean tailed) {
		super();
		this.name = name;
		this.legs = legs;
		this.tailed = tailed;
	}
	public Animal() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	
	
}
