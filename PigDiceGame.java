package com.monocept.work;

import java.util.Random;
import java.util.Scanner;

public class PigDiceGame {
	public static void main(String args[]) {
	    System.out.println("Welcome to Pig, the two-player dice game!");
	    final Scanner scanner = new Scanner(System.in);
        final Random random = new Random();

	    final PigDicePlayer player1 = new PigDicePlayer(1, random, scanner, System.out);
        final PigDicePlayer player2 = new PigDicePlayer(2, random, scanner, System.out);

        while (true) {
            if (player1.takeTurn()) {
                System.out.println(player1.getName() + " wins!");
                outputScore(player1, player2);
                break;
            }
            if (player2.takeTurn()) {
                System.out.println(player2.getName() + " wins!");
                outputScore(player2, player1);
                break;
            }
        }

        System.out.println(
                player1.getName() + " vs " + player2.getName() + ": "
                + player1.getScore() + " - " + player2.getScore());
    }

    private static void outputScore(final PigDicePlayer winner, final PigDicePlayer loser) {
        System.out.println(winner.getName() + " wins by " + (winner.getScore() - loser.getScore()) + " points!");
    }
}
