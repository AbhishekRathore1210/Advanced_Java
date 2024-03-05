import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import java.awt.*;

public class menu_bar {
    public static void main(String[] args){
       // menu - item -> menu-bar -> conatiner
       JFrame jf = new JFrame("Menu Bar");
       jf.setBounds(250,100,1000,600);
       jf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); 
       Container c = jf.getContentPane();
        c.setLayout(null);

       // create a menu bar
       JMenuBar bar = new JMenuBar();

       // create menu
       JMenu file = new JMenu("file");
       // menu item for file
       JMenuItem f1 = new JMenuItem("New");
       JMenuItem f2 = new JMenuItem("Open");
       JMenuItem f3 = new JMenuItem("Save");
       JMenuItem f4 = new JMenuItem("Save-as");
       file.add(f1);
       file.add(f2);
       file.add(f3);
       file.add(f4);
       bar.add(file);
       
       // menu item for edit
       JMenu edit = new JMenu("Edit");
       JMenuItem e1 = new JMenuItem("Undo");
       JMenuItem e2 = new JMenuItem("Copy");
       JMenuItem e3 = new JMenuItem("Paste");
       JMenuItem e4 = new JMenuItem("Collect All");
       edit.add(e1);
       edit.add(e2);
       edit.add(e3);
       edit.add(e4);
       bar.add(edit);
       // menu item for view
       JMenu view = new JMenu("View");
       JMenuItem v1 = new JMenuItem("Side-View");
       JMenuItem v2 = new JMenuItem("Top-View");
       JMenuItem v3 = new JMenuItem("Bottom-View");
       view.add(v1);
       view.add(v2);
       view.add(v3);
       bar.add(view);

        file.add(edit);
       bar.add(file);
        jf.setJMenuBar(bar);
        jf.setVisible(true);
    }
}
