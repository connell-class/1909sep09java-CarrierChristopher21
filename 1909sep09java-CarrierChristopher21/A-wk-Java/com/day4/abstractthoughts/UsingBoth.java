package com.day4.abstractthoughts;

public class UsingBoth implements Doable, Skippable{
	/*
	 * when inheriting duplicate default methods, you must override it.
	 */
	public void print() {
		System.out.println("smoking in the boys room");
		//Doable.super.print();
		//Skippable.super.print();
	}
	public static void main(String[] args) {
		UsingBoth ub = new UsingBoth();
		ub.print();
	}

}
