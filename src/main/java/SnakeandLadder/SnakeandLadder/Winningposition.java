package SnakeandLadder.SnakeandLadder;

import java.util.Random;

public class Winningposition {

	public static final int NOPLAY = 1;
	public static final int LADDER = 2;
	public static final int SNAKE = 3;
	final static int WINPOINT = 100;

	public static int position = 0;

	int player1 = 0;

	public static int rolldice(int number) {
		int n = 0;
		Random Winningposition = new Random();
		n = Winningposition.nextInt(number);
		return (n == 0 ? 1 : n);
	}

	public static void startGame() {
		do {
			int random = rolldice(4);
			int rolldice = rolldice(7);
			System.out.println("---------------------");
			System.out.println("Roll Dice Value : " + rolldice);
			System.out.println("Random value : " + random);
			switch (random) {
			case NOPLAY:
				System.out.println("NOPLAY");
				System.out.println("Position of player : " + position);
				System.out.println("----------------------");
				break;
			case LADDER:
				System.out.println("############## Climb the LADDER ############");
				position += rolldice;
				System.out.println("Position of the  Player = " + position);
				System.out.println("----------------------");
				break;
			case SNAKE:
				System.out.println("~~~~~~~~~~~~~~~~ Bites the SNAKE ~~~~~~~~~~~~");
				position -= rolldice;
				System.out.println("Position of the  Player = " + position);
				System.out.println("----------------------");
				break;
			default:
				break;
			}
			if (position < 0) {
				position = 0;
			}
		} while (position != WINPOINT);
	}

	public static void main(String[] args) {
		System.out.println("---------------------- START-----------------------");

		System.out.println("Player Position At Start: " + position);
		startGame();
		System.out.println("---------------------- END -----------------------");

	}
}