package com.day4.abstractthoughts;

public class Driver {

	public void doThis(InterfaceExample ie) {
		ie.print();
	}
	public static void main(String[] args) {
		Something s = new Something();
		s.print();
	}
}
