import java.awt.Color;
import java.awt.Container;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;

class MyFrame2 extends JFrame implements ActionListener{
    Container c;
    JButton btn1,btn2,btn3,btn4;
    MyFrame2(){
        c = getContentPane();
        c.setLayout(null);
        this.setBounds(400,100,800,600);

        Font f = new Font("Arial",Font.BOLD,20);
        btn1 = new JButton("Red");
        btn1.setBounds(100,100,150,50);
        btn1.setFont(f);
        c.add(btn1);
        
        
        btn2 = new JButton("Greeen");
        btn2.setBounds(300,100,150,50);
        btn2.setFont(f);
        c.add(btn2);
        
        
        btn3 = new JButton("Blue");
        btn3.setFont(f);
        btn3.setBounds(100,200,150,50);
        c.add(btn3);
        
        btn4 = new JButton("Yellow");
        btn4.setBounds(300,200,150,50);
        btn4.setFont(f);
        c.add(btn4);

        btn1.addActionListener(this);
        btn2.addActionListener(this);
        btn3.addActionListener(this);
        btn4.addActionListener(this);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if(btn1 == e.getSource())c.setBackground(Color.RED);
        if(btn2 == e.getSource())c.setBackground(Color.GREEN);
        if(btn3 == e.getSource())c.setBackground(Color.BLUE);
        if(btn4 == e.getSource())c.setBackground(Color.YELLOW);
       
    }
}

public class btn_action_2 {
    public static void main(String[] args){
        MyFrame2 mf2 = new MyFrame2();
        mf2.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        mf2.setVisible(true);
        
    }
}
