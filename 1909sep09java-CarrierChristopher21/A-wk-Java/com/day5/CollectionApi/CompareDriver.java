package com.day5.CollectionApi;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import com.day3.completeclasses.Building;

public class CompareDriver {
	public static void main(String[] args) {


	List<Building> bl = new ArrayList<>();
	bl.add(new Building("joe", 100, 2));
	bl.add(new Building("adam", 25, 5));
	bl.add(new Building("dome", 50, 1));
	
	/*
	 * The Comparable interface is a functional interface that
	 * 		gives a class a default sorting order
	 * 		We need this if we want to sort our collection of
	 * 		objects from that class.
	 */
//	Collections.sort(bl);
	Collections.sort(bl, new BuildingSorter());
	System.out.println(bl);
	
	
}
}
