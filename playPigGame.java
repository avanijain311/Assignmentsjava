package com.monocept.test;

import java.util.Random;
import java.util.Scanner;

public class playPigGame {
	Scanner s = new Scanner(System.in);
	int turn= 0;
	int rand= 0;
	int points= 0;
	int totalPoints=0;
	{
	while(totalPoints < 21) {
		System.out.println("Your Wish : Roll or Hold ! ");
		String w =s.next(); 
		if(w.equalsIgnoreCase("r")) {
			Random rand = new Random();
			int dieResult = rand.nextInt(6) +1;
			System.out.println("Die result = " + dieResult);
			if(dieResult==1) {
				points=0;
				totalPoints=0;
				turn++;
				System.out.println(" -- Game over --");
				break;
			}
			points = points +dieResult;
		}
		while(totalPoints > 21) {
			System.out.println("Points is " + points);
			System.out.println("Toatal Points is " + totalPoints);
			break;
		}
		totalPoints =totalPoints + points;
		System.out.println("Points is " + points);
		System.out.println("Toatal Points is " + totalPoints);
		turn++;
		points = 0;
		break;
		
	}
 }    
}

