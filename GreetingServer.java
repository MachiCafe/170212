import java.io.*;
import java.net.*;

public class GreetingServer{
	public static void main(String[] args) {
			ServerSocket servsock = null;
	
			
			while(true){
				try{
					servsock = new ServerSocket(9999,100);
					Socket server = servsock.accept();
					//System.out.println("Just connected to "+server.getRemoteSocketAddress());
					DataInputStream in = new DataInputStream(server.getInputStream());
				
					//System.out.println(in.readUTF());
					//DataOutputStream out = new DataOutputStream(server.getOutputStream());
					//out.writeUTF("Thanks for connected "+server.getLocalSocketAddress());
					while(!server.isClosed()){
						System.out.println(in.readUTF());
					}
						server.close();			
		
				}catch(IOException ioe){
					System.exit(1);
				}
		}
	}
}