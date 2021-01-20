package day1;

public class LearningArithmetic
{
	public static void main(String[] args)
	{
		int a=9, b=4;
		int c = a/b;
		System.out.println("c = " + c);
		
		double d=9, e=4;
		double f = d/e;
		System.out.println("f = " + f);
		
		System.out.println("9/4 = " + (9/4));
		System.out.println("9.0/4.0 = " + (9.0/4.0));
		
		double g = Math.pow(2, 3);
		System.out.println("g = " + g);
		
		System.out.println("2 to the power of 3 = " + Math.pow(2, 3));
		
		System.out.println("Square root of 16 = " + Math.sqrt(16));
		
		System.out.println("Remainder for 9/4 = " + (9%4));
	}
}