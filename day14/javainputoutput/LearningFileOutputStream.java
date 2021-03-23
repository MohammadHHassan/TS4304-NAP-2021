package day14.javainputoutput;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class LearningFileOutputStream
{
	public static void main(String[] args) throws FileNotFoundException, IOException
	{
		try(FileOutputStream output = new FileOutputStream("test2.dat"))
		{
			for(int i=1 ; i<=100 ; i++)
			{
				output.write(i);
			}
		}
	}
}







