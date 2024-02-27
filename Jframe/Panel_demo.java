import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

import java.awt.*;
public class Panel_demo{
    public static void main(String[] args){
         JFrame jf = new JFrame("Panel Demo");
        jf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        jf.setBounds(200, 100, 800, 500);
        Container c = jf.getContentPane();
        c.setLayout(null);

        JPanel jp = new JPanel();
        jp.setBounds(10,10,200,300);
        jp.setBackground(Color.yellow);
        jp.setLayout(null);
        c.add(jp);

        JPanel jp2 = new JPanel();
        jp2.setBounds(100,100,100,200);
        jp2.setBackground(Color.blue);
        jp2.setLayout(null);
        jp.add(jp2);

        JButton jb = new JButton("Hello");
        jb.setBounds(0,0,100,50);
        c.add(jb);
        jf.setVisible(true);
}
}