//----------------------------------------------------
//Name : TANMAY MANOLKAR
//Student Id : 1213188390
//FOR CSE 360
//SPECIFICATION:This is Assessor Class. 
//It creates various UI input elements and provides some output.
//DUE DATA : 9/8/2017
//------------------------------------------------------
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;

public class Assessor extends JPanel{



	public JPanel p1;

	public JButton b1,b2,b3,b4;

	public JTextField t1;					//declarations

	public JCheckBox[] cb1;
	
	public JFrame f2;

	



	

	

	public Assessor(){

		createPanel();					//constructor

	}

	

	public void createPanel() {

		

		
		JLabel name = new JLabel("Tanmay Manolkar");			
		name.setFont(name.getFont().deriveFont(32f));			//Constructor calls this function
        add(name, BorderLayout.CENTER);							//initial display created 
		setLayout(new GridLayout(4,3));
		setBackground(new Color(0,0,0,0));

		

	}
	
	public void phase3() {
		
		removeAll();
		b1 = new JButton("option 1");
		b2 = new JButton("option 2");						//creation of buttons with action listener connected
		b3 = new JButton("option 3");
		b1.addActionListener(new buttonPressed());
		b2.addActionListener(new buttonPressed());
		b3.addActionListener(new buttonPressed());

		add(b1);
		add(b2);
		add(b3);
		

		
	}
   
	public void phase4() {
		removeAll();
		JLabel l1 = new JLabel("enter text in textbox and then click submit");
		t1 = new JTextField("");
		b4 = new JButton("submit");						//creation of a text field and a button with action listener connected
		b4.addActionListener(new buttonPressed());
		add(l1);
		add(t1);
		add(b4);

		

		
		
	}
	
	public void phase1()
	{
		removeAll();
		String[] str1 = {"Option 1","option 2","option 3"};		//creation of the combo boxes with action listener connected

		JComboBox<String> cb2 = new JComboBox<String>(str1);
		cb2.addActionListener(new buttonPressed());												
		add(cb2);
		
		
	}
	
	public void phase2() {
		removeAll();
		cb1 = new JCheckBox[3];

		for (int y=0;y<3;y++) {									// creation of check boxes with action listener with action listener connected

			cb1[y] = new JCheckBox();

			cb1[y].setText("option" + y);

			cb1[y].addActionListener(new buttonPressed());	
			add(cb1[y]);
		
	}
		
	}
	class buttonPressed implements ActionListener{

		 public void actionPerformed(ActionEvent e) {			//Action listener defined

			 JOptionPane.showMessageDialog(f2, "Hello World!");
				t1.setText("");


		}

	}







}
