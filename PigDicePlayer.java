package com.monocept.work;

import java.io.PrintStream;
import java.util.Random;
import java.util.Scanner;

public class PigDicePlayer {
	private final Random random;
    private final String name;
    private final Scanner scanner;
    private final PrintStream output;
    private int score;

   PigDicePlayer(final int id, final Random random, final Scanner scanner, final PrintStream output) {
        this.name = "Player " + id;
        this.random = random;
        this.scanner = scanner;
        this.output = output;
    }

    public boolean takeTurn() {
        this.output.println(this.name + "'s turn to roll");
        this.output.println("Do you want to play this turn? (Y/H)");
        if (this.answer().equals("H")) {
            this.output.println(this.name + " hold their turn.");
            return false;
        }

        int currentTurnScore = 0;
        do {
            final int roll = this.random.nextInt(6) + 1;
            this.output.println(this.name + " rolled a " + roll);
            currentTurnScore += roll;

            if (roll == 1) {
                currentTurnScore = 0;
                break;
            }
            this.output.println(this.name + "'s score this turn is " + currentTurnScore);

        } while (((this.score + currentTurnScore) < 21) && this.continueRolling());

        this.score += currentTurnScore;
        this.output.println(this.name + "  their turn with " + this.score + " points.");

        return (this.score >= 21);
    }

    public String getName() {
        return this.name;
    }

    public int getScore() {
        return this.score;
    }

    private String answer() {
        return this.scanner.nextLine().replaceAll(" ", "").toUpperCase();
    }

    private boolean continueRolling() {
        this.output.println("Do you want to roll more? (Y/H)");
        String continueRolling = this.answer();

        while (!(continueRolling.equals("Y")) && !(continueRolling.equals("H"))) {
            this.output.println("Please enter only Y/H:");
            continueRolling = this.answer();
        }

        return continueRolling.equals("Y");
    }
}
