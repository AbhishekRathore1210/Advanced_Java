import javax.swing.JButton;
import javax.swing.JFrame;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;


class MyFrame extends JFrame implements ActionListener{
    Container c ;
    JButton btn;
    MyFrame(){
        setTitle("My Action Button 1");
        setBounds(300,200,800,600);
        c = this.getContentPane();
        c.setLayout(null);

        btn = new JButton("Click Me");
        btn.setBounds(100,100,100,50);
        btn.setFont(new Font("Arial",Font.BOLD,12));
        c.add(btn);
        btn.addActionListener(this);
    }

    public void actionPerformed(ActionEvent e){
        c.setBackground(Color.BLUE);
    }
}
public class btn_action_1{
    public static void main(String[] args) {
        MyFrame mf = new MyFrame();
        mf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        mf.setVisible(true);
    }
}
