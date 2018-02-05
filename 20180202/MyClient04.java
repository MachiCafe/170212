import java.io.IOException;
import java.net.Socket;
import java.io.OutputStream;
import java.io.InputStreamReader;
import java.io.BufferedReader;
import java.io.PrintWriter;

public class MyClient04{
	public static void main(String[] args) {
		Socket sock = null;
		OutputStream os = null;
		PrintWriter pw = null;

		try{
			sock = new Socket("172.16.21.56", 4999);

			os = sock.getOutputStream();
        	pw = new PrintWriter(os);
        	

        	String number = "170212";
        	String name = "MachiCafe";
        	String msg = "Good morning!";
        	pw.println(number);
        	pw.flush();
			pw.println(name);
			pw.flush();
			pw.println(msg);
        	pw.flush();
        	sock.close();
		}catch(IOException e){
			System.out.println(e);
			System.exit(1);
		}
	}
}