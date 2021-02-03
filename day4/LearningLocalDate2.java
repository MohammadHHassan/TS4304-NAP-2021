package day4;

import java.time.LocalDate;
import java.util.Scanner;

public class LearningLocalDate2
{
	public static void main(String[] args)
	{
		LocalDate now = LocalDate.now();
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Please enter your birth year: ");
		int birthYear = scanner.nextInt();
		
		System.out.println("You are " + (now.getYear()-birthYear) + " years old this year.");
		
		scanner.close();
	}
}
