package com.monocept.crud;

import java.util.LinkedHashSet;
import java.util.Iterator;

public class LinkedHashSetEX {
	public static void main(String[] args) {
		LinkedHashSet<Integer> num = new LinkedHashSet<>();
        num.add(343);
        num.add(5456);
        num.add(4312);
        num.add(1985);
        num.add(4312);//non printing duplicate
        System.out.println("LinkedHashSet: " + num);

        Iterator<Integer> iterate = num.iterator();

        System.out.print("LinkedHashSet using Iterator: ");
        while(iterate.hasNext()) {
            System.out.print(iterate.next());
            System.out.print(", ");
        }
 
        System.out.println("\nIs 343 removed ? " +num.remove(343));
        System.out.println("Are all elements removed ? " +  num.removeAll(num));
    }
}
