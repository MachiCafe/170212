import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.ButtonGroup;
import java.awt.Container;
import java.awt.BorderLayout;
import java.awt.GridLayout;

public class HelloJRadioButton extends JFrame{
	public static void main(String[] args) {
		HelloJRadioButton frame = new HelloJRadioButton("Hello Radio Button");
		frame.setVisible(true);
	}

	HelloJRadioButton(String title){
		setTitle(title);
		setBounds(300,300,400,300);
		setDefaultCloseOperation(EXIT_ON_CLOSE);

		JPanel pnl = new JPanel();

		JRadioButton radio1 = new JRadioButton("Male");
		JRadioButton radio2 = new JRadioButton("Female");
		JRadioButton radio3 = new JRadioButton("Not sure");

		ButtonGroup group = new ButtonGroup();
		group.add(radio1);
		group.add(radio2);
		group.add(radio3);

		pnl.add(radio1);
		pnl.add(radio2);
		pnl.add(radio3);

		Container cont = getContentPane();
		cont.add(pnl, BorderLayout.CENTER);
	}
}