import java.io.IOException;
import java.net.Socket;
import java.io.OutputStream;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.BufferedReader;
import java.io.PrintWriter;
import java.util.Scanner;

public class MyClient06{
	public static void main(String[] args) {
		Socket sock = null;
		OutputStream os = null;
		InputStream is = null;
		PrintWriter pw = null;
		Scanner scan = new Scanner(System.in);

		try{
			sock = new Socket(args[0], Integer.parseInt(args[1]));
			
			os = sock.getOutputStream();
        	pw = new PrintWriter(os);
        	
        	is = sock.getInputStream();
        	InputStreamReader isr = new InputStreamReader(is);
        	BufferedReader br = new BufferedReader(isr);

        	//String number = "170212";
        	//pw.println(number);
        	
        	String data;
        	while(true){
        		System.out.print("input data >");
        		data = scan.nextLine();
        		if(!data.equals("exit")) break;
           		pw.println(data);
        		pw.flush();
           	}
        	os.close();
        	is.close();
        	sock.close();
			//System.out.println("Server: "+br.readLine());
			//System.out.println("Server: "+br.readLine());
			
        	//sock.close();
		}catch(IOException e){
			System.out.println(e);
			System.exit(1);
		}
	}
}