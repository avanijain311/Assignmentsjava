package com.monocept.crud;

import java.util.Iterator;
import java.util.TreeSet;

public class TreeSetEX {
	 public static void main(String[] args) {
		 TreeSet<Integer> numbers = new TreeSet<>();
	        numbers.add(767);
	        numbers.add(89);
	        numbers.add(124);
	        numbers.add(74);
	        System.out.println("TreeSet : " + numbers);
  
	        Iterator<Integer> iterate = numbers.iterator();
	        System.out.print("TreeSet using Iterator: ");
	        
	        while(iterate.hasNext()) {
	            System.out.print(iterate.next());
	            System.out.print(", ");
	        }
	        boolean value = numbers.remove(767);
	        System.out.println("\nIs 767 removed? " + value);

	       
	        boolean r = numbers.removeAll(numbers);
	        System.out.println("Are all elements removed? " + r);
	        
	        System.out.println("Removed First Element: " + numbers.pollFirst());
	        System.out.println("Removed Last Element: " + numbers.pollLast());

	        System.out.println("New TreeSet: " + numbers);
	    }
	
}
