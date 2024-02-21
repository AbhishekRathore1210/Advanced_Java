import javax.swing.JFrame;
import javax.swing.JToggleButton;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
public class ToggleBtn {
    public static void main(String[] args){
        JFrame jf = new JFrame("My Toggle Button..");
        jf.setSize(1200,700);
        jf.setLocationRelativeTo(null);
        jf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        Container c = jf.getContentPane();
        c.setLayout(null);

        JToggleButton jtb = new JToggleButton();
        jtb.setBounds(100,100,100,30);
        c.add(jtb);
        jtb.setText("On");
        c.setBackground(Color.white);
        // jtb.setBackground(Color.BLUE);

        jtb.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e){
                if(jtb.isSelected()){
                    jtb.setText("Off");
                    c.setBackground(Color.blue);
                }            
                else{
                    jtb.setText("On");
                    c.setBackground(Color.WHITE);
                }
            }
        });
        jf.setVisible(true);
}
}
