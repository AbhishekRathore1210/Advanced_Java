import javax.swing.JFrame;
import javax.swing.JPasswordField;

import java.awt.*;

public class Password {
    public static void main(String[] args){
    JFrame jf = new JFrame("Demo to Password Text Field..."); // Also we can use Constructor for setting the Title
        jf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        jf.setBounds(400, 150, 800, 600); // No need to call setSize and setLocation (Location + size)
        Container c = jf.getContentPane();
        c.setLayout(null);

        JPasswordField jp = new JPasswordField("123");
        jp.setBounds(100,100,150,50);
        c.add(jp);
        jp.setFont(new Font("Arial",Font.BOLD,34));
        jp.setEchoChar('$');
        // jp.setEchoChar((char)0);

        


        jf.setVisible(true);
    }
}
