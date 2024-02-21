// import javax.print.attribute.standard.JobImpressions;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JFrame;
import javax.swing.JLabel;

import java.awt.*;
public class checkBoxButton {
     public static void main(String[] args){
         JFrame jf = new JFrame("My CheckBox button");
        jf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        jf.setBounds(200, 100, 800, 700);
        Container c = jf.getContentPane();
        c.setLayout(null);

        Font f = new Font("Arial",Font.BOLD,10);
        JLabel lbl = new JLabel("Course Completed..");
        lbl.setFont(f);
        lbl.setBounds(100,100,200,50);
        c.add(lbl);

        JCheckBox chk1 = new JCheckBox("Java..");
        chk1.setBounds(150,200,200,50);
        chk1.setFont(f);
        chk1.setSelected(true);
        c.add(chk1);

        JCheckBox chk2 = new JCheckBox("CPP");
        chk2.setBounds(150,300,200,50);
        chk2.setFont(f);
        c.add(chk2);

        JCheckBox chk3 = new JCheckBox("Python");
        chk3.setBounds(150,400,200,50);
        chk3.setFont(f);
        c.add(chk3);

        JCheckBox chk4 = new JCheckBox("React");
        chk4.setBounds(150,500,200,50);
        chk4.setFont(f);
        c.add(chk4);

        JButton submit = new JButton("Submit");
        submit.setBounds(150,600,200,50);
        submit.setFont(f);
        c.add(submit);

        jf.setVisible(true);
}
}
