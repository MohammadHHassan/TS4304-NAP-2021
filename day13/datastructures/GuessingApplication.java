package day13.datastructures;

import java.util.ArrayList;
import java.util.Scanner;

public class GuessingApplication
{
	public static void main(String[] args)
	{
		Scanner scanner = new Scanner(System.in);
		ArrayList<Integer> guessedNumber = new ArrayList<Integer>();
		
		int randomNumber = 1 + (int)(Math.random()*((10-1)+1));
		System.out.println("A random number (1-10) has been generated.\n");
		
		while(true)
		{
			System.out.println("Please enter your guess: ");
			int guess = scanner.nextInt();
			
			if(guess == randomNumber)
			{
				System.out.println("Lurus");
				break;
			}
			else
			{
				for(int i=0 ; i<guessedNumber.size() ; i++)
				{
					if(guessedNumber.get(i) == guess)
					{
						System.out.println("Sudah Teka\n");
						break;
					}
				}
				
				guessedNumber.add(guess);
				System.out.println("Salah\n");
			}
		}
		scanner.close();
	}
}






