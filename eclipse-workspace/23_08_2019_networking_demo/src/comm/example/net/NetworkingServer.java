package comm.example.net;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;

public class NetworkingServer {
	
		public static void main(String[] args) {
		
		ServerSocket server = null;
		Socket client;
		
		//default port number we are going to use
		int portnumber = 1234;
		
		//create server side socket
		
		try {
			server = new ServerSocket(portnumber);
		} catch (IOException ie) {
			System.out.println("Cannot open socket." +ie);
			System.exit(1);
		}
		System.out.println("Server socket is created" +server);
		
		//wait for the data from client to reply
		
		while(true)
		{
			
			try {
				
				System.out.println("Waiting for connect request");
				client = server.accept();
				
				System.out.println("Connect request is accepted...");
				
				String clientHost= client.getInetAddress().getHostAddress();
				int clientPort=client.getPort();
				System.out.println("Client host " +clientHost+ "Client port" +clientPort);
				
				//read data from client
				InputStream clientIn = client.getInputStream();
				BufferedReader br = new BufferedReader(new InputStreamReader(clientIn));
				String msgFromClient = br.readLine();
				System.out.println("Message received from client ="+msgFromClient);
				
				//send response to the client
				if(msgFromClient!=null && !msgFromClient.equalsIgnoreCase("bye"));
				{
					OutputStream clientOut = client.getOutputStream();
					PrintWriter pw = new PrintWriter(clientOut,true);
					String ansMsg = "Hello, "+ msgFromClient;
					pw.println(ansMsg);
				}
				
				//close sockets
				if(msgFromClient != null  && msgFromClient.equalsIgnoreCase("bye"))
						{
					server.close();
					client.close();
					break;
							
						}
	
			} catch (IOException ie) {
				
			}
		}
		

	}

}
