import java.net.ServerSocket;
import java.net.Socket;
import java.net.InetAddress;
import java.io.IOException;
import java.io.OutputStream;
import java.io.PrintWriter;

public class MyServer04{
	public static void main(String[] args) {
		Socket clientSock = null;
		ServerSocket servSock = null;
		OutputStream os = null;
		PrintWriter pw = null;

		try{
			servSock = new ServerSocket(5000,100);

			while(true){
				clientSock = servSock.accept();
				InetAddress add = InetAddress.getLocalHost();
        		System.out.println("IP: "+add.getHostAddress());

        		os = clientSock.getOutputStream();
        		pw = new PrintWriter(os);
        		
        		String data = "HELLO";
        		pw.println(data);
        		pw.flush();
			}
			
		}catch(IOException e){
			System.out.println(e);
			System.exit(1);
		}
	}
}