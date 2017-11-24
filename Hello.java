import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JButton;
import java.awt.Container;
import java.awt.BorderLayout;

public class Hello extends JFrame{
	public static void main(String[] args) {
		Hello hello = new Hello("hello");
		hello.setVisible(true);
	}

	Hello(String title){
		setTitle(title);
		setSize(400,500);
		setLocation(400,500);
		setDefaultCloseOperation(EXIT_ON_CLOSE);

		JPanel pnl = new JPanel();
		JButton btn = new JButton("Push me!");

		pnl.add(btn);
		Container cont = getContentPane();
		cont.add(pnl,BorderLayout.CENTER);
	}
}