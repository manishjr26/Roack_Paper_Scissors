package com.game;

import java.util.*;

public class MainClass
{
	public static void main(String[] args)
	{
		java.util.Scanner scan=new java.util.Scanner(System.in);
		
		try
		{// rock paper = l    rock  scissors = win     paper rock  = win   paper   scissors  = loose       scissors rock =    scissors  paper = win
			boolean choice=true;
			while(choice)
			{
				System.out.println("\n\n\t\t\t ==================== Welcome To Rock Paper Scissors Game =================== \t\t\t \n Choose among this : \n\t\t R -  Rock \t\t P - Paper \t\t S - Scissors \t\t ");
				String userChoice=scan.nextLine().toUpperCase().trim();
				if(userChoice.equals("R")|| userChoice.equals("S") || userChoice.equals("P"))
				{
					Random random=new Random();
					int computerNumber=random.nextInt(3);
					String[] gameContent={"R", "S", "P"};
					String computerChoice=gameContent[computerNumber];
					System.out.println("Computer :"+computerChoice);
					if(computerChoice.equals(userChoice))
					{
						System.out.println("\n\t\t\t\t\"Its a Tie .\"");
					}else if(userChoice.equals("R") && computerChoice.equals("S") || userChoice.equals("P") && computerChoice.equals("R") || userChoice.equals("S") && computerChoice.equals("P"))
					{
						System.out.println("\n\t\t\t\t\"User Wins . \"");
					}else
						System.out.println("\n\t\t\t\t\"Computer Wins  .\"");
				System.out.println("\n\n\t\t\t\t Do you wish to play again : Y/N");
				String playAgain=scan.nextLine().toUpperCase();
					if(!playAgain.equals("Y"))
					{
						choice=false;
					}					
				}else
					System.err.println("\n\t\t\t\t Input Mis Match. Please enter a valid input. ");
			}
		}catch(InputMismatchException e)
		{
			System.err.println("\n\t\t\t\t Input Mis Match. Please enter a valid input. ");
			scan.next();
		}
		finally
		{
			scan.close();
		}
	}
}
