import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JRadioButton;
import javax.swing.JCheckBox;
import javax.swing.ButtonGroup;
import java.awt.Container;
import java.awt.BorderLayout;
import java.awt.GridLayout;
import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;
import java.io.FileWriter;
import java.io.BufferedWriter;
import java.io.IOException;


public class GuiInput extends JFrame implements ActionListener{
	private JTextField txt1,txt2, txt3, txt4;
	private ButtonGroup group;
	private JLabel lbl;
	private JRadioButton radio1,radio2,radio3;

	public static void main(String[] args) throws IOException {
		GuiInput frame = new GuiInput("GUI INPUT");
		frame.setVisible(true);
	}

	GuiInput(String title){
		setTitle(title);
		setBounds(400,400,500,300);
		setDefaultCloseOperation(EXIT_ON_CLOSE);

		JLabel lbl1 = new JLabel("名前");
		JLabel lbl2 = new JLabel("住所");
		JLabel lbl3 = new JLabel("生年月日");
		JLabel lbl4 = new JLabel("好きなもの");
		JLabel lbl5 = new JLabel("性別");
		
		txt1 = new JTextField(20); //名前
		txt2 = new JTextField(20); //住所
		txt3 = new JTextField(20); //生年月日
		txt4 = new JTextField(20); //好きなもの

		radio1 = new JRadioButton("男性");
		radio2 = new JRadioButton("女性");
		radio3 = new JRadioButton("分からない");
		group = new ButtonGroup();
		group.add(radio1);
		group.add(radio2);
		group.add(radio3);

		JPanel pnl1 = new JPanel();
		JPanel pnl2 = new JPanel();
		JPanel pnl3 = new JPanel();
		pnl1.setLayout(new GridLayout(5,2));
		pnl1.add(lbl1);
		pnl1.add(txt1);
		pnl1.add(lbl2);
		pnl1.add(txt2);
		pnl1.add(lbl3);
		pnl1.add(txt3);
		pnl1.add(lbl4);
		pnl1.add(txt4);
		pnl1.add(lbl5);
		pnl2.add(radio1);
		pnl2.add(radio2);
		pnl2.add(radio3);
		pnl1.add(pnl2);
		
		JButton btn1 = new JButton("OK");
		btn1.addActionListener(this);
		JButton btn2 = new JButton("Clear");
		btn2.addActionListener(this);
		pnl3.add(btn1);
		pnl3.add(btn2);
		lbl = new JLabel("入力してください＞");
		lbl.setForeground(Color.RED);
		Container cont = getContentPane();
		cont.add(pnl1,BorderLayout.NORTH);
		cont.add(lbl,BorderLayout.CENTER);
		cont.add(pnl3,BorderLayout.SOUTH);
	}

	public void actionPerformed(ActionEvent e){
		String btn = e.getActionCommand();
		if(btn.equals("OK")){
			System.out.println("OK");
			String text1 = txt1.getText();
			String text2 = txt2.getText();
			String text3 = txt3.getText();
			String text4 = txt4.getText();
			String text5 = "";

			if(radio1.isSelected()){
				text5 = radio1.getText();
			}else if(radio2.isSelected()){
				text5 = radio2.getText();
			}else if(radio3.isSelected()){
				text5 = radio3.getText();
			}

			if(checkEmpty()){
				File file = new File("data.txt");
				try{
					FileWriter fr = new FileWriter(file, true);
					BufferedWriter bw = new BufferedWriter(fr);
					bw.write(text1+","+text2+","+text3+","+text4+","+text5+"\r\n");
					bw.close();
				}catch(IOException ioe){
					System.out.println(ioe.getMessage());
				}finally{
					clear();
				}
				lbl.setText("完了しました。");
			}
			
		}else if(btn.equals("Clear")){
			System.out.println("Clear");
			clear();
			lbl.setText("Clear！！！");
		}
	}
	//入力欄を消す
	private void clear(){
		txt1.setText("");
		txt2.setText("");
		txt3.setText("");
		txt4.setText("");
		group.clearSelection();
	}
	//
	public boolean checkEmpty(){
		if(txt1.getText().isEmpty()){
			lbl.setText("名前まだ書いていません。");
			return false;
		}else if(txt2.getText().isEmpty()){
			lbl.setText("住所まだ書いていません。");
			return false;
		}else if(txt3.getText().isEmpty()){
			lbl.setText("生年月日まだ書いていません。");
			return false;
		}else if(txt4.getText().isEmpty()){
			lbl.setText("好きなものまだ書いていません。");
			return false;
		}else if(radio1.isSelected()==false &&radio2.isSelected()==false &&radio3.isSelected()==false ){
			lbl.setText("性別を選択してください。。");
			return false;
		}else return true;
	}
}