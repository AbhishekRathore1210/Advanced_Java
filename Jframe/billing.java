import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JFrame;
import javax.swing.JLabel;

import java.awt.*;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class billing {
    // JCheckBox chk1,chk2,chk3,chk4;
     public static void main(String[] args){
         JFrame jf = new JFrame("My CheckBox button");
        jf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        jf.setSize(1200,700);
        jf.setLocationRelativeTo(null);
        Container c = jf.getContentPane();
        c.setLayout(null);

        JLabel lbl = new JLabel("Ready to Eat..");
        lbl.setBounds(100,50,200,40);
        c.add(lbl);

        JCheckBox pizza = new JCheckBox("Pizza : 200");
        pizza.setBounds(100,150,200,25);
        c.add(pizza);

        JCheckBox Samosa = new JCheckBox("Samosa : 25");
        Samosa.setBounds(100,200,200,25);
        c.add(Samosa);

        JCheckBox paneer = new JCheckBox("paneer : 200");
        paneer.setBounds(100,250,200,25);
        c.add(paneer);

        JCheckBox chai = new JCheckBox("Chai : 20");
        chai.setBounds(100,300,200,25);
        c.add(chai);
        
        JButton amt = new JButton();
        amt.setBounds(200,500,100,25);
        c.add(amt);

        JButton bill = new JButton("Bill..");
        bill.setBounds(100,400,100,25);
        c.add(bill);
        bill.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e){
                float amount = 0;
                if(pizza.isSelected()){
                    amount+=200;
                }
                if(paneer.isSelected()){
                    amount+=200;
                }
                if(chai.isSelected())amount+=20;
                if(Samosa.isSelected())amount+=25;
                amt.setText(Float.toString(amount));
            }
        });

        JLabel l = new JLabel("Bill Amount..");
        l.setForeground(Color.red);
        l.setBounds(100,500,100,25);
        c.add(l);

        

        jf.setVisible(true);

}
}
