import java.net.ServerSocket;
import java.net.Socket;
import java.net.InetAddress;
import java.io.IOException;
import java.io.OutputStream;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.BufferedReader;
import java.io.PrintWriter;


public class MyServer07{
	public static void main(String[] args) {
		Socket clientSock = null;
		ServerSocket servSock = null;
		InputStream is = null;
		OutputStream os = null;
		PrintWriter pw = null;

		try{
			servSock = new ServerSocket(3999,100);

			while(true){
				clientSock = servSock.accept();
				is = clientSock.getInputStream();
				os = clientSock.getOutputStream();
        		InputStreamReader isr = new InputStreamReader(is);
        		BufferedReader br = new BufferedReader(isr);
           		pw = new PrintWriter(os);
           		int i = 0;
           		while(i!=10){
           			String data = br.readLine();
   					pw.println(data);
   					i++;
   				}
				pw.flush();

			}
			
		}catch(IOException e){
			System.out.println(e);
			System.exit(1);
		}
	}
}