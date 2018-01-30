import javax.swing.*;
import java.io.*;
import java.io.IOException;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class GuiInput extends JFrame implements ActionListener{
	JButton btn;
	JTextArea txtarea;

	public static void main(String[] args) throws IOException{
		GuiInput frame = new GuiInput("INPUT");
		frame.setVisible(true);
	}

	GuiInput(String title){
		setTitle(title);
		setSize(400,300);
		setLocation(500,400);
		setDefaultCloseOperation(EXIT_ON_CLOSE);

		JTextField text1 = new JTextField();
		JTextField text2 = new JTextField();
		JTextField text3 = new JTextField();

		txtarea = new JTextArea(100,30);

		JLabel lbl1 = new JLabel("NAME");
		JLabel lbl2 = new JLabel("ADDRESS");
		JLabel lbl3 = new JLabel("EMAIL");

		btn = new JButton("OK");
		btn.addActionListener(this);
		JPanel panel = new JPanel();
		JPanel panel2 = new JPanel();
		JPanel panel3 = new JPanel();

		panel.add(lbl1);
		panel.add(text1);
		panel.add(lbl2);
		panel.add(text2);
		panel.add(lbl3);
		panel.add(text3);

		panel.setLayout(new GridLayout(3,2));

		panel2.add(btn);

		panel3.add(txtarea);
		Container cont = getContentPane();
		cont.add(panel, BorderLayout.NORTH);
		cont.add(panel3, BorderLayout.CENTER);
		cont.add(panel2, BorderLayout.SOUTH);
		
	}

	 public void actionPerformed(ActionEvent e){
      	if(e.getSource()==btn){
      		System.out.println("OK");
      		
      		try{
			File file = new File("data.txt");
			FileReader fr = new FileReader(file);
			BufferedReader br = new BufferedReader(fr);

			String str;
			while((str = br.readLine()) != null){
				String[] data = str.split(",");
				txtarea.append("Name: "+data[0]+"\r\n");
				txtarea.append("Address: "+data[1]+"\r\n");
				txtarea.append("Email: "+data[2]+"\r\n");

				System.out.println(str);
				
			}
			br.close();
			}catch(IOException ioe){
				System.out.println(ioe);
			}
      	} 
      }
}