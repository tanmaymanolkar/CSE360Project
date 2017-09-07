//**************************************************************
// AUTHOR: Steven Garverick
// STUDENT ID: 1207370329
// FOR: CSE 360
// SPECIFICATION: This is the Universe Class. It contains and
// runs all other classes.
// DUE DATE: 3/8/2016
//**************************************************************

import javax.swing.*;
import javax.swing.event.*;
import java.awt.*;

public class Universe extends JFrame{

	JPanel TL = new JPanel();	//Panels to hold Objects
    	JPanel TR = new JPanel();
    	JPanel BL = new JPanel();
    	JPanel BR = new JPanel();

    	Companion comp = new Companion();	//Create Objects to put in panels
    	Assessor assess = new Assessor();
    	Tutor tut = new Tutor();

	private JLabel Steven = new JLabel("Steven Garverick");	//Label for default screen

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
        	container.setBackground(new Color(255,198,39));
        
        	JSlider slider = new JSlider(JSlider.HORIZONTAL, 1, 4, 1); //create slider
        	slider.setMajorTickSpacing(1);
        	slider.setPaintTicks(true);
        	slider.addChangeListener(new SliderListener()); //listen to the slider
        	slider.setBackground(new Color(255,198,39));

        	JPanel TopHalf = new JPanel();	//Panel to hold other panels up top
        	TopHalf.setLayout(new GridLayout(2,2,12,12));	//2X2 grid layout
        	TopHalf.setBackground(new Color(255,198,39));

		// Set font size
        	Steven.setFont(Steven.getFont().deriveFont(32f));

        	//set panel colors
        	TL.setBackground(new Color(0,105,145));
        	TR.setBackground(new Color(0,105,145));
        	BL.setBackground(new Color(0,105,145));
        	BR.setBackground(new Color(0,105,145));
        
        	//ADD objects to corresponding spots on grid and set borders
        	TL.add(comp, BorderLayout.CENTER);
        	TL.setBorder(BorderFactory.createLineBorder(Color.black));
        	TR.add(tut, BorderLayout.CENTER);
        	TR.setBorder(BorderFactory.createLineBorder(Color.black));
        	BL.add(assess, BorderLayout.CENTER);
        	BL.setBorder(BorderFactory.createLineBorder(Color.black));
        	BR.add(Steven, BorderLayout.CENTER);
        	BR.setBorder(BorderFactory.createLineBorder(Color.black));
        
        	//add/organize panels
        	TopHalf.add(TL);
        	TopHalf.add(TR);
        	TopHalf.add(BL);
        	TopHalf.add(BR);
        	container.add(TopHalf);
        	container.add(Box.createRigidArea(new Dimension(0,20)));	//space between slider and panels
        	container.add(slider,BorderLayout.SOUTH);
        	container.add(Box.createRigidArea(new Dimension(0,20)));
        	setVisible(true);
	}
	//function to be called when slider is a position1
	public void position1() {
		Steven.setVisible(false);
		assess.phase1();
		tut.phase1();
		comp.phase1();
		invalidate();
		validate();
		repaint();
	}
	//function to be called when slider is at position2
	public void position2() {
		Steven.setVisible(false);
		assess.phase2();
		tut.phase2();
		comp.phase2();
		invalidate();
		validate();
		repaint();
	}
	//function to be called when slider is at position3
	public void position3() {
		Steven.setVisible(false);
		assess.phase3();
		tut.phase3();
		comp.phase3();
		invalidate();
		validate();
		repaint();
	}
	//function to be called when slider is at position4
	public void position4() {
		Steven.setVisible(false);
		assess.phase4();
		tut.phase4();
		comp.phase4();
		invalidate();
		validate();
		repaint();
	}
	//listen to slider and call functions
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
