package com.monocept.crud;

import java.util.HashMap;

public class HashMapEX {
	public static void main(String[] args) {
		HashMap<Integer, String> cities = new HashMap<>();
		cities.put(1, "Bhopal");
		cities.put(2, "Jaipur");
		cities.put(3, "Indore");
		cities.put(4, "Dhar");
		cities.put(5, "Ratlam");

		String value = cities.get(1);
		System.out.println("Value at index 1: " + value);
		System.out.println("Keys: " + cities.keySet());
		System.out.println("Key/Value mappings: " + cities.entrySet());
		cities.replace(1, "Gurgoan");
	    System.out.println("Replacing bhopal : " + cities);
	    String r = cities.remove(2);
	    System.out.println("Removed value: " + r);
	}
}
