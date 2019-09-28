package com.day1.review;

public class Child extends Parent {
	
	static final int x;

	{
		System.out.println("instance block");
	}
	static {
		System.out.println("in the static block");
		x=9;
	}

//	Constructors are special methods that are called by using the 
	// new keyword. It has no return type and cannot never be overriden
	// inside it, we can use super and this keywords, but only in the
	// first line.

	/*
	 * if we dont specify a constructor, java provides a default, no argument
	 * constructor. If we specify any constructor, we only get what we specify.
	 */
	public Child() {
//		super();
//		this("nancy",3);
//		super.doTheThing();
//		this.doTheThing();
		System.out.println("in the child");

	}

	public Child(String name, int age) {
		super(name, age);

	}

	@Override
	public void doTheThing() {
		super.doTheThing();
		System.out.println("made in nowhere land");
	}

}
