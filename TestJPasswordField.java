import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import java.awt.Container;
import java.awt.BorderLayout;

public class TestJPasswordField extends JFrame{
	public static void main(String[] args) {
		TestJPasswordField frame = new TestJPasswordField("ALOHA");
		frame.setVisible(true);
	}
	TestJPasswordField(String title){
		setTitle(title);
		setSize(400,300);
		setLocation(400,300);
		setDefaultCloseOperation(EXIT_ON_CLOSE);

		//Panel
		JPanel pnl = new JPanel();
		//PasswordField
		JPasswordField pass = new JPasswordField(20);

		pnl.add(pass);

		Container cont = getContentPane();
		cont.add(pnl, BorderLayout.CENTER);
	}
}