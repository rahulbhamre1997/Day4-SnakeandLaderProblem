package com.javaproject;

public class SnakeLadder {
	
	public static void main(String[] args) {
		
		int playersposition=0;
		
		int player1Dice = (int)(Math.floor(Math.random() * 10) % 6) + 1;
        System.out.println("Dice rolled value: " + player1Dice);
	}

}
