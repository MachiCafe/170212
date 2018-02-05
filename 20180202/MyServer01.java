import java.net.ServerSocket;
import java.net.Socket;
import java.io.IOException;

public class MyServer01{
	public static void main(String[] args) {
		Socket clientSock = null;
		ServerSocket servSock = null;

		try{
			servSock = new ServerSocket(6000,100);

			while(true){
				clientSock = servSock.accept();
				
			}
			
		}catch(IOException e){
			System.out.println(e);
			System.exit(1);
		}
	}
}