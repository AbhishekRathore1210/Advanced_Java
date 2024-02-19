import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.*;

import javax.swing.JButton;
import javax.swing.JFrame;

class GreenClass implements ActionListener{

    public void actionPerformed(ActionEvent e) {
        btn_action_4.c.setBackground(Color.GREEN);
    }

}
class RedClass implements ActionListener{
    public void actionPerformed(ActionEvent e) {
        btn_action_4.c.setBackground(Color.red);
    }
}
class BlueClass implements ActionListener{
    public void actionPerformed(ActionEvent e) {
        btn_action_4.c.setBackground(Color.BLUE);
    }
}
class YelloClass implements ActionListener{
    public void actionPerformed(ActionEvent e) {
        btn_action_4.c.setBackground(Color.yellow);
    }
}
public class btn_action_4 {
    public static Container c;
    public static void main(String[] args){
        JFrame jf = new JFrame("Anonymous Inner class on button");
        jf.setBounds(100,100,800,600);
        jf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        c = jf.getContentPane();
        c.setLayout(null);
        JButton btn1,btn2,btn3,btn4;
 Font f = new Font("Arial",Font.BOLD,20);
        btn1 = new JButton("Red");
        btn1.setBounds(100,100,150,50);
        btn1.setFont(f);
        c.add(btn1);
        btn1.addActionListener(new RedClass());


        btn2 = new JButton("Greeen");
        btn2.setBounds(300,100,150,50);
        btn2.setFont(f);
        c.add(btn2);
        btn2.addActionListener(new GreenClass());

        btn3 = new JButton("Blue");
        btn3.setBounds(100,200,150,50);
        btn3.setFont(f);
        c.add(btn3);
        btn3.addActionListener(new BlueClass());

        btn4 = new JButton("Yellow");
        btn4.setBounds(300,200,150,50);
        btn4.setFont(f);
        c.add(btn4);
        btn4.addActionListener(new YelloClass());

        jf.setVisible(true);
    }
}
