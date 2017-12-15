import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JLabel;
import javax.swing.JButton;
import javax.swing.JRadioButton;
import javax.swing.ButtonGroup;
import java.awt.Container;
import java.awt.BorderLayout;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class HelloJRadioButton extends JFrame implements ActionListener{
	private JLabel lbl;

	private JRadioButton radio1;
	private JRadioButton radio2;
	private JRadioButton radio3;

	public static void main(String[] args) {
		HelloJRadioButton frame = new HelloJRadioButton("Hello Radio Button");
		frame.setVisible(true);
	}

	HelloJRadioButton(String title){
		setTitle(title);
		setBounds(300,300,400,300);
		setDefaultCloseOperation(EXIT_ON_CLOSE);

		JPanel pnl = new JPanel();
		pnl.setLayout(new GridLayout(5,1));
		this.lbl = new JLabel();

		JButton btn = new JButton("OK");
		btn.addActionListener(this);
		this.radio1 = new JRadioButton("Male");
		this.radio2 = new JRadioButton("Female");
		this.radio3 = new JRadioButton("Not sure");

		ButtonGroup group = new ButtonGroup();
		group.add(radio1);
		group.add(radio2);
		group.add(radio3);

		pnl.add(radio1);
		pnl.add(radio2);
		pnl.add(radio3);
		pnl.add(lbl);
		pnl.add(btn);

		Container cont = getContentPane();
		cont.add(pnl, BorderLayout.NORTH);
	}

	public void actionPerformed(ActionEvent e){
		if(this.radio1.isSelected()){
			lbl.setText("あなたの性別は男性でしょうか？");
		}else if(this.radio2.isSelected()){
			lbl.setText("あなたの性別は女性でしょうか？");
		}else if(this.radio3.isSelected()){
			lbl.setText("あなたの性別は分からないでしょうか？");
		}
		
	}
}