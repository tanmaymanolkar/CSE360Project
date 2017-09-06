import javax.swing.*;
import javax.swing.event.*;
import java.awt.*;


public class Universe extends JFrame{

	JPanel TL = new JPanel();	//Panels to hold Objects
    JPanel TR = new JPanel();
    JPanel BL = new JPanel();
    JPanel BR = new JPanel();

    Companion comp = new Companion(new Color(0,105,145));
    Assessor assess = new Assessor();
	Tutor tutor = new Tutor();

	private JLabel Kaitlyn = new JLabel("Kaitlyn DiLorenzo"), Steven = new JLabel("Steven Garverick");

	public static void main(String[] args) {	//DRIVER
		Universe x = new Universe();
	}

	public Universe(){

		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);	//Program exits when frame closes
        setTitle("Project1");
        setSize(1200,900);
        setLocationRelativeTo(null);	//Frame in middle of screen

        JPanel container = new JPanel();	//Panel to contain the other panels/components

        add(container, BorderLayout.CENTER);//Put Panel in Center position on frame
        container.setLayout(new BoxLayout(container, BoxLayout.Y_AXIS)); // Box layout on the y axis

        JSlider slider = new JSlider(JSlider.HORIZONTAL, 1, 4, 1); //create slider
        slider.setMajorTickSpacing(1);
        slider.setPaintTicks(true);
        slider.addChangeListener(new SliderListener()); //listen to the slider

        JPanel TopHalf = new JPanel();	//Panel to hold other panels up top
        TopHalf.setLayout(new GridLayout(2,2));	//2X2 grid layout

		// Set font sizes
        Kaitlyn.setFont(Kaitlyn.getFont().deriveFont(32f));
        Steven.setFont(Steven.getFont().deriveFont(32f));

        //set panel colors
        TL.setBackground(new Color(0,105,145));
        TR.setBackground(new Color(0,105,145));
        BL.setBackground(new Color(0,105,145));
        BR.setBackground(new Color(0,105,145));

        //ADD objects to corresponding spots on grid and set borders
        TL.add(comp, BorderLayout.CENTER);
        TL.setBorder(BorderFactory.createLineBorder(Color.black));
        TR.add(Kaitlyn, BorderLayout.CENTER);
        TR.setBorder(BorderFactory.createLineBorder(Color.black));
        BL.add(assess, BorderLayout.CENTER);
        BL.setBorder(BorderFactory.createLineBorder(Color.black));
        BR.add(Steven, BorderLayout.CENTER);
        BR.setBorder(BorderFactory.createLineBorder(Color.black));

        //add panels to grid
        TopHalf.add(TL);
        TopHalf.add(TR);
        TopHalf.add(BL);
        TopHalf.add(BR);
        container.add(TopHalf);
        container.add(Box.createRigidArea(new Dimension(0,20)));	//space between slider and panels
        container.add(slider);
        container.add(Box.createRigidArea(new Dimension(0,20)));
        setVisible(true);
	}

	public void position1() {
		Steven.setVisible(false);
		assess.phase1();
		comp.happy();
		tutor.phase1();
		refresh();
	}

	public void position2() {
		Steven.setVisible(false);
		assess.phase2();
		comp.thinking();
		tutor.phase2();
		refresh();
	}

	public void position3() {
		Steven.setVisible(false);
		assess.phase3();
		comp.worry();
		tutor.phase3();
		refresh();
	}

	public void position4() {
		Steven.setVisible(false);
		assess.phase4();
		comp.sorry();
		tutor.phase4();
		refresh();
	}

	private void refresh()
	{
		comp.size(TL.getSize().height -50, TL.getSize().width -50);
		invalidate();
		validate();
		repaint();
	}

	class SliderListener implements ChangeListener {
		public void stateChanged(ChangeEvent e) {
			JSlider slider = (JSlider)e.getSource();
			if(slider.getValue() == 1) {
				position1();
			}
			if(slider.getValue() == 2) {
				position2();
			}
			if(slider.getValue() == 3) {
				position3();
			}
			if(slider.getValue() == 4) {
				position4();
			}
		}
	}
}
