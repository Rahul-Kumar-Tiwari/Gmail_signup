import java.awt.*;
import javax.swing.*;
import java.awt.event.*;
public class ForgetPassword 
{ 
       JLabel l1,l2,l3,l4;
       JButton b1,b2;
       JFrame f1,f2;
       String pass;
       ForgetPassword(String pass)
       {
         //p1=pass;
         f1=new JFrame("ForgetPassword");
         f1.setBounds(500,500,500,200);
         l1=new JLabel("your password is " +pass);
         l1.setBounds(50,40,700,25);
         f1.add(l1);
         l1.setForeground(Color.blue);
         Font f3=new Font("Times New Roman",Font.BOLD,25);
         l1.setFont(f3);

         f1.setLayout(null);
         f1.setVisible(true);
         f1.setResizable(false);
       }
       public static void main(String st[])
       {
       new ForgetPassword(null);
       }
}





