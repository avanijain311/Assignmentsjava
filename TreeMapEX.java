package com.monocept.crud;

import java.util.TreeMap;

public class TreeMapEX {
	public static void main(String[] args) {
		 TreeMap<String, Integer> numbers = new TreeMap<>();

	        numbers.put("Zeal", 1);
	        numbers.put("Passion", 2);
	        numbers.put("Ardor", 3);
	        numbers.put("Excited", 4);
	        System.out.println("TreeMap: " + numbers); 
	        System.out.println("Key/Value mappings: " + numbers.entrySet());
	        System.out.println("Keys: " + numbers.keySet());
	        System.out.println("Values: " + numbers.values());
	        boolean result = numbers.remove("Ardor", 3);
	        System.out.println("Is the entry {Ardor=3} removed? " + result);
	        numbers.replaceAll((key, oldValue) -> oldValue + 5);
	        System.out.println("TreeMap using replaceAll: " + numbers);
	}
}
