import javax.swing.ButtonGroup;
import javax.swing.JFrame;
import javax.swing.JRadioButton;

import java.awt.*;

public class radio_btn {
     public static void main(String[] args){
        JFrame jf = new JFrame("My Radio Button");
        jf.setSize(800,700);
        jf.setLocationRelativeTo(null);
        jf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        Container c = jf.getContentPane();
        c.setLayout(null);

        JRadioButton jr = new JRadioButton();
        jr.setBounds(200,200,200,50);
        jr.setText("Male");
        c.add(jr);
       

        JRadioButton jrb = new JRadioButton();
        jrb.setBounds(200,250,200,50);
        jrb.setText("FeMale");
        c.add(jrb);
        jr.setSelected(true);
        

        ButtonGroup gender = new ButtonGroup();
        gender.add(jr);
        gender.add(jrb);

        jf.setVisible(true);
}
}
