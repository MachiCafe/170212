import javax.swing.JFrame;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JLabel;
import javax.swing.JPanel;
import java.awt.Container;
import java.awt.BorderLayout;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.Color;

public class Fukushu extends JFrame implements ActionListener{
	//CheckBoxとLabelを作る
	private JCheckBox check;
	private JLabel lbl;
	public static void main(String[] args) {
		Fukushu frame = new Fukushu("Fukushu");
		frame.setVisible(true);
	}

	Fukushu(String title){
		setTitle(title);
		//SizeとLocationを決める
		setBounds(400,400,300,400);
		setDefaultCloseOperation(EXIT_ON_CLOSE);

		JButton btn = new JButton("Check");
		btn.addActionListener(this);
		this.lbl = new JLabel();
		this.check = new JCheckBox("Java");
		JPanel pnl = new JPanel();
		pnl.setLayout(new GridLayout(2,2));
		pnl.setBackground(Color.ORANGE);

		pnl.add(this.check);
		pnl.add(btn);
		pnl.add(this.lbl);
		Container cont = getContentPane();
		cont.add(pnl, BorderLayout.NORTH);
	}

	public void actionPerformed(ActionEvent e){
		//Checkしたら
		if(this.check.isSelected()){
			this.lbl.setText("Java勉強中");
		}else{//Checkしなかったら
			this.lbl.setText("");
		}
		
	}
}