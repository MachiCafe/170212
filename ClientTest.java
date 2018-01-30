import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.Socket;
import java.io.DataOutputStream;
import java.io.OutputStream;
import java.io.DataInputStream;
import java.io.InputStream;


public class ClientTest{
	public static void main(String[] args){
		Socket readsock = null;
		InputStream instr = null;
		OutputStream outstr = null;
		boolean cont = true;
		try{
			readsock = new Socket("172.16.21.39",8000);
			instr = readsock.getInputStream();
			outstr = readsock.getOutputStream();
			DataInputStream dataIn = new DataInputStream(instr);
			System.out.println(dataIn.readUTF());
			readsock.close();
		}catch(Exception e){
			System.err.println(e);
			System.exit(1);
		}

		while(cont){
			try{
				readsock = new Socket("172.16.21.39",8000);
				instr = readsock.getInputStream();
				outstr = readsock.getOutputStream();
				BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
				String data = br.readLine();
				System.out.println(data);
				DataOutputStream dataOut = new DataOutputStream(outstr);
				dataOut.writeUTF(data);
				DataInputStream dataIn = new DataInputStream(instr);
				System.out.println(dataIn.readUTF());
				readsock.close();
			}catch(Exception e){
				cont = false;
			}
			
		} 

		try{
			instr.close();
		}catch(Exception e){
			System.err.println(e);
			System.exit(1);
		}
		
	}
}