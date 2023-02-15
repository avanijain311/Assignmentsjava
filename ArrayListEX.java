package com.monocept.crud;

import java.util.ArrayList;

public class ArrayListEX {
	public static void main(String[] args) {
		ArrayList<Integer> x = new ArrayList<Integer>(6);
		x.add(45);
		x.add(9);
		x.add(76);
		x.add(58);
		x.add(32);
		System.out.println("Arraylist : "+ x);
		System.out.println("Index of 45 : " +x.indexOf(45));
		System.out.println("Removed element : "+x.remove(4));
		System.out.println("Size of the Arraylist : " + x.size());
		System.out.println("Cloning the ArrayList : "+x.clone());
	    x.clear();
		System.out.println("Clearing the ArrayList" );
		System.out.println("Arraylist : "+ x);
	}
}
