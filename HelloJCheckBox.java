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

public class HelloJCheckBox extends JFrame implements ActionListener{
	JCheckBox[] check;
	JLabel[] lbl;

	public static void main(String[] args) {
		HelloJCheckBox frame = new HelloJCheckBox("CHECKBOX");
		frame.setVisible(true);
	}

	HelloJCheckBox(String title){
		setTitle(title);
		setSize(400,300);
		setLocation(400,300);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		//CheckBox		
		this.check = new JCheckBox[3];
		this.check[0] = new JCheckBox("JAVA");
		this.check[1] = new JCheckBox("PYTHON");
		this.check[2] = new JCheckBox("C/C++");
		//Label
		this.lbl = new JLabel[3];
		this.lbl[0] = new JLabel();
		this.lbl[1] = new JLabel();
		this.lbl[2] = new JLabel();

		//Panel
		JPanel pnl = new JPanel();
		pnl.setLayout(new GridLayout(3,2));
		for(int i = 0; i<3 ; i++){
			pnl.add(this.check[i]);
			pnl.add(this.lbl[i]);
		}
		//Button 
		JButton button = new JButton("OK");
		JPanel pnlbutton = new JPanel();
		button.addActionListener(this);
		pnlbutton.add(button);

		Container cont = getContentPane();
		cont.add(pnl, BorderLayout.NORTH);
		cont.add(pnlbutton, BorderLayout.CENTER);
	}
	//action lister
	public void actionPerformed(ActionEvent e){
		System.out.println("CLICK!!");
		for(int i = 0; i < 3; i++){
			if(this.check[i].isSelected()){
				this.lbl[i].setText(this.check[i].getText()+"選択");
			}else {
				this.lbl[i].setText("");
			}
		}
	}

}