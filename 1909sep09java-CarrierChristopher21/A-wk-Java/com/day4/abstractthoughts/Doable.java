package com.day4.abstractthoughts;

public interface Doable {
	default void print() {
		System.out.println("printing in doable");
	}
}
