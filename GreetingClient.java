import java.io.*;
import java.net.*;

public class GreetingClient{
	public static void main(String[] args) {
		//String servName = args[0];
		//int port = Integer.parseInt(args[1]);
		try{
			//System.out.println("Server :"+servName+" on port :"+port);
			Socket client = new Socket("172.16.21.39",9999);
			OutputStream outToServer = client.getOutputStream();
			DataOutputStream out = new DataOutputStream(outToServer);
			out.writeUTF("Hello from "+client.getLocalSocketAddress());
		
			//InputStream inFromServer = client.getInputStream();
			//DataInputStream in = new DataInputStream(inFromServer);
			//System.out.println("Server say: "+in.readUTF());
			String str = new java.util.Scanner(System.in).nextLine();
			out.writeUTF(str);
			client.close();
		}catch(IOException e){
			e.printStackTrace();
		}
	}
}