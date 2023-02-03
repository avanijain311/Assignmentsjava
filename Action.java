package com.monocept.test;

public class Action {
	public static void main(String[] args) {
		TicTacToe t = new TicTacToe();
		Player p1 = new Player("Charlie's ", 'x');
		Player p2 = new Player("Angel's ", '0');

		Player cp; // cp=current player
		cp = p1;
		while (true) {
			System.out.println(cp.getName() + "turn now");
			cp.makeMove();
			TicTacToe.displayTrack();
			if (TicTacToe.checkColWin() || TicTacToe.checkRowWin() || TicTacToe.checkDiagWin()) {
				System.out.println(cp.getName() + "has won :)");
				break;
			} else {
				if (cp == p1) {
					cp = p2;
				} else
					cp = p1;
			}
		}

	}
}
