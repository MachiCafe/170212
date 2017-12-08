import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;
import javax.swing.JLabel;
import java.awt.Container;
import java.awt.GridLayout;
import java.awt.BorderLayout;

public class TestJPasswordField extends JFrame{
	public static void main(String[] args) {
		TestJPasswordField frame = new TestJPasswordField("ALOHA");
		frame.setVisible(true);
	}
	TestJPasswordField(String title){
		setTitle(title);
		setSize(500,400);
		setLocation(400,300);
		setDefaultCloseOperation(EXIT_ON_CLOSE);

		//Panel
		JPanel pnl = new JPanel();
		pnl.setLayout(new GridLayout(2, 2));
		//Label
		JLabel lbl1 = new JLabel("Email");
		JLabel lbl2 = new JLabel("Password");
		//Text Field
		JTextField txt = new JTextField(30);
		//PasswordField
		JPasswordField pass = new JPasswordField(30);

		pnl.add(lbl1);
		pnl.add(txt);

		pnl.add(lbl2);
		pnl.add(pass);

		Container cont = getContentPane();
		cont.add(pnl, BorderLayout.NORTH);

	}
}