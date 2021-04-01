package day17.additionquizmulticlient;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.net.Socket;
import java.text.DecimalFormat;
import java.util.Scanner;

public class Client
{
	public static void main(String[] args)
	{
		try
		{
			Socket socket = new Socket("localhost", 9101);
			
			DecimalFormat df = new DecimalFormat("#.##");
			Scanner scanner = new Scanner(System.in);
			
			DataInputStream fromServer = new DataInputStream(socket.getInputStream());
			DataOutputStream toServer = new DataOutputStream(socket.getOutputStream());
			
			System.out.println("Please enter your name: ");
			String name = scanner.nextLine();
			toServer.writeUTF(name);
			
			int questionNumber=0, marks=0;
			double totalMarks;
			
			while(true)
			{
				questionNumber++;
				
				int randomNumber1 = fromServer.readInt();
				int randomNumber2 = fromServer.readInt();
				
				System.out.println("\nQ" + questionNumber + ": " + randomNumber1 + " + " + randomNumber2 + "?");
				int answer = scanner.nextInt();
				toServer.writeInt(answer);
				
				if(answer==(randomNumber1+randomNumber2))
				{
					marks++;
					totalMarks = ((double)(marks)/questionNumber)*100; // Casting double
					System.out.println("Correct! :) - Current marks = " + df.format(totalMarks) + "%");
				}
				else
				{
					totalMarks = ((double)(marks)/questionNumber)*100; // Casting double
					System.out.println("Incorrect! :( - Current marks = " + df.format(totalMarks) + "%");
				}
				
				toServer.writeDouble(totalMarks);
			}
		}
		catch (IOException e)
		{
			e.printStackTrace();
		}
	}
}






