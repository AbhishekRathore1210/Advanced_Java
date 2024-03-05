import java.awt.Container;

import javax.swing.JButton;
import javax.swing.JFrame;
import java.awt.*;

class MyFrame extends JFrame{
    JButton b1 = new JButton("b1");
    JButton b2 = new JButton("b2");
    JButton b3 = new JButton("b3");
    JButton b4 = new JButton("b4");
    JButton b5 = new JButton("b5");
    MyFrame(){
        setTitle("Grid Layout");
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setBounds(100,100,700,600);
        setLocationRelativeTo(null);
        Container c= getContentPane();
        GridLayout gl = new GridLayout(2,3);
        gl.setVgap(20);
        gl.setHgap(30);
        c.setLayout(gl);
        c.add(b1);
        c.add(b2);
        c.add(b3);
        c.add(b4);
        c.add(b5);

        setVisible(true);
    }
}

public class GridLayoutDemo {
    public static void main(String[] args){
        MyFrame mf = new MyFrame();
    }
}
