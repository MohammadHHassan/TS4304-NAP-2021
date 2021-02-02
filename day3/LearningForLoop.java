package day3;

import java.util.Scanner;

public class LearningForLoop
{
	public static void main(String[] args)
	{
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Please enter your name: ");
		String name = scanner.nextLine();
		
		for(int i=1 ; i<=10 ; i++)
		{
			System.out.println(i + ". " + name);
		}
		
		scanner.close();
	}
}
