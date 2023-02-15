package com.monocept.crud;

import java.util.LinkedHashMap;

public class LinkedHashMapEX {
	public static void main(String[] args) {
		LinkedHashMap<String, String> colors_map =  new LinkedHashMap<String, String>(); 
        colors_map.put("one", "Red"); 
        colors_map.put("two", "Green"); 
        colors_map.put("three", "Blue"); 
        colors_map.put("four", "Purple"); 
        colors_map.put("five", "Magenta"); 
        colors_map.put("six", "Olive"); 
   
        System.out.println("LinkedHashMap :" + colors_map); 
        System.out.println("LinkedHashMap is empty? " + colors_map.isEmpty()); 
        System.out.println("Size of the map: " + colors_map.size());
        System.out.println("Value for key = 'one' : " + colors_map.get("six")); 
        System.out.println("colors_map contains key = 'two' : "+  colors_map.containsKey("two")); 
        System.out.println("colors_map contains value 'Purple':"  + colors_map.containsValue("Purple")); 
        System.out.println("elete element 'one': " + colors_map.remove("one")); 
        System.out.println("Updated LinkedHashMap :" + colors_map); 
	}
}
