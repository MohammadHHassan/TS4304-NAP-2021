package day4;

public class Learning2DArrays
{
	public static void main(String[] args)
	{
		String [][] names = new String [3][4];
		
		// Row 0
		names[0][0] = "A";
		names[0][1] = "B";
		names[0][2] = "C";
		names[0][3] = "D";
		
		// Row 1
		names[1][0] = "E";
		names[1][1] = "F";
		names[1][2] = "G";
		names[1][3] = "H";
		
		// Row 2
		names[2][0] = "I";
		names[2][1] = "J";
		names[2][2] = "K";
		names[2][3] = "L";
		
		for(int row=0 ; row<names.length ; row++)
		{
			for(int col=0 ; col<names[row].length ; col++)
			{
				System.out.print(names[row][col] + "\t");
			}
			System.out.println();
		}
	}
}
