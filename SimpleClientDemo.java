import java.io.*;
import java.net.*;

public class SimpleClientDemo{
	public static void main(String[] args){
		final String serverHost = "localhost";

		Socket socketOfClient = null;
		BufferedWriter os = null;
		BufferedReader is = null;

		try{
			socketOfClient = new Socket(serverHost,9999);

			os = new BufferedWriter(new OutputStreamWriter(socketOfClient.getOutputStream()));

			is = new BufferedReader(new InputStreamReader(socketOfClient.getInputStream()));


		}catch(UnknownHostException e){
			System.err.println("Dont know about host "+ serverHost);
			return;
		}catch(IOException e){
			System.err.println("Couldnt get IO for the connection "+serverHost);
			return;
		}

		try{
			os.write("Hello");
			os.newLine();
			os.flush();
			
		}
	}
}