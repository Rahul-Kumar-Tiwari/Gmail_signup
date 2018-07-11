import java.awt.*;
import javax.swing.*;
import java.awt.event.*;
public class PasswordDemo implements ActionListener
{ 
    JLabel l1,l2,l3,l4;
    JFrame f1,f2;
    JTextField t1,t2;
    JPasswordField p1;
    JButton b1,b2;
    String pass,n1,n,ph;
    PasswordDemo(String password,String name,String n2,String ph1)
    { 
         pass=password;n1=name;n=n2;ph=ph1;
         f1=new JFrame("PasswordDemo");
         f1.setBounds(400,50,800,750);
         l1=new JLabel("One account.All of Google.");
         l1.setBounds(50,40,700,100);
         f1.add(l1);
         Font f3=new Font("Times New Roman",Font.ITALIC,60);
         l1.setFont(f3);
	
         ImageIcon icon=new ImageIcon(ph);
	 l2=new JLabel(icon);
	 l2.setBounds(200,150,250,350);
	 f1.add(l2);
         
         l3=new JLabel(n1);
         l3.setBounds(100,510,700,45);
         f1.add(l3);
         l3.setForeground(Color.green);
	 Font f5=new Font("Times New Roman",Font.ITALIC,45);
         l3.setFont(f5);

	 l2=new JLabel("password");
         l2.setBounds(265,565,200,25);
         f1.add(l2);
         l2.setForeground(Color.blue);
	 Font f4=new Font("Times New Roman",Font.BOLD,25);
     

         p1=new JPasswordField();
         p1.setBounds(350,565,200,25);
         f1.add(p1);

         b1=new JButton("Next");
         b1.setBounds(250,600,300,25);
         f1.add(b1);
         b1.addActionListener(this);

         b2=new JButton("Forget Password");
         b2.setBounds(250,635,300,25);
         f1.add(b2);
         b2.addActionListener(this);





         f1.setLayout(null);
         f1.setVisible(true);
         //f1.setResizable(false);
             
       
    }
     public void actionPerformed(ActionEvent e1)
	{	
		if(e1.getSource()==b1)
		{
			String p=p1.getText();
			if(pass.equals(p))
			{
			  new GmailOpening(n);
                          f1.setVisible(false); 
			}
			else
			{
		           JOptionPane.showMessageDialog(null,"password is wrong please fill a right password","ERROR WINDOW",JOptionPane.ERROR_MESSAGE);
			}
		}
                if(e1.getSource()==b2)
                {
                  new ForgetPassword(pass);
                 
                }
                 

	}
     public static void main(String st[])
     {
       new PasswordDemo(null,null,null,null);
     }
}






