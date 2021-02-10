package day5;

public class LearningMethod2
{
	public static void main(String[] args)
	{
		System.out.println("Sum from 1-5 = " + sumRangeValues(1,5));
		System.out.println("Sum from 10-15 = " + sumRangeValues(10,15));
		System.out.println("Sum from 20-25 = " + sumRangeValues(20,25));
	}
	
	public static int sumRangeValues(int min, int max)
	{
		int sum=0;
		
		for(int i=min ; i<=max ; i++)
		{
			sum = sum+i;
		}
		
		return sum;
	}
}






