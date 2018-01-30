import java.io.*;
import java.net.*;
import java.net.ServerSocket;


public class MultiClientChatServer{
	public static void main(String[] args) {
		ServerSocket servSock = null;
		Socket clientSock = null;
		OutputStream os = null;
		DataOutputStream dataOut = null;
		InputStream is = null;
		DataInputStream dataIn = null;

		try{
			servSock = new ServerSocket(7000,100);
			while(true){
				clientSock = servSock.accept();
				System.out.println("connecting...");

				InetAddress iaClient = clientSock.getInetAddress();
				String ipClient = iaClient.toString();
				System.out.println("IP: "+ipClient);
				os = clientSock.getOutputStream();
				dataOut = new DataOutputStream(os);
				dataOut.writeUTF("Hello World");
			}
		}catch(IOException e){
			System.out.println(e);
			System.exit(1);
		}
	}
}