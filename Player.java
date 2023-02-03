package com.monocept.test;

import java.util.Scanner;

public class Player {

	private String name;
	private char mark;

	Player(String name, char mark) {
		this.name = name;
		this.mark = mark;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public char getMark() {
		return mark;
	}

	public void setMark(char mark) {
		this.mark = mark;
	}

	void makeMove() {
		Scanner s = new Scanner(System.in);
		int row, col;
		do {
			System.out.println("Enter the row and col : ");
			row = s.nextInt();
			col = s.nextInt();
		} while (!isValid(row, col));
		TicTacToe.placeMark(row, col, mark);
	}

	boolean isValid(int row, int col) {
		if (row >= 0 && row <= 2 && col >= 0 && col <= 2) {
			if (TicTacToe.board[row][col] == ' ') {
				return true;
			}
		}
		return false;
	}
}
