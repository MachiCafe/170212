public class fizzbuzz{
	public static void main(String[] args){
		for(int i = 0; i < 100; i++){
			String test = "";
			test += (i % 3) == 0? "fizz" : "";
			test += (i % 5) == 0? "buzz" : "";
			System.out.println(!test.isEmpty() ? test : i);
		}
	}
}