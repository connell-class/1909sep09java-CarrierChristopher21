package com.day4.abstractthoughts;

public interface Skippable {
	default void print() {
		System.out.println("skipping class");
	}
}
