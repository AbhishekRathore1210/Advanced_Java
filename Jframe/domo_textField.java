import javax.swing.JFrame;
import javax.swing.JTextField;

import java.awt.*;

public class domo_textField {
    public static void main(String[] args){
         JFrame jf = new JFrame("Label Demo...");
        jf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        jf.setBounds(200, 100, 800, 500);
        Container c = jf.getContentPane();
        c.setLayout(null);

        JTextField txt = new JTextField("Text fiels 1.."); // pass a string in parameter for default string
        txt.setSize(200,50);
        txt.setLocation(100,250);
        
        
        c.add(txt);
        txt.setText("My text box");
        txt.setBackground(Color.yellow);
        txt.setForeground(Color.red);
        txt.setEditable(false);
        jf.setVisible(true);

}
}
