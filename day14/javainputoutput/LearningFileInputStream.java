package day14.javainputoutput;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class LearningFileInputStream
{
	public static void main(String[] args) throws FileNotFoundException, IOException
	{
		try(FileInputStream input = new FileInputStream("test2.dat"))
		{
			int value;
			
			value = input.read();			// Read first data
			
			while(value != -1)
			{
				System.out.println(value);
				value = input.read();		// Read next data
			}
		}
	}
}




