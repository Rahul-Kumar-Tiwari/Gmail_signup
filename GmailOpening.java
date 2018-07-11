import java.awt.*;
import javax.swing.*;
import java.awt.event.*;
public class GmailOpening
{ 
    JLabel l1,l2,l3,l4;
    JFrame f1,f2;
    JButton b1,b2;
    JPanel p1;
    JScrollPane js1;
    GmailOpening(String n)
    {
         //n=n1;
         f1=new JFrame("GmailOpening");
         f1.setBounds(0,0,1910,1500);

         p1=new JPanel();
         p1.setBounds(0,0,1910,1500);
         f1.add(p1);
         js1=new JScrollPane();
         js1.setBounds(0,0,500,1000);
         p1.add(js1);





         l1=new JLabel("welcome to Gmail");
         l1.setBounds(300,150,1000,100);
         p1.add(l1);
         l1.setForeground(Color.blue);
         Font f3=new Font("Times New Roman",Font.ITALIC,100);
         l1.setFont(f3);

         l2=new JLabel(n);
         l2.setBounds(900,280,700,80);
         p1.add(l2);
         l2.setForeground(Color.green);
	 Font f4=new Font("Times New Roman",Font.ITALIC,80);
         l2.setFont(f4);

          f1.setLayout(null);
          f1.setVisible(true);
	  f1.setResizable(false);
     }
     public static void main(String st[])
     {
       new GmailOpening(null);
     }
}






          
         