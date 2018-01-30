import java.io.File;
import java.io.FileReader;
import java.io.BufferedReader;
import java.io.IOException;

public class ReadFileTest{
	String[] tilte = {"Name","Address","Email"};
	public static void main(String[] args)throws Exception{
		try{
			File file = new File("data.txt");
			FileReader fr = new FileReader(file);
			BufferedReader br = new BufferedReader(fr);

			String str;
			while((str = br.readLine()) != null){
				System.out.println(str);
			}
			br.close();
		}catch(IOException e){
			System.out.println(e);
		}
	}
}