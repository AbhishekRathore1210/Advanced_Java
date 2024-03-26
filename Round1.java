import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.stream.Stream;

import javax.swing.*;
class Stu{
	String name;
	String regNo;
	String c;
	public Stu(String name,String regNo,String c){
		this.name = name;
		this.regNo = regNo;
		this.c = c;
	}
}
public class Round1
{
    /**
     * @param rk
     */
    public static void main(String[] rk)
    {
	//Creating the Frame

	JFrame frame = new JFrame("Reappear Registration");
	frame.setSize(600, 800);
	frame.setDefaultCloseOperation(frame.EXIT_ON_CLOSE);
	frame.getContentPane().setBackground(new Color(255, 254, 145));
	frame.setResizable(false);
	frame.setLocationRelativeTo(null);
	frame.setLayout(null);
	ArrayList<Stu> al = new ArrayList<>();

	//Adding Components in the Frame

	JLabel l = new JLabel("Reappear Registration Form");
	l.setFont(new Font("Serif", 1, 30));
	l.setForeground(Color.BLUE);
	l.setBounds(110, 20, 380, 50);
	frame.add(l);
	
	//Name

	JTextField name = new JTextField("Student Name");
	name.setBounds(200, 100, 200, 40);	frame.add(name);
	name.setFont(new Font("Serif", 0, 20));

	//Registration Number
	
	JTextField regno = new JTextField("Registration Number");
	regno.setBounds(200, 180, 200, 40);	frame.add(regno);
	regno.setFont(new Font("Serif", 0, 20));

	//Course

	String[] courses = { "-- Select Course --", "CSE101", "CSE310", "CSE406", "INT108"};
	JComboBox<String> course = new JComboBox<>(courses);
	course.setBounds(200, 260, 200, 40);	frame.add(course);
	course.setFont(new Font("Serif", 0, 20));

	//Register

	JButton register = new JButton("Register");
	register.setBounds(250, 340, 100, 40);	frame.add(register);
	register.setFont(new Font("Serif", 0, 20));
	register.addActionListener(new ActionListener() {
		public void actionPerformed(ActionEvent e){
			Stream<Stu> st = al.stream();
			int flag = 0;
			for(Stu i:al){
				if((i.regNo).equals(regno.getText()) && i.c.equals(course.getSelectedItem().toString())){
					JOptionPane.showMessageDialog(frame,"Student is Already Registered!!");
						flag = 1;
						break;
				}
			}
			// st.filter(et->et.regNo.equals(regno.getText()) && et.c.equals(course.getSelectedItem().toString()));
			// st.forEach(ab->System.out.println("Student is Already Registered"
			// ));

			if(flag==0){
			al.add(new Stu(name.getText(),regno.getText(),course.getSelectedItem().toString()));
			JOptionPane.showMessageDialog(frame,"Student is Registered Successfully!!");
			}
		}
	});

	//View Option

	JLabel lbl = new JLabel("View Registration Details");
	lbl.setFont(new Font("Serif", 1, 30));
	lbl.setForeground(Color.BLUE);
	lbl.setBounds(130, 460, 380, 50);
	frame.add(lbl);

	JTextField reg = new JTextField("Registration Number");
	reg.setBounds(100, 550, 200, 40);	frame.add(reg);
	reg.setFont(new Font("Serif", 2, 20));
	reg.setForeground(Color.RED);

	JButton view = new JButton("View");
	view.setBounds(320, 550, 180, 40);	frame.add(view);
	view.setFont(new Font("Serif", 3, 24));		view.setBackground(Color.ORANGE);
	view.setForeground(Color.RED);
	view.addActionListener(new ActionListener() {
		public void actionPerformed(ActionEvent e){
			String r = reg.getText().toString();
			JFrame jf = new JFrame("Details..");
			jf.setSize(600, 800);
			jf.getContentPane().setBackground(new Color(255, 254, 145));
			jf.setResizable(false);
			jf.setLocationRelativeTo(null);
			Container c = jf.getContentPane();
			jf.setLayout(null);

			JLabel jt = new JLabel();
			jt.setBounds(100,200,200,100);
			c.add(jt);
			jf.setVisible(true);
			JLabel jl = new JLabel("Student is Registered in these many Courses!!");
			jl.setFont(new Font("Serif", 1, 20));
			jl.setForeground(Color.RED);;
			c.add(jl);
			jl.setBounds(80,80,500,30);
			for(Stu i: al){
				if(i.regNo.equals(r)){
					jt.setText(jt.getText()+"   "+i.c);
					System.out.println();
				}
			}

		}
	});

	frame.setVisible(true);
    }

}