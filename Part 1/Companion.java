//**************************************************************
// AUTHOR: Adam Brossman
// STUDENT ID: 1208719261
// FOR: CSE 360
// SPECIFICATION: holds objects of type Emote (animated gif's) to be displayed by the main program
// DUE DATE: 3/4/2016
//**************************************************************

import java.awt.*;
import java.net.*;
import javax.swing.*;
import java.nio.file.*;


public class Companion extends JPanel
{
	private static Emote happy, thinking, worry, sorry;
	private static JLabel memberName= new JLabel("Adam Brossman"), error= new JLabel("Error");
	private static Color bgColor= new Color(238,238,238), glass = new Color (0,0,0,0);

	private static final int DEFHEIGHT = 300, DEFWIDTH = 300;

	//Counstructors
	public Companion()
	{
		companion();
	}

	public Companion(Color color)
	{
		bgColor= color;
		companion();
	}

	// Constructing method, to be called by constructors
	private void companion()
	{
		happy=  new Emote(DEFHEIGHT, DEFWIDTH, "Happy.gif", bgColor);
		thinking= new Emote(DEFHEIGHT, DEFWIDTH, "Thinking.gif", bgColor);
		worry= new Emote(DEFHEIGHT, DEFWIDTH, "Worry.gif", bgColor);
		sorry= new Emote(DEFHEIGHT, DEFWIDTH, "Sorry.gif", bgColor);

		//Name Panel
		memberName.setFont(memberName.getFont().deriveFont(32f));
		add(memberName);
		setBackground(glass);

	}

	public void size(int height, int width)
	{
		int newSize= 300;
		if (height <= width)
			newSize= height;
		else if (width < height)
			newSize= width;

		happy= new Emote(newSize, newSize, "Happy.gif", bgColor);
		thinking= new Emote(newSize, newSize, "Thinking.gif", bgColor);
		worry= new Emote(newSize, newSize, "Worry.gif", bgColor);
		sorry= new Emote(newSize, newSize, "Sorry.gif", bgColor);
	}


	//Emote states
	public void happy()
	{
		removeAll();
		add(happy);
	}

	public void thinking()
	{
		removeAll();
		add(thinking);
	}

	public void worry()
	{
		removeAll();
		add(worry);
	}

	public void sorry()
	{
		removeAll();
		add(sorry);
	}

	//Phases for less descriptive calling
	public void phase1()
	{
		happy();
	}

	public void phase2()
	{
		thinking();
	}

	public void phase3()
	{
		worry();
	}

	public void phase4()
	{
		sorry();
	}
}
