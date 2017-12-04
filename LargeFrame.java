import javax.swing.JFrame;

public class LargeFrame extends JFrame{
	public static void main(String[] args){
		LargeFrame frame = new LargeFrame("ALOHA");
		frame.setVisible(true);
	}

	LargeFrame(String title){ 
		setTitle(title);
		setSize(1000,1000);
		setLocation(0,0);
		setDefaultCloseOperation(EXIT_ON_CLOSE);

	}
}
