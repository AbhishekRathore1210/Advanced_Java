import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

import java.awt.*;
public class calculator{
    public static void main(String[] args){
    JFrame jf = new JFrame("Calculator");
        jf.setBounds(100,100,800,600);
        jf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        Container c = jf.getContentPane();
        c.setLayout(null);

        JLabel jl1 = new JLabel("First Number :");
        jl1.setBounds(50,50,100,50);
        c.add(jl1);

        JTextField jt1 = new JTextField();
        jt1.setBounds(150,60,100,25);
        c.add(jt1);

        JLabel jl2 = new JLabel("Second Number :");
        jl2.setBounds(50,100,100,50);
        c.add(jl2);

        JTextField jt2 = new JTextField();
        jt2.setBounds(150,110,100,25);
        c.add(jt2);

        JButton plus = new JButton("+");
        plus.setBounds(50,150,50,25);
        c.add(plus);
        JButton multi = new JButton("*");
        multi.setBounds(110,150,50,25);
        c.add(multi);
        JButton sub = new JButton("-");
        sub.setBounds(170,150,50,25);
        c.add(sub);
        JButton div = new JButton("/");
        div.setBounds(230,150,50,25);
        c.add(div);
        JButton mod = new JButton("%");
        mod.setBounds(290,150,50,25);
        c.add(mod);

        JLabel jl3 = new JLabel("Result :");
        jl3.setBounds(50,190,100,50);
        c.add(jl3);

        JTextField jt3 = new JTextField();
        jt3.setBounds(150,200,100,25);
        c.add(jt3);

        

        jf.setVisible(true);
    }
}
