package day10.improvedshapesapplication;

import java.util.Scanner;

public class RunProgram
{
	public static void main(String[] args)
	{
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Creating Circle 1...");
		System.out.println("Please enter the colour: ");
		String colour1 = scanner.nextLine();
		System.out.println("Please enter the radius: ");
		double radius1 = scanner.nextDouble();
		scanner.nextLine();
		
		Circle circle1 = new Circle(colour1, radius1);
		
		System.out.println(circle1);
		
		System.out.println("\n\nChanging Circle 1's colour to: ");
		String colour2 = scanner.nextLine();
		
		circle1.editColour(colour2);
		System.out.println(circle1);
	}
}





