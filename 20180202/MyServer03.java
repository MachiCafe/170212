import java.net.ServerSocket;
import java.net.Socket;
import java.net.InetAddress;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.BufferedReader;
import java.io.PrintWriter;

public class MyServer03{
	public static void main(String[] args) {
		Socket clientSock = null;
		ServerSocket servSock = null;
		InputStream is = null;
		PrintWriter pw = null;

		try{
			servSock = new ServerSocket(5999,100);

			while(true){
				clientSock = servSock.accept();
				is = clientSock.getInputStream();
        		InputStreamReader isr = new InputStreamReader(is);
        		BufferedReader br = new BufferedReader(isr);

        		String data = "";
        		while((data=br.readLine())!=null){
        			//input data
  					System.out.println("Client: "+data);
  					
  				}	
			}
			
		}catch(IOException e){
			System.out.println(e);
			System.exit(1);
		}
	}
}