import java.net.*;
import java.io.*;

public class ClientChat{
	public static void main(String[] args) {
		Socket sock = null;
		InputStream in = null;
		DataInputStream dataIn = null;
		
		try{
			sock = new Socket("172.16.21.39",8000);
		}catch(IOException e){
			System.out.println(e);
			System.exit(1);
		}
	}
}