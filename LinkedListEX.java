package com.monocept.crud;

import java.util.LinkedList;
import java.util.ListIterator;

public class LinkedListEX {
	public static void main(String[] args) {
		LinkedList<String> list = new LinkedList<String>();

		list.add("Garlic");
		list.add("Peas");
		list.add("Potato");
		list.add("Corn");
		System.out.println("Linked List : " + list);

		list.add(3, "Onion");
		System.out.println("After adding a veggie at 4th position : " + list);

		list.addFirst("First veggie");
		list.addLast("Last veggie");
		System.out.println("After adding again : " + list);

		Object firstvar = list.get(0);
		System.out.println("First Item: " + firstvar);
		list.set(0, "Carrot");
		System.out.println("After updating first Item : " + list);

		list.remove(1);
		list.remove(2);
		System.out.println("LinkedList after deletion of Item in 2nd and 3rd position : " + list);

		ListIterator<String> it = list.listIterator();
		System.out.println("Displaying List using iterator :");
		while (it.hasNext()) {
			System.out.println(it.next());

		}
	}
}
