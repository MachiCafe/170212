import java.io.IOException;
import java.net.Socket;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.BufferedReader;

public class MyClient03{
	public static void main(String[] args) {
		Socket sock = null;
		InputStream is = null;
		

		try{
			sock = new Socket(args[0], Integer.parseInt(args[1]));

			is = sock.getInputStream();
        	InputStreamReader isr = new InputStreamReader(is);
        	BufferedReader br = new BufferedReader(isr);

        	String data = br.readLine();

        	//input data
  			System.out.println("Server: "+data);

		}catch(IOException e){
			System.out.println(e);
			System.exit(1);
		}
	}
}