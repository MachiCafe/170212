import java.io.IOException;
import java.net.Socket;

public class MyClient01{
	public static void main(String[] args) {
		Socket sock = null;

		try{
			sock = new Socket(args[0], Integer.parseInt(args[1]));


		}catch(IOException e){
			System.out.println(e);
			System.exit(1);
		}
	}
}