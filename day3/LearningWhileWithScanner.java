package day3;

import java.util.Scanner;

public class LearningWhileWithScanner
{
	public static void main(String[] args)
	{
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Please enter the number 5: ");
		int value = scanner.nextInt();
		int count = 0;
		
		while(value!=5)
		{
			System.out.println("You have entered the wrong value.");
			System.out.println("Please try again: ");
			value = scanner.nextInt();
			count++;
		}
		
		System.out.println("You have entered the correct value.");
		System.out.println("Number of times you entered an incorrect value: " + count);
		
		scanner.close();
	}
}
