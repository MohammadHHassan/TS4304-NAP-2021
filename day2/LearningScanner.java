package day2;

import java.util.Scanner;

public class LearningScanner
{
	public static void main(String[] args)
	{
		Scanner scanner = new Scanner(System.in);
		
		/*System.out.println("Please enter your first name: ");
		String a = scanner.nextLine();
		
		System.out.println("Please enter your last name: ");
		String b = scanner.nextLine();
		
		System.out.println("Your full name is " + a + " Bin " + b);*/
		
		System.out.println("Please enter an integer value: ");
		try
		{
			int c = scanner.nextInt();
			System.out.println("c = " + c);
		}
		catch (Exception e)
		{
			System.out.println("Integer bah");
			scanner.nextLine();
		}
		
		System.out.println("Please enter a double value: ");
		double d = scanner.nextDouble();
		System.out.println("d = " + d);
		
		scanner.close();
	}
}
