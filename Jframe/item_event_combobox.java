import java.awt.Color;
import java.awt.Container;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;

import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

class MyFrame extends JFrame implements ItemListener{
    @SuppressWarnings("rawtypes")
    JComboBox jc;
    JLabel jl;
    JTextField jt;
    Container c;
    @SuppressWarnings({ "rawtypes", "unchecked" })
    MyFrame(){
        c = getContentPane();
        c.setLayout(null);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setBounds(250,100,1000,600);

        String values[] = {"Parle - G","Dairy Milk","Pepsi","Chips"};
        jc= new JComboBox(values);
        jc.setBounds(100,100,110,25);
        jc.addItem("Ice-Cream");
        jc.addItemListener(this);
        // jc.setEditable(true);
        // jc.setSelectedItem("Ice-Cream");

        jl = new JLabel();
        jl.setBounds(300,100,500,50);
        jl.setForeground(Color.red);
        c.add(jl);
        c.add(jc);
        this.setVisible(true);
        
    }
    @Override
    public void itemStateChanged(ItemEvent e) {
        jl.setText("Selected: " + jc.getSelectedItem().toString());
    }
}
public class item_event_combobox {
    public static void main(String[] args){
        new MyFrame();

    }
}
