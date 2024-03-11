import javax.swing.*;
import java.awt.*;
import java.awt.event.KeyListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;
class MyFrame extends JFrame implements MouseMotionListener
{
JTextArea ta;
JButton btn;

MyFrame() {
setBounds(100, 100, 1000, 800);
setLocationRelativeTo(null);
setDefaultCloseOperation(EXIT_ON_CLOSE);
Container c = getContentPane();
c.setLayout(null);

ta = new JTextArea();
ta.setBounds(10, 200, 400, 600);
ta.setFont(new Font("Arial", Font.BOLD, 30));
c.add(ta);
addMouseMotionListener(this);

btn=new JButton("It is Buttone Area");
btn.setBounds(50, 50, 300, 100);
btn.setFont(new Font("Arial", Font.BOLD, 30));
c.add(btn);
btn.addMouseMotionListener(this);
setVisible(true);
}

@Override
public void mouseDragged(MouseEvent e) {
    // ta.setText("\n Mouse Dragged");
    Graphics g = getGraphics();
    g.setColor(Color.blue);
    g.fillRect(e.getX(), e.getY(), 20, 20);
}

@Override
public void mouseMoved(MouseEvent e) {
    
}
}
public class MouseMotionDemo {
    public static void main(String[] args){
    MyFrame mf = new MyFrame();
    }
}
