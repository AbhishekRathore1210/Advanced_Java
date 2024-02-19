import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;

import java.awt.*;
public class login {
    
    public static void main(String[] args){
         JFrame jf = new JFrame("Login");
        jf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        jf.setBounds(300, 150, 800, 600);
        Container c = jf.getContentPane();
        c.setLayout(null);

        JLabel Username = new JLabel("User id");
        JLabel Password = new JLabel("Password");
        Username.setSize(100,100);
        Username.setLocation(10,0);
        Password.setSize(100,100);
        Password.setLocation(10,50);
        c.add(Username);
        c.add(Password);

        JTextField jt = new JTextField();
        JPasswordField jp = new JPasswordField();
        jt.setBounds(80,40,100,20);        
        jp.setBounds(80,90,100,20);   
        
        JButton submit = new JButton("Submit");
        submit.setBounds(10,130,80,25);
        c.add(submit);



        c.add(jt);
        c.add(jp);

        jf.setVisible(true);
    }
}
