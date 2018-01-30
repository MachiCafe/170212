import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JButton;
import javax.swing.ImageIcon;
import java.awt.Font;
import java.awt.BorderLayout;
import java.awt.Container;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseListener;

public class RockPaper extends JFrame implements ActionListener, MouseListener{
	private ImageIcon[] icon = new ImageIcon[3];
	private JLabel lbl01, lbl02, lbl03;
	private JButton btn;
	private int n, userScore, computerScore;
	private String[] gameCase = {"001","002","003"};
	public static void main(String[] args) {
		RockPaper frame = new RockPaper("Rock");
		frame.setVisible(true);
	}

	RockPaper(String title){
		setTitle(title);
		setSize(900,400);
		setLocation(500,500);
		setDefaultCloseOperation(EXIT_ON_CLOSE);

		icon[0] = new ImageIcon("001.jpg");
		icon[1] = new ImageIcon("002.jpg");
		icon[2] = new ImageIcon("003.jpg");

		lbl01 = new JLabel(icon[0]);
		lbl02 = new JLabel(icon[1]);
		lbl03 = new JLabel(icon[2]);

		JPanel p = new JPanel();
		JPanel pnl2 = new JPanel();

		btn = new JButton("Reset");
		pnl2.add(btn);
		btn.addActionListener(this);

		lbl01.addMouseListener(this);
		lbl02.addMouseListener(this);
		lbl03.addMouseListener(this);
		p.add(lbl01);
		p.add(lbl02);
		p.add(lbl03);
		p.setLayout(new GridLayout(1,3));

		Container cont = getContentPane();
		cont.add(p, BorderLayout.NORTH);
		cont.add(pnl2, BorderLayout.CENTER);
	}



	public void actionPerformed(ActionEvent e){
		if(e.getSource()==btn){
								
			lbl01.setIcon(icon[0]);
			lbl02.setIcon(icon[1]);
			lbl03.setIcon(icon[2]);
		}
	}

	public void mouseEntered(MouseEvent e){
  	}

  	public void mouseExited(MouseEvent e){
  	}

  	public void mousePressed(MouseEvent e){
  		String str = e.getSource().toString();
  		String str1 = "(.*)001.jpg(.*)";
  		String str2 = "(.*)002.jpg(.*)";
  		String str3 = "(.*)003.jpg(.*)";
  		n = new java.util.Random().nextInt(3);
  		//1: rock, 2: paper, 3: scissors
		if(str.matches(str1)){
			System.out.println("001");
			lbl01.setIcon(icon[0]);
			lbl02.setIcon(null);
			lbl03.setIcon(icon[n]);
			String icon = "icon0"+String.valueOf(n+1);
			System.out.println(icon);
			int r = result(1,n+1);
			lbl02.setFont(new Font("ＭＳ ゴシック", Font.BOLD, 32));
			if(r==1){
				lbl02.setText("You WIN");
			}else if(r==2){
				lbl02.setText("You LOSE");
			}
		}

		if(str.matches(str2)){
			System.out.println("002");
			lbl01.setIcon(icon[1]);
			lbl02.setIcon(null);
		}

		if(str.matches(str3)){
			System.out.println("003");
			lbl01.setIcon(icon[2]);
			lbl02.setIcon(null);
		}
   	}

  	public void mouseReleased(MouseEvent e){
 	}
	public void mouseClicked(MouseEvent e){
	}

	public int result(int x, int y){
		if(x==y) return 0;
		else if(x==1&&y==3) return 1;
		else if(x==2&&y==1) return 1;
		else if(x==3&&y==2) return 1;
		else return 2;
	}
}