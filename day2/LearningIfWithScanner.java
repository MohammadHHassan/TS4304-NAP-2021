package day2;

import java.util.Scanner;

public class LearningIfWithScanner
{
	public static void main(String[] args)
	{
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Please enter a value between 5 and 10: ");
		int a = scanner.nextInt();
		
		if(a>=5 && a<=10)
		{
			System.out.println("The value is within the range.");
		}
		else
		{
			System.out.println("The value is NOT in range.");
		}
		
		scanner.close();
	}
}
