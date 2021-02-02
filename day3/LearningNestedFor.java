package day3;

public class LearningNestedFor
{
	public static void main(String[] args)
	{
		int i, j;
		
		for(i=0 ; i<5 ; i++)
		{
			for(j=0 ; j<5 ; j++)
			{
				System.out.print(i + "," + j + "\t");
			}
			System.out.println();
		}
	}
}
