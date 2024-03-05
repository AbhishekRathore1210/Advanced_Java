import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JTextArea;
class MyFrame extends JFrame implements ActionListener{
    JMenuBar bar;
    JMenu file,edit;
    JMenuItem f1,f2,f3,f4,f5,f6,f7,f8,f9,f10,f11,e1,e2,e3,e4;
    JTextArea jt;
    Container c;
    MyFrame(){
        c = getContentPane();
        c.setLayout(null);

        jt = new JTextArea();
        jt.setLineWrap(true);
        jt.setBounds(10,10,1000,700);
        c.add(jt);
    bar = new JMenuBar();

       // create menu
       file = new JMenu("file");
       // menu item for file
       f1 = new JMenuItem("New Tab");
       f1.addActionListener(this);
    //    JMenuItem f2 = new JMenuItem("New Window");
       f3 = new JMenuItem("Open");
       f4 = new JMenuItem("Save");
       f5 = new JMenuItem("Save-as");
       f6 = new JMenuItem("Save All");
       file.add(f1);
    //    file.add(f2);
       file.add(f3);
       file.add(f4);
       file.add(f5);
       file.add(f6);
       
       bar.add(file);
       
       // menu item for edit
       edit = new JMenu("Edit");
       e1 = new JMenuItem("Cut");
       e2 = new JMenuItem("Copy");
       e3 = new JMenuItem("Paste");
       e4 = new JMenuItem("Collect All");
       edit.add(e1);
       e1.addActionListener(this);
       edit.add(e2);
       e2.addActionListener(this);
       edit.add(e3);
       e3.addActionListener(this);
       edit.add(e4);
       bar.add(edit);
       
       this.setJMenuBar(bar);

    }
    //    JMenu view = new JMenu("View");
    //    JMenuItem v1 = new JMenuItem("Side-View");
    //    JMenuItem v2 = new JMenuItem("Top-View");
    //    JMenuItem v3 = new JMenuItem("Bottom-View");
    //    view.add(v1);
    //    view.add(v2);
    //    view.add(v3);
    //    bar.add(view);

    public void actionPerformed(ActionEvent e){
        if(e.getSource() == f1){
            jt.setText("");
        }
        else if(e.getSource() == e1){
            jt.cut();
        }
        else if(e.getSource() == e2){
            jt.copy();
        }
        else if(e.getSource() == e3){
            jt.paste();
        }
        else if(e.getSource() == f6){
            
        }
    }
}
public class my_notepad {
    public static void main(String[] args){
        MyFrame mf = new MyFrame();
        mf.setTitle("My-NotePad");
        mf.setBounds(100,100,1000,600);
        mf.setDefaultCloseOperation(MyFrame.EXIT_ON_CLOSE);

        
        mf.setVisible(true);

    }   
}
