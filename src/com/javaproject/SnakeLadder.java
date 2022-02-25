package com.javaproject;

import java.util.Random;

public class SnakeLadder {
	
	static final int noPlay = 0;
	static final int ladder = 1;
	static final int snake = 2;
	static int count = 0;
	static final int player1 = 1;
	static final int player2 = 2;
	
	public static int positionCheck(int dice,int position,int optionCheck)
	{
		if ((optionCheck == ladder) && (position + dice) <= 100) 
		{
			System.out.println("Ladder");
			position = position + dice;
		}
		
		else if (optionCheck == snake) 
		{
			System.out.println("Snake");
			position = position - dice;
		}
		
		else
		{
			System.out.println("No Play");
		}
		
		if (position < 0)
			position = 0;
		
		System.out.println("position: " + position);
		return position;		
	}
	
	public static void main(String[] args) {
		int playerOnePosition = 0;
		int playerTwoPosition = 0;
		int player = player1;
		System.out.println("playerOnePosition: "+playerOnePosition);
		System.out.println("playerTwoPosition: "+playerTwoPosition);
		Random ran = new Random();
		
		while ((playerOnePosition<100) && (playerTwoPosition<100)) 
		{	
			int dice = ran.nextInt(6)+1;
			System.out.println("dice: "+dice);
			++count;
			int optionCheck = ran.nextInt(3);
			System.out.println("optionCheck: "+optionCheck);
			
			if(player == player1) 
			{
			
				playerOnePosition=positionCheck(dice,playerOnePosition,optionCheck);
				if ((optionCheck == snake) || (optionCheck == noPlay)) 
				{
					player = player2;
				}									
			}
				
			else if (player == player2)
			{
				
				playerTwoPosition=positionCheck(dice,playerTwoPosition,optionCheck);
				
				if ((optionCheck == snake) || (optionCheck == noPlay)) 
				{
					player = player1;
				}
			}
						
		}
			System.out.println();
			System.out.println("Player One Position: " + playerOnePosition);
			System.out.println("Player Two Position" + playerTwoPosition);
			System.out.println("diceCount: " + count);
		
			if(playerOnePosition == 100) 
			{
				System.out.println("Player One Wins");
			}
			else 
			{
				System.out.println("Player Two Wins");
			}   
	}
}
