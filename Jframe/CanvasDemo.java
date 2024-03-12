import java.awt.*;

import javax.swing.JFrame;
class Canva extends Canvas {
    public void paint(Graphics g){
        Font f = new Font("Arial",10,40);
        g.setFont(f);
        g.drawString("CSE", 100, 50);
        setForeground(Color.BLUE);
        

        g.drawString("Feeling Board..", 100, 200);
        g.fillRect(100,300, 70, 50);
        g.fillOval(100,400,100,50);
        g.setFont(f);
    }
}
public class CanvasDemo{
    public static void main(String[] args){
        Canva c = new Canva();
        JFrame jf = new JFrame();
        jf.setBounds(100,100,1000,800);
        jf.setLocationRelativeTo(null);
        jf.add(c);
        jf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        jf.setVisible(true);
    }
}
