package day18.chatapplication;

import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Date;

public class Server
{
	public static void main(String[] args)
	{
		try
		{
			ServerSocket socketServer = new ServerSocket(9101);
			System.out.println("Server started at " + new Date());
			
			while(true)
			{
				Socket client1 = socketServer.accept();
				Socket client2 = socketServer.accept();
				
				ChatSession chatSession = new ChatSession(client1, client2);
				
				new Thread(chatSession).start();
			}
		}
		catch (IOException e)
		{
			e.printStackTrace();
		}
	}
}
