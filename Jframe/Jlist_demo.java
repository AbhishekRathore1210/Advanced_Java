import javax.swing.JFrame;
import javax.swing.JList;
import javax.swing.JPanel;
import javax.swing.JScrollPane;

import java.awt.*;
public class Jlist_demo {
    public static void main(String[] args){
        JFrame jf = new JFrame("My Toggle Button..");
        jf.setSize(1200,700);
        jf.setLocationRelativeTo(null);
        jf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        Container c = jf.getContentPane();
        c.setLayout(null);

        String item[] = {"Samosa","Pizza","Juice","Paneer","Tea","Soup","Dosa","abva","xyz"};
        JList list = new JList(item);
        JPanel jp = new JPanel();
        jp.setBounds(10,10,500,400);
        jp.add(new JScrollPane(list));
        jp.add(list);
        jf.add(jp);
        jf.revalidate();

        jf.setVisible(true);


    }
}
