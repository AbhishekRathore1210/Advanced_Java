import javax.swing.*;
import java.awt.*;

public class demo {
    public static void main(String[] args) {

        JFrame jf = new JFrame(); // Also we can use Constructor for setting the Title
        jf.setVisible(true);
        jf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        jf.setBounds(400, 150, 800, 600); // No need to call setSize and setLocation (Location + size)
        Container c = jf.getContentPane();
        c.setLayout(null);

        jf.setTitle("It is my First Frame");
        // System.out.println(jf.getTitle());
        ImageIcon myicon = new ImageIcon("logo.jpg");
        jf.setIconImage(myicon.getImage());
        jf.setResizable(false);
        c.setBackground(Color.red);

    }
}
