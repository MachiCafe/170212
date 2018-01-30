import java.io.*;
import java.net.*;
import java.util.*;

class SimpleServerProgram{
	public static void main(String[] args) {
		byte[] buff = new byte[1024];
		ServerSocket servsock = null;
		Socket sock;
		OutputStream out;
		InputStream instr;
		String outstr;
		int i;
		Date d;
		boolean cont = true;

		try{
			servsock = new ServerSocket(9999,100);
			while(true){
				sock = servsock.accept();
				System.out.println("kita-");
				d = new Date();
				outstr = "\n"+"Hello world!!"+"\n";
				out	= sock.getOutputStream();
				for(i = 0; i<outstr.length(); i++)
					out.write((int)	outstr.charAt(i));

				out.write('\n');
				instr = sock.getInputStream();
				
				sock.close();
			}
		}catch(IOException ioe){
			System.exit(1);
		}
	}
}