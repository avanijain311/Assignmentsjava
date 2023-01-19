package com.monocept.work;

import java.util.Random;
import java.util.Scanner;

public class playPigGame {
	public static void main(String[] args) {
		int points = 0;
		int totalPoints = 0;
		int totalTurns=0;
		Scanner s = new Scanner(System.in);

		while (totalPoints <= 20) {
			System.out.println("Your Wish Roll (r) or Hold (h) ");
			String wish = s.next();
			if (wish.equalsIgnoreCase("r")) {
				Random rand = new Random();
				int dieResult = rand.nextInt(6) + 1;
				System.out.println("Die result = " + dieResult);
				totalTurns++;
				if (dieResult == 1) {
					points = 0;
					totalPoints = 0;
					//totalTurns = totalTurns-1;
					System.out.println("Points : " + points);
					System.out.println("Your Total turns " + totalTurns);
					System.out.println(" ");
					System.out.println(" --Turn  over --");
					break;
				} else {
					points = points + dieResult;
					System.out.println("Points :  " + points);
				}
				if (points>=20) {
					System.out.println("Your Total turns " + totalTurns);
					break; 
				} else if (wish.equalsIgnoreCase("h")) {
					totalPoints = totalPoints + points;
					System.out.println("You hold and your Total turns is " + totalPoints);
					totalTurns++;
					points = 0;
					break;
				}

			}
		}
	}
}
