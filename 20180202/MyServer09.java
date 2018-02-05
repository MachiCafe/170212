import java.net.ServerSocket;
import java.net.Socket;
import java.net.InetAddress;
import java.io.IOException;
import java.io.OutputStream;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.BufferedReader;
import java.io.PrintWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.BufferedWriter;

public class MyServer09{
	public static void main(String[] args)  {
		Socket clientSock = null;
		ServerSocket servSock = null;
		InputStream is = null;
		OutputStream os = null;
		PrintWriter pw = null;
		File file = new File("data.txt");
		

		try{
			servSock = new ServerSocket(3999,100);
						
			FileWriter fr = new FileWriter(file, true);
       		BufferedWriter bw = new BufferedWriter(fr);
			
			
			while(true){
				clientSock = servSock.accept();
				InetAddress address = InetAddress.getLocalHost();
        		System.out.println("IP: "+address.getHostAddress());
        		
				is = clientSock.getInputStream();
				os = clientSock.getOutputStream();
        		InputStreamReader isr = new InputStreamReader(is);
        		BufferedReader br = new BufferedReader(isr);
           		pw = new PrintWriter(os);
           		int i = 0;
           		String data="";
           		while(true){
           			if(data.equals("exit")==true) break;
           			data = br.readLine();
           			bw.write(address.getHostAddress()+" "+data+"\r\n");
           			System.out.println(data);
   					pw.println(data);
   					pw.flush();
   				}
				bw.close();
				System.exit(1);
			}
			
		}catch(IOException e){
			System.out.println(e);
			System.exit(1);
		}
	}
}