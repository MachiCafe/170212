import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JCheckBox;
import javax.swing.JButton;
import javax.swing.JLabel;
import java.awt.Container;
import java.awt.BorderLayout;
import java.awt.GridLayout;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class JCheckBoxTest extends JFrame implements ActionListener{
	JCheckBox[] check;
	JLabel[] lbl;

	public static void main(String[] args) {
		JCheckBoxTest frame = new JCheckBoxTest("CHECKBOX");
		frame.setVisible(true);
	}

	JCheckBoxTest(String title){
		setTitle(title);
		setSize(400,300);
		setLocation(400,300);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		//CheckBox		
		check = new JCheckBox[3];
		check[0] = new JCheckBox("JAVA");
		check[1] = new JCheckBox("PYTHON");
		check[2] = new JCheckBox("C/C++");
		//Label
		lbl = new JLabel[3];
		lbl[0] = new JLabel();
		lbl[1] = new JLabel();
		lbl[2] = new JLabel();

		//Panel
		JPanel pnl = new JPanel();
		JPanel msg = new JPanel();
		pnl.setLayout(new GridLayout(1,3));
		msg.setLayout(new GridLayout(1,3));
		for(int i = 0; i<3 ; i++){
			pnl.add(check[i]);
			msg.add(lbl[i]);
		}
		//Button 
		JButton button = new JButton("OK");
		button.addActionListener(this);
		JPanel pnlbutton = new JPanel();
		pnlbutton.add(button);

		Container cont = getContentPane();
		cont.add(pnl, BorderLayout.NORTH);
		cont.add(msg, BorderLayout.CENTER);
		cont.add(pnlbutton, BorderLayout.SOUTH);
	}
	//action lister
	public void actionPerformed(ActionEvent e){
		System.out.println("CLICK!!");
		if(check[0].isSelected()){
			lbl[0].setText(check[0].getText()+"選択");
		}else {
			lbl[0].setText("");
		}
		if(check[1].isSelected()){
			lbl[1].setText(check[1].getText()+"選択");
		}else {
			lbl[1].setText("");
		}
		if(check[2].isSelected()){
			lbl[2].setText(check[2].getText()+"選択");
		}else {
			lbl[2].setText("");
		}
	}
}