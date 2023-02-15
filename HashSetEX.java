package com.monocept.crud;

import java.util.HashSet;

public class HashSetEX {
	public static void main(String[] args) {
		 HashSet<String> hash = new HashSet<String>();
		 hash.add("Indigo");
		 hash.add("Alaska");
		 hash.add("Emirates");
		 hash.add("United");
		 hash.add("Qantas");
		 hash.add("Emirates");//do not take duplicate values
		 System.out.println("HashSet : " +hash);
		 System.out.println("HashSet Size : " +hash.size());
		 System.out.println("Is HashSet Contains Alaska : " + hash.contains("Alaska"));
		 hash.remove("United");
		 System.out.println("HashSet after removal : " +hash);
		 hash.clear();
		 System.out.println("Clearing Hashset : " + hash); 
		 System.out.println("Is HashSet is empty ? " +hash.isEmpty());
		 
	}
}
