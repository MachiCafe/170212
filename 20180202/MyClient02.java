import java.io.IOException;
import java.net.Socket;
import java.io.OutputStream;
import java.io.InputStreamReader;
import java.io.BufferedReader;
import java.io.PrintWriter;

public class MyClient02{
	public static void main(String[] args) {
		Socket sock = null;
		OutputStream os = null;
		PrintWriter pw = null;

		try{
			sock = new Socket(args[0], Integer.parseInt(args[1]));

			os = sock.getOutputStream();
        	pw = new PrintWriter(os);
        	

        	String data = "ALOHA";
        	pw.println(data);
        	pw.flush();

		}catch(IOException e){
			System.out.println(e);
			System.exit(1);
		}
	}
}