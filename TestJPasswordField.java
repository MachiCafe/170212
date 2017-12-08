import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;
import javax.swing.JLabel;
import java.awt.Container;
import java.awt.BorderLayout;

public class TestJPasswordField extends JFrame{
	public static void main(String[] args) {
		TestJPasswordField frame = new TestJPasswordField("ALOHA");
		frame.setVisible(true);
	}
	TestJPasswordField(String title){
		setTitle(title);
		setSize(700,600);
		setLocation(400,300);
		setDefaultCloseOperation(EXIT_ON_CLOSE);

		//Panel
		JPanel pnl = new JPanel();
		JPanel pnl2 = new JPanel();
		//Label
		JLabel lbl1 = new JLabel("Email");
		JLabel lbl2 = new JLabel("Password");
		//PasswordField
		JPasswordField pass = new JPasswordField(20);

		pnl.add(lbl1);
		pnl2.add(pass);

		Container cont = getContentPane();
		cont.add(pnl, BorderLayout.CENTER);
	}
}