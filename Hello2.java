import javax.swing.*;

public class Hello2 extends JFrame{
	public static void main(String[] args) {
		Hello2 hello = new Hello2("HELLO");
		hello.setVisible(true);
	}

	Hello2(String title){
		setTitle(title);
		setSize(400,300);
		setLocation(400,300);
		setDefaultCloseOperation(EXIT_ON_CLOSE);

	}
}