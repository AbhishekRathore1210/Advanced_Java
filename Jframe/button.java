
import javax.swing.JButton;
import javax.swing.JFrame;
import java.awt.*;
import java.awt.event.*;

public class button{
    Container c;
    public static void main(String[] args) {

        JFrame jf = new JFrame(); 
        jf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        jf.setBounds(400, 150, 800, 600); 
        Container c = jf.getContentPane();
        c.setLayout(null);

        // ImageIcon img = new ImageIcon("submit_img.png");
        JButton jb = new JButton();
        jb.setBounds(250,250,150,50);
        c.add(jb);
        jb.setText("Click Me");
        jb.setFont(new Font("Arial",Font.BOLD,20));
        jb.setBackground(Color.yellow);
        jb.setForeground(Color.red);
        jb.setEnabled(true);
        jb.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e){
                c.setBackground(Color.blue);
        }
        });

        Cursor crsr = new Cursor(Cursor.HAND_CURSOR);
        jb.setCursor(crsr);
        jf.setVisible(true);

        }

}
