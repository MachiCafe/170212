import javax.swing.JFrame;
import javax.swing.JCheckBox;
import javax.swing.JPanel;
import java.awt.Container;


public class TestCheckBox extends JFrame{
	public static void main(String[] args){
		TestCheckBox frame = new TestCheckBox("HELLO");
		frame.setVisible(true);
	}

	TestCheckBox(String title){
			setTitle(title);
			setSize(500, 400);
			setLocation(400, 300);
			setDefaultCloseOperation(EXIT_ON_CLOSE);

			JCheckBox check1 = new JCheckBox("Linux");
			JCheckBox check2 = new JCheckBox("MacOC");
			JCheckBox check3 = new JCheckBox("ANdroid");

			//Panel 
			JPanel pnl = new JPanel();

			pnl.add(check1);
			pnl.add(check2);
			pnl.add(check3);

			Container cont = getContentPane();
			cont.add(pnl, BorderLayout.NORTH);
		}
}