import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
public class ComboBaxDemo {
    @SuppressWarnings("unchecked")
    public static void main(String[] args){
        JFrame jf = new JFrame("Combo Box...");
        jf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        jf.setSize(1200,700);
        jf.setLocationRelativeTo(null);
        Container c = jf.getContentPane();
        c.setLayout(null); // user has to set every components  size and location

        JLabel jl  = new JLabel("Menu..");
        jl.setBounds(100,50,100,40);
        c.add(jl);


        Font f = new Font("Arial",Font.BOLD,15);
        String values[] = {"Parle - G","Dairy Milk","Pepsi","Chips"};
        @SuppressWarnings("rawtypes")
        JComboBox jc = new JComboBox(values);
        jc.setBounds(100,100,110,25);
        jc.addItem("Ice-Cream");
        // jc.setEditable(true);
        jc.setSelectedItem("Ice-Cream");
        jc.setSelectedIndex(4);
        c.add(jc);
    
        JLabel display = new JLabel("");
        display.setBounds(250,100,100,40);
        display.setForeground(Color.red);
        display.setFont(f);
        c.add(display);

        JButton btn = new JButton("Show It");
        btn.setBounds(100,200,100,25);
        c.add(btn);
        btn.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e){
                display.setText(jc.getSelectedItem().toString());
            }
        });

        jf.setVisible(true);
}
}
