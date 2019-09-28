package com.day5.CollectionApi;

import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

public class MapExample {

	public static void main(String[] args) {
		Map<String, String> hashmap = new HashMap<>();
		hashmap.put("stringy", null);
		hashmap.put("krusty", "krab");
		hashmap.put("code", "boss-like");
		hashmap.put("my", null);
		hashmap.put("bad", "with celebrities");
//		hashmap.put(null, "say");
		System.out.println(hashmap);
		Map<String, String> treemap = new TreeMap<>(hashmap);
		System.out.println(treemap);
		System.out.println(treemap.get("code"));
		treemap.put(null, "say");
		
	}
}
