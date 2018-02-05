import javax.swing.*;
import java.io.*;
import java.io.IOException;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Aloha extends JFrame implements ActionListener{
	JButton btn;
	JLabel lbl;

	public static void main(String[] args) throws IOException{
		Aloha frame = new Aloha("INPUT");
		frame.setVisible(true);
	}

	Aloha(String title){
		setTitle(title);
		setSize(400,300);
		setLocation(500,400);
		setDefaultCloseOperation(EXIT_ON_CLOSE);

		JTextField text = new JTextField();
	
		lbl = new JLabel();

		btn = new JButton("OK");
		btn.addActionListener(this);

		JPanel panel = new JPanel();
		panel.add(lbl);
		panel.add(btn);
		panel.setLayout(new GridLayout(2,1));

		Container cont = getContentPane();
		cont.add(panel, BorderLayout.CENTER);
	
		
	}

	 public void actionPerformed(ActionEvent e){
      	if(e.getSource()==btn){
      		System.out.println("ALOHA!");
      		lbl.setText("ALOHA!");
      		lbl.setFont(new Font("ＭＳ ゴシック", Font.BOLD, 30));
      	} 
      }
}