import java.io.OutputStream;
import java.io.DataOutputStream;
import java.io.InputStream;
import java.io.DataInputStream;
import java.net.ServerSocket;
import java.net.Socket;
import java.io.IOException;

public class SimpleServerTest{
	public static void main(String[] args){
		ServerSocket servsocket = null;
		Socket sock;
		OutputStream out;
		InputStream in;
		int i;

		try{
			servsocket = new ServerSocket(8000, 300);
			while(true){
				sock = servsocket.accept();

				
				DataOutputStream outstr = new DataOutputStream(sock.getOutputStream());
				outstr.writeUTF("Hello World");
			
				DataInputStream instr = new DataInputStream(sock.getInputStream());
				System.out.println(instr.readUTF());
				
				//System.out.println(socket.getInetAddress());
				sock.close();
			}
		}
		
		catch(IOException e){
			System.exit(1);
		}
	}
}