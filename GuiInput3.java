import javax.swing.*;
 import java.awt.*;
 import java.awt.event.*;
 import java.io.*;   
    public class GuiInput3 extends JFrame implements ActionListener{
        private JButton btn;
      private JTextField tf1, tf2, tf3;
      private JLabel lbl;
      GuiInput3(String title){
        setTitle(title);
        setBounds(0,0,500,500);
          setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
       
          JPanel p = new JPanel();
          p.setLayout(new GridLayout(4,2));
        
          JLabel l1 = new JLabel("名前");
          JLabel l2 = new JLabel("電話番号");
          JLabel l3 = new JLabel("Email");
        
          tf1 = new JTextField("",10);
          tf2 = new JTextField("",10);
          tf3 = new JTextField("",10);
  
          p.add(l1);
         p.add(tf1);
          
          p.add(l2);
         p.add(tf2);
          
          p.add(l3);
          p.add(tf3);
         
         btn = new JButton("登録");
          p.add(btn);
         btn.addActionListener(this);
              
         Container cp = getContentPane();
          cp.add(p, BorderLayout.NORTH);
       }
       
       public void actionPerformed(ActionEvent e){
        //ボタンをクリックする
        if(e.getSource()==btn){
            System.out.println("OK");
            String text1 = tf1.getText();
            String text2 = tf2.getText();
            String text3 = tf3.getText();
              File file = new File("data.txt");
             try{
              FileWriter fr = new FileWriter(file, true);
                  BufferedWriter bw = new BufferedWriter(fr);
              bw.write(text1+","+text2+","+text3+"\r\n");
                  bw.close();
              }catch(IOException ioe){
                 System.out.println(ioe.getMessage());
             }finally{
                  //clear();
             } 
          }
       }
       public static void main(String[] args){
        GuiInput3 gi = new GuiInput3("ようこそ");
          gi.setVisible(true);
      }
    }