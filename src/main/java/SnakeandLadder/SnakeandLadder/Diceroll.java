package SnakeandLadder.SnakeandLadder;

import java.util.Random;

public class Diceroll {
	public static int position = 0;
	int player1 = 0;

	public static int rolldice(int number) {
		int n = 0;
		Random Diceroll = new Random();
		n = Diceroll.nextInt();
		return (n == 0 ? 1 : n);
	}

	public static void main(String[] args) {
		System.out.println("Player1 position: " + position);
		int rolldice = rolldice(7);
		System.out.println("Roll Dice Value: " + rolldice);
	}
}