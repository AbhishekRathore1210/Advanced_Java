import javax.swing.JButton;
import javax.swing.JFrame;
import java.awt.*;
public class BorderLayoutDemo {
    public static void main(String[] args){
        JFrame jf = new JFrame("Border Layout");
        jf.setBounds(100,100,900,600);
        jf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        jf.setLocationRelativeTo(null);
        Container c = jf.getContentPane();

        BorderLayout bl = new BorderLayout(20,10);
        c.setLayout(bl);
        bl.setHgap(20);
        bl.setVgap(20);
        JButton b1 = new JButton("North");
        JButton b2 = new JButton("South");
        JButton b3 = new JButton("East");
        JButton b4 = new JButton("West");
        JButton b5 = new JButton("Center");

        // c.add(b1,BorderLayout.NORTH);
        c.add(b1,BorderLayout.PAGE_START);
        // c.add(b2,BorderLayout.SOUTH);
        c.add(b2,BorderLayout.PAGE_END);
        // c.add(b3,BorderLayout.EAST);
        c.add(b3,BorderLayout.LINE_START);
        // c.add(b4,BorderLayout.WEST);
        c.add(b4,BorderLayout.LINE_END);
        c.add(b5,BorderLayout.CENTER);


        jf.setVisible(true);
    }
}
