import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;
public class Assessor extends JPanel{
	
	
	public JFrame f1;
	public JPanel p1;
	public JButton b1,cbb2;
	public JTextField t1;
	public JCheckBox[] cb1;
	public JFrame f2;
	

	
	
	public Assessor(){
		createPanel();
	}
	
	public void createPanel() {
		
		
		p1 = new JPanel(new GridLayout(4, 3));
		t1 = new JTextField("enter here");
		cb1 = new JCheckBox[3];
		for (int y=0;y<3;y++) {
			cb1[y] = new JCheckBox();
			cb1[y].setText("option" + y);
			p1.add(cb1[y]);
			
		}
		b1 = new JButton("option 1");
		b1.addActionListener(new buttonPressed());
		p1.add(b1);
		p1.add(t1);
		String[] str1 = {"Option 1","option 2","option 3"};
		JComboBox<String> cb1 = new JComboBox<String>(str1);
		p1.add(cb1);
		cbb2 = new JButton("select option");
		cbb2.addActionListener(new buttonPressed());
		p1.add(cbb2);
		f1 = new JFrame("test");
		f1.setLayout(new GridLayout());
		f1.add(p1);
		f1.setVisible(true);
		f1.setSize(300, 250);
		f1.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);  
		
		
		
		
	}
	class buttonPressed implements ActionListener{
		 public void actionPerformed(ActionEvent e) {
			 JOptionPane.showMessageDialog(f2, "heaknj");
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			
			new Assessor();
	}

}
