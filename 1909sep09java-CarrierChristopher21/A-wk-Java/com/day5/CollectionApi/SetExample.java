package com.day5.CollectionApi;

import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class SetExample {

	public static void main(String[] args) {
		Set<String> hashset = new HashSet<>();
		boolean first = hashset.add("stringy");
		boolean second = hashset.add("stringy");
		hashset.add("?");
		hashset.add("1");
		hashset.add("Breaker");
		hashset.add("booger");
		hashset.add("crusty");
		hashset.add("crab");
		System.out.println(hashset);
		for(String set : hashset) {
			System.out.println(set);
		}
		Set<String> treeSet = new TreeSet<>(hashset);
		System.out.println(treeSet);
		System.out.println(first);
		System.out.println(second);
	}
}
