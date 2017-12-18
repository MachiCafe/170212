import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JMenuBar;
import javax.swing.JMenu;
import javax.swing.JMenuItem;
import javax.swing.JRadioButton;
import javax.swing.JCheckBox;
import javax.swing.ButtonGroup;
import java.awt.Container;
import java.awt.BorderLayout;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Fukushu extends JFrame implements ActionListener{
	private JMenuItem menuitem3;
	private JButton btn;
	private JRadioButton radio1;
	private JRadioButton radio2;
	private JRadioButton radio3;
	private JCheckBox check1;
	private JCheckBox check2;
	private JCheckBox check3;
	private JLabel lbl;

	public static void main(String[] args) {
		Fukushu frame = new Fukushu("Fukushu");
		frame.setVisible(true);
	}

	Fukushu(String title){
		setTitle(title);
		setBounds(300,300,400,300);
		setDefaultCloseOperation(EXIT_ON_CLOSE);

		JMenuBar menubar = new JMenuBar();

		JMenu menu1 = new JMenu("File");
		JMenu menu2 = new JMenu("Edit");
		JMenu menu3 = new JMenu("Help");

		menubar.add(menu1);
		menubar.add(menu2);
		menubar.add(menu3);

		JMenuItem menuitem1 = new JMenuItem("New");
		JMenuItem menuitem2 = new JMenuItem("Open");
		this.menuitem3 = new JMenuItem("Close");
		JMenuItem menuitem4 = new JMenuItem("Cut");
		JMenuItem menuitem5 = new JMenuItem("Copy");
		JMenuItem menuitem6 = new JMenuItem("Paste");
		JMenuItem menuitem7 = new JMenuItem("Version");
		JMenuItem menuitem8 = new JMenuItem("Index");

		menu1.add(menuitem1);
		menu1.add(menuitem2);
		menu1.add(menuitem3);
		menu2.add(menuitem4);
		menu2.add(menuitem5);
		menu2.add(menuitem6);
		menu3.add(menuitem7);
		menu3.add(menuitem8);

		setJMenuBar(menubar);

		ButtonGroup group = new ButtonGroup();
		this.radio1 = new JRadioButton("Yes");
		this.radio2 = new JRadioButton("No");
		this.radio3 = new JRadioButton("Not sure");

		group.add(this.radio1);
		group.add(this.radio2);
		group.add(this.radio3);

		this.check1 = new JCheckBox("Java");
		this.check2 = new JCheckBox("Python");
		this.check3 = new JCheckBox("C/C++");

		this.btn = new JButton("OK");
		this.btn.addActionListener(this);

		this.lbl = new JLabel();

		JPanel pnl1 = new JPanel();
		JPanel pnl2 = new JPanel();
		JPanel pnl3 = new JPanel();
		pnl1.add(this.radio1);
		pnl1.add(this.radio2);
		pnl1.add(this.radio3);
		pnl2.add(this.check1);
		pnl2.add(this.check2);
		pnl2.add(this.check3);
		pnl3.setLayout(new GridLayout(4,1));
		pnl3.add(pnl1);
		pnl3.add(pnl2);
		pnl3.add(this.lbl);
	
		Container cont = getContentPane();

		cont.add(pnl3,BorderLayout.NORTH);
		cont.add(this.btn,BorderLayout.SOUTH);
	
	}

	public void actionPerformed(ActionEvent e){
		System.out.println("OK!!");
		String line = "";
		if(this.radio1.isSelected()){
			line = line + (this.radio1.getText()) + " ";
		}
		if(this.radio2.isSelected()){
			line = line + (this.radio2.getText()) + " ";
		}
		if(this.radio3.isSelected()){
			line = line + (this.radio3.getText()) + " ";
		}
		if(this.check1.isSelected()){
			line = line + (this.check1.getText()) + " ";
		}
		if(this.check2.isSelected()){
			line = line + (this.check2.getText()) + " ";
		}
		if(this.check3.isSelected()){
			line = line + (this.check3.getText());
		}
		System.out.println(line);
		this.lbl.setText(line);
	}
}