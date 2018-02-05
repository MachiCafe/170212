import java.net.ServerSocket;
import java.net.Socket;
import java.net.InetAddress;
import java.io.IOException;
import java.io.OutputStream;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.BufferedReader;
import java.io.PrintWriter;
import java.util.Date;

public class MyServer05{
	public static void main(String[] args) {
		Socket clientSock = null;
		ServerSocket servSock = null;
		InputStream is = null;
		OutputStream os = null;
		PrintWriter pw = null;
		Date d;

		try{
			servSock = new ServerSocket(4000,100);

			while(true){
				clientSock = servSock.accept();
				is = clientSock.getInputStream();
				os = clientSock.getOutputStream();
        		InputStreamReader isr = new InputStreamReader(is);
        		BufferedReader br = new BufferedReader(isr);
        		d = new Date();
        		String date = d.toString();
        		String data = "#nmt Hello World!";
        		System.out.println("Client: "+br.readLine());
        		pw = new PrintWriter(os);
        		pw.println(date);

   				pw.println(data);
				pw.flush();

			}
			
		}catch(IOException e){
			System.out.println(e);
			System.exit(1);
		}
	}
}