package day18.chatapplication;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.net.Socket;
import java.util.Scanner;

public class Client
{
	public static void main(String[] args)
	{
		try
		{
			Socket socket = new Socket("localhost", 9101);
			
			DataInputStream fromServer = new DataInputStream(socket.getInputStream());
			DataOutputStream toServer = new DataOutputStream(socket.getOutputStream());
			
			Scanner scanner = new Scanner(System.in);
			
			System.out.println("Please enter your chat ID: ");
			String chatID = scanner.nextLine();
			toServer.writeUTF(chatID);
			
			System.out.println("You are connected with " + fromServer.readUTF());
			
			new Thread(new Runnable()
			{
				@Override
				public void run()
				{
					while(true)
					{
						try
						{
							if(fromServer.available()>0)
							{
								String receivedMsg = fromServer.readUTF();
								System.out.println(">>> " + receivedMsg);
							}
						}
						catch (IOException e)
						{
							e.printStackTrace();
						}
					}
				}
			}).start();
			
			while(true)
			{
				String msg = scanner.nextLine();
				toServer.writeUTF(msg);
			}
		}
		catch (IOException e)
		{
			e.printStackTrace();
		}
	}
}
