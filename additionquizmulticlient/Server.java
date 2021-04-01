package day17.additionquizmulticlient;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;
import java.text.DecimalFormat;
import java.util.Date;

public class Server
{
	public static void main(String[] args)
	{
		try
		{
			ServerSocket socketServer = new ServerSocket(9101);
			System.out.println("Server started at " + new Date());
			
			DecimalFormat df = new DecimalFormat("#.##");
			
			while(true)
			{
				Socket socket = socketServer.accept();
				
				new Thread(new Runnable()
				{
					@Override
					public void run()
					{
						try
						{
							DataInputStream fromClient = new DataInputStream(socket.getInputStream());
							DataOutputStream toClient = new DataOutputStream(socket.getOutputStream());
							
							String name = fromClient.readUTF();
							System.out.println("\n" + name + " has been connected.");
							
							int questionNumber=0;
							
							while(true)
							{
								questionNumber++;
								
								int randomNumber1 = 10 + (int)(Math.random()*((99-10)+1));
								toClient.writeInt(randomNumber1);
								int randomNumber2 = 10 + (int)(Math.random()*((99-10)+1));
								toClient.writeInt(randomNumber2);
								
								int answer = fromClient.readInt();
								
								String question = "\n" + name + "'s Q" + questionNumber + ": " + randomNumber1 + " + " + randomNumber2 + "?";
								
								if(answer==(randomNumber1+randomNumber2))
								{
									System.out.println(question + " " + answer + " [CORRECT]");
								}
								else
								{
									System.out.println(question + " " + answer + " [INCORRECT]");
								}
								
								double totalMarks = fromClient.readDouble();
								System.out.println(name + " current marks = " + df.format(totalMarks) + "%");
							}
						}
						catch (IOException e)
						{
							e.printStackTrace();
						}
					}
				}).start();
			}
		}
		catch (IOException e)
		{
			e.printStackTrace();
		}
		
	}
}





