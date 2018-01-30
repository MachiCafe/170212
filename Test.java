public class test{
	public static void main(String[] args) {
		for(int i = 0; i < 10; i++){
			String a = "";
			a += (i%2) == 0? "even":"odd";
			System.out.println(i+":"+a);
		}
	}
}