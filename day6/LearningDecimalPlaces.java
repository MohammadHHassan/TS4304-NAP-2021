package day6;

import java.text.DecimalFormat;

public class LearningDecimalPlaces
{
	public static void main(String[] args)
	{
		double pi = 3.14159;
		
		System.out.println("Pi = " + pi);
		System.out.printf("Pi in 2 d.p = %.2f \n", pi);
		
		DecimalFormat a = new DecimalFormat("#.#");
		
		System.out.println("Pi in 1 d.p = " + a.format(pi));
		System.out.println("2.555555 in 1 d.p = " + a.format(2.555555));
		
		System.out.println("Pi in 1 d.p = " + a.format(Math.PI));
	}
}
