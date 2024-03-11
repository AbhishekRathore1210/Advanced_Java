import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import java.awt.Container;
import java.awt.event.FocusEvent;
import java.awt.event.FocusListener;
import java.awt.*;

class MyFrame extends JFrame implements FocusListener{

    JTextArea ta;
    JButton tf;
    MyFrame(){
        setTitle("Focus Listner...");
        setBounds(100,100,1000,800);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        Container c = getContentPane();setLayout(null);

        Font f = new Font("Arial",5,30);
        ta = new JTextArea();
        ta.setBounds(100,50,300,300);
        ta.setFont(f);
        c.add(ta);

        tf = new JButton("Button");
        tf.setBounds(500,200,100,50);
        tf.setFont(f);
        c.add(tf);
        tf.addFocusListener(this);

        setVisible(true);
    }
    @Override
    public void focusGained(FocusEvent e) {
       ta.setText(ta.getText()+"\n Focus Gained");
    }
    @Override
    public void focusLost(FocusEvent e) {
        ta.setText(ta.getText()+"\n Focus Lost");
    }
}

public class FocusListnerTest {
    public static void main(String[] args){
        new MyFrame();
    }
}
