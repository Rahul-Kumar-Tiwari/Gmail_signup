import java.awt.*;
import javax.swing.*;
import java.awt.event.*;
public class AccountGenerated implements ActionListener
{ 
    JLabel l1,l2,l3,l4,l5;
    JFrame f1,f2;
    JTextField t1,t2;
    JButton b2;
    String user, p1;
    AccountGenerated(String username,String password)
    {

         user=username;p1=password;
         f1=new JFrame("AccountGenerated");
         f1.setBounds(400,50,1200,900);
         l1=new JLabel("One account.All of Google.");
         l1.setBounds(200,40,700,100);
         f1.add(l1);
         Font f3=new Font("Times New Roman",Font.ITALIC,60);
         l1.setFont(f3);

         l2=new JLabel("Congrats your gmail Account is created sucessfully");
         l2.setBounds(50,150,1100,50);
         f1.add(l2);
         l2.setForeground(Color.green);
	 Font f4=new Font("Times New Roman",Font.BOLD,50);
         l2.setFont(f4);

         ImageIcon icon=new ImageIcon("D:/sucessful.png");
         l1=new JLabel(icon);
         l1.setBounds(400,230,225,225);
	 f1.add(l1);   	

         l3=new JLabel("Your Username is = "+user);
         l3.setBounds(50,530,1100,50);
         f1.add(l3);
         l3.setForeground(Color.green);
	 Font f5=new Font("Times New Roman",Font.BOLD,50);
         l3.setFont(f5);

         l4=new JLabel("Your password is ="+p1);
         l4.setBounds(50,600,1100,50);
         f1.add(l4);
         l4.setForeground(Color.green);
	 Font f6=new Font("Times New Roman",Font.BOLD,50);
         l4.setFont(f6);

          l5=new JLabel("Go to login page");
	  l5.setBounds(400,700,600,80);
	  f1.add(l5);
	  l5.setForeground(Color.blue);
          Font f7=new Font("Times New Roman",Font.BOLD,80);
	  l5.setFont(f7);
          ImageIcon camera=new ImageIcon("D:/loginpage.png");
	 
          b2=new JButton(camera);
          b2.setBounds(990,660,186,186);
          f1.add(b2);
          b2.addActionListener(this);

          f1.setLayout(null);
          f1.setVisible(true);
	  f1.setResizable(false);     
    }
    public void actionPerformed(ActionEvent e1)
    {
	if(e1.getSource()==b2)
        {
          new LoginFirst();
          f1.setVisible(false);
         }
     }
     public static void main(String st[])
     {
       new AccountGenerated(null,null);
     }
}




