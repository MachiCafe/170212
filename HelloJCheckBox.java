import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JCheckBox;
import java.awt.Container;
import java.awt.GridLayout;
import java.awt.BorderLayout;

public class HelloJCheckBox extends JFrame{
	public static void main(String[] args) {
		HelloJCheckBox frame = new HelloJCheckBox("Check Box");
		frame.setVisible(true);
	}
	HelloJCheckBox(String title){
		setTitle(title);
		setSize(500,400);
		setLocation(500,400);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		//create 3 Check Box
		JCheckBox check1 = new JCheckBox("Java");
		JCheckBox check2 = new JCheckBox("Python");
		JCheckBox check3 = new JCheckBox("C/C++");

		//create Panel
		JPanel pnl = new JPanel();
		//set Grid layout
		pnl.setLayout(new GridLayout(3,1));

		pnl.add(check1);
		pnl.add(check2);
		pnl.add(check3);

		Container cont = getContentPane();
		cont.add(pnl, BorderLayout.NORTH);
	}
}