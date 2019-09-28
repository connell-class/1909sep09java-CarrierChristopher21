package com.day5.CollectionApi;

import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;
import java.util.ListIterator;

public class ListExample {

	public static void main(String[] args) {
		//this is an arraylist, simple to use, great to have
	ArrayList<String> AL = new ArrayList<String>();
	AL.add("stringy");
	ArrayList<Integer> IL = new ArrayList<>();
	AL.add("boss");
	AL.add("coding");
	AL.add("oga");
//	String[] sa = {"stringy","boss","coding"};
	System.out.println(AL);
	
	//this is a linked list, you use it the same as an arraylist, done
	List<String> ls = new LinkedList<>();
	
	//Iterators
	//Iterator<String> it = AL.listIterator();
	//ListIterator provides methods for working with lists
	//		such as previous method
	//Iterator in general is not able to move to the previous one
	ListIterator<String> it = AL.listIterator();
//	while(it.hasNext()) {
//		System.out.println(it.next());
//	}
//	System.out.println(it.next());
//	System.out.println(it.previous());
	
//	for(int i=0; i<AL.size();i++) {
//		System.out.println(AL.get(i));
//	}
	Collections.sort(AL);
	//enhanced for loop, or a for each loop
		for (String s : AL) {
			System.out.println(s);
		}
	
	}
}
