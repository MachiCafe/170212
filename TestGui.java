import javax.swing.JFrame;
import javax.swing.JTextField;
import javax.swing.JPanel;
import java.awt.Container;
import java.awt.BorderLayout;

public class TestGui extends JFrame{
	public static void main(String[] args){
		TestGui gui = new TestGui("HELLO");
		gui.setVisible(true);
	}

	TestGui(String title){
		setTitle(title);
		setSize(400,500);
		setLocation(0,0);
		setDefaultCloseOperation(EXIT_ON_CLOSE);

		JPanel panel = new JPanel();
		JTextField text = new JTextField(10);

		panel.add(text);

		Container cont = getContentPane();
		cont.add(panel,BorderLayout.CENTER);
	}
}

