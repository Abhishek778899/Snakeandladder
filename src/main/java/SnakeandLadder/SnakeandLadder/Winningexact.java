package SnakeandLadder.SnakeandLadder;

import java.util.Random;

public class Winningexact {

	public static final int NOPLAY = 1;
	public static final int LADDER = 2;
	public static final int SNAKE = 3;
	final static int WINPOINT = 100;

	public static int position = 0;
	public static int calculatedPosition = 0;
	int player1 = 0;

	public static int rolldice(int number) {
		int n = 0;
		Random Winningexact = new Random();
		n = Winningexact.nextInt(number);
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
				System.out.println("Position of player : " + calculatedPosition);
				System.out.println("----------------------");
				break;
			case LADDER:
				System.out.println("############## Climb the LADDER ############");
				calculatedPosition = calculatePlayerLadderPosition(calculatedPosition, rolldice);
				System.out.println("Position of the  Player = " + calculatedPosition);
				System.out.println("----------------------");
				break;
			case SNAKE:
				System.out.println("~~~~~~~~~~~~~~~~ Bites the SNAKE ~~~~~~~~~~~~");
				calculatedPosition = calculatePlayerSnakeBitePosition(calculatedPosition, rolldice);
				System.out.println("Position of the  Player = " + calculatedPosition);
				System.out.println("----------------------");
				break;
			default:
				break;
			}
		} while (calculatedPosition != WINPOINT);
	}

	public static int calculatePlayerLadderPosition(int position, int dicevalue) {
		position = position + dicevalue;
		if (position > 100) {
			position = position - dicevalue;
		} else if (position == 100) {
			return position;
		}
		return position;
	}

	public static int calculatePlayerSnakeBitePosition(int position, int dicevalue) {
		position = position - dicevalue;
		if (position < 0) {
			position = 0;
		}
		return position;
	}

	public static void main(String[] args) {
		System.out.println("---------------------- START-----------------------");

		System.out.println("Player Position At Start: " + position);
		startGame();
		System.out.println("---------------------- END -----------------------");

	}
}
