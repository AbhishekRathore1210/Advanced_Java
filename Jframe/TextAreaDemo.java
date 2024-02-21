import java.awt.Container;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextArea;

public class TextAreaDemo {
    public static void main(String[] args){
        JFrame jf = new JFrame("My Text Area");
        jf.setSize(800,700);
        jf.setLocationRelativeTo(null);
        jf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        Container c = jf.getContentPane();
        c.setLayout(null);
        JTextArea txtArea = new JTextArea();
        txtArea.setBounds(100,100,400,300);
        c.add(txtArea);
        txtArea.setFont(new Font("Arial",Font.BOLD,34));
        txtArea.setLineWrap(true);
        // txtArea.setEnabled(false);
        // txtArea.setText("Hello How are You");


        JButton jb = new JButton("Count..");
        jb.setBounds(200,410,150,25);
        c.add(jb);

        JButton jb1 = new JButton();
        jb1.setBounds(300,450,200,25);
        c.add(jb1);
        JButton jb2 = new JButton();
        jb2.setBounds(300,480,150,25);
        c.add(jb2);
        jb.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e){
                String ans = txtArea.getText();
                // String []w = s.split("\\s");  // also use split function
                int cnt = 1;
                for(int i=0;i<ans.length();i++){
                    if(ans.charAt(i)==' ')cnt++;
                }
                jb1.setText(Integer.toString(cnt));
                String l = txtArea.getText();
                int total = l.length();
                jb2.setText(Integer.toString(total));

            }
        });

        JLabel labelWord = new JLabel("Words:");
        labelWord.setBounds(100,450,200,50);
        c.add(labelWord);

        
        JLabel labelchar = new JLabel("Characters:");
        labelchar.setBounds(100,500,200,50);
        c.add(labelchar);

        

        jf.setVisible(true);
    }
}
