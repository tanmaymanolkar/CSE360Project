package cse360project1;

//**************************************************************
//AUTHOR: Steven Garverick
//STUDENT ID: 1207370329
//FOR: CSE 360
//SPECIFICATION: This is the Universe2 Class. It contains and
//runs all other classes.
//DUE DATE: 10/6/2017
//**************************************************************

import javax.swing.*;
import javax.swing.event.*;
import java.awt.*;
public class Universe2 extends JFrame{
	
	//JPanels to format the layout
	JPanel container = new JPanel();
	JPanel leftContainer = new JPanel();
	JPanel TL = new JPanel();
	JPanel BL = new JPanel();
	JPanel R = new JPanel();
	
	//Objects to be placed in panels
    Companion comp = new Companion();
    Assessor assess = new Assessor();
    listOfPages pages = new listOfPages(0);
    
    double lessonScores[] = new double[10];
    
	public static void main(String[] args) {
		Universe2 x = new Universe2();
	}
	
	public Universe2() {
		Tutor tut = new Tutor();
		//Display the application
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);	//Program exits when frame closes
        setTitle("Probability with Pixel Pete");
        setSize(1200,900);
        setLocationRelativeTo(null);	//Frame in middle of screen
        setVisible(true);
        
        add(container, BorderLayout.CENTER);
        
        
        container.setLayout(new BoxLayout(container, BoxLayout.X_AXIS));
        container.setBackground(new Color(255,198,39));
        container.setBorder(BorderFactory.createEmptyBorder(10,10,10,10));
        container.add(leftContainer);
        container.add(Box.createRigidArea(new Dimension(10,0)));
        container.add(R);
        
        R.setPreferredSize(new Dimension(600,900));
        //R.setBackground(new Color(100,0,25));
        R.add(tut);
        
        leftContainer.setLayout(new GridLayout(2,1,10,10));
        leftContainer.setPreferredSize(new Dimension(300,900));
        leftContainer.setBackground(new Color(255,198,39));
        leftContainer.add(TL);
        leftContainer.add(BL);
        
        //TL.setBackground(new Color(0,25,200));
        TL.add(comp);
        //BL.setBackground(new Color(25,100,0));
        BL.add(assess);
        displayHelp(15);
        
	}
	
	public void displayHelp(int pageNum) {
		
		//set up JFrame that displays help
		JFrame help = new JFrame();
		help.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		help.setTitle("Help");
        help.setSize(750,875);
        help.setLocationRelativeTo(null);	
        help.setVisible(true);
        
        //Set up JPanel to hold Tutor object
        JPanel helpPanel = new JPanel();
        help.add(helpPanel);
        
        //Create tutor object and set to the correct page number
        Tutor helpTut = new Tutor();
        helpPanel.add(helpTut);
        //helpTut.displayPageNum(pageNum);
        
	}
	/*
	public void loadProgress(String input) {
		search for text file named whatever the inputted username is
		*read into array of lesson scores from saved text file
		int x = read in current page from text file
		pages = new listOfPages(x);
	}
	
	public void saveProgress(){
		*create textfile named whatever the username is
		*write to it scores from previous lessons
		*write to it the current page
	}
*/
}
