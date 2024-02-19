import java.awt.Color;
import java.awt.Container;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;

public class btn_action_3 {
    
    public static void main(String[] args){
        JFrame jf = new JFrame("Anonymous Inner class on button");
        jf.setBounds(100,100,800,600);
        jf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        Container c = jf.getContentPane();
        c.setLayout(null);

        JButton btn = new JButton("Click Me");
        btn.setBounds(100,100,150,50);
        c.add(btn);

        btn.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                c.setBackground(Color.blue);
            }
            
        });
        jf.setVisible(true);
    }
}
