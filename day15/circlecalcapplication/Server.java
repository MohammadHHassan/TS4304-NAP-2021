package day15.circlecalcapplication;

import java.io.DataInputStream;
import java.io.DataOutputStream;
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
			
			Socket socket = socketServer.accept();
			System.out.println("Client has been connected.");
			
			DataInputStream fromClient = new DataInputStream(socket.getInputStream());
			DataOutputStream toClient = new DataOutputStream(socket.getOutputStream());
			
			while(true)
			{
				double radius = fromClient.readDouble();
				double area = Math.PI*radius*radius;
				
				toClient.writeDouble(area);
				
				System.out.println("\nReceived radius: " + radius);
				System.out.println("Sent area: " + area);
			}
		}
		catch (IOException e)
		{
			e.printStackTrace();
		}
	}
}





