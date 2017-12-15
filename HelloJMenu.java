import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JButton;
import javax.swing.JMenuBar;
import javax.swing.JMenu;
import javax.swing.JMenuItem;
import java.awt.Container;
import java.awt.BorderLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class HelloJMenu extends JFrame implements ActionListener{
	private JMenuItem menuitem3;
	public static void main(String[] args) {
		HelloJMenu frame = new HelloJMenu("JMENUBAR");
		frame.setVisible(true);
	}

	HelloJMenu(String title){
		setTitle(title);
		setBounds(400,400,400,300);
		setDefaultCloseOperation(EXIT_ON_CLOSE);

		JMenuBar menubar = new JMenuBar();

		JMenu menu1 = new JMenu("File");
		JMenu menu2 = new JMenu("Edit");

		menubar.add(menu1);
		menubar.add(menu2);

		JMenuItem menuitem1 = new JMenuItem("New");
		JMenuItem menuitem2 = new JMenuItem("Open");
		menuitem3 = new JMenuItem("Close");
		menuitem3.addActionListener(this);
		menu1.add(menuitem1);
		menu1.add(menuitem2);
		menu1.add(menuitem3);

		setJMenuBar(menubar);

		JPanel pnl = new JPanel();


	}

	public void actionPerformed(ActionEvent e){
		System.exit(0);
	}
}