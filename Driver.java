//**************************************************************
// AUTHOR: Adam Brossman
// STUDENT ID: 1208719261
// FOR: CSE 205
// FILENAME: Assignment7
// SPECIFICATION: The Assignment 7 creates a WholePanel that is
//					an extension of JPanel, add it to its content, and set
//					a size for the applet.
// DUE DATE: 3/4/2016
// TIME SPENT: approx 6hrs
//**************************************************************

import java.awt.*;
import java.net.*;
import javax.swing.*;


public class Driver extends JApplet
{

	public void init()
	{

		// create a WholePanel object and add it to the applet
		Companion comp = new Companion();

		getContentPane().add(comp);
		comp.Happy();

		//set applet size to 400 X 400
		setSize (750, 750);

	}

}

