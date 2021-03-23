package day14.javainputoutput;

import java.io.DataOutputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class LearningDataOutputStream
{
	public static void main(String[] args) throws FileNotFoundException, IOException
	{
		try(DataOutputStream output = new DataOutputStream(new FileOutputStream("data.dat")))
		{
			output.writeUTF("Mohammad");
			output.writeDouble(2.5);
			output.writeBoolean(true);
			
			output.writeUTF("Hj Hassan");
			output.writeDouble(9.9);
			output.writeBoolean(false);
		}
	}
}
