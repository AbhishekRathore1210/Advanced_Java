import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;

import java.awt.*;

public class label_demo {
    public static void main(String[] args){
         JFrame jf = new JFrame("Label Demo...");
        jf.setVisible(true);
        jf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        jf.setBounds(400, 150, 800, 600);
        Container c = jf.getContentPane();
        c.setLayout(null);

        ImageIcon img = new ImageIcon("dore.jpg");
        JLabel label = new JLabel("My label",img,JLabel.RIGHT);
        label.setSize(img.getIconWidth(),img.getIconHeight());
        label.setLocation(100,100);
        // label.setBounds(100,100,800,500);
        c.add(label);

        Font f = new Font("Calibri",Font.BOLD,30);
        label.setFont(f);
        label.setBackground(Color.YELLOW); // background color
        label.setForeground(Color.blue); //text color
        label.setOpaque(true);

        label.setIcon(img);

    }
}
