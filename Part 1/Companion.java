//**************************************************************
// AUTHOR: Adam Brossman
// STUDENT ID: 1208719261
// FOR: CSE 360
// SPECIFICATION:
// DUE DATE: 3/4/2016
//**************************************************************



import java.awt.*;
import java.net.*;
import javax.swing.*;



public class Companion extends JPanel
{
	private static JPanel name, happy, thinking, worry, sorry, master;
	private static JLabel memberName;

	private static final int DEFHEIGHT = 300, DEFWIDTH = 300;

	public static JPanel Companion()
	{
		master= new JPanel();
		master.setLayout(new GridLayout(2,2));

		happy= Happy();
		thinking= Thinking();
		worry= Worry();
		sorry= Sorry();

		master.add(happy);
		master.add(thinking);
		master.add(worry);
		master.add(sorry);

		return master;
	}

	private static JPanel Emote(int height, int width, String name)
	{
		JPanel panel = new JPanel();

		if(name.contains(".gif") != true)
		{
			name= name +".gif";
		}

		ImageIcon icon = new ImageIcon(name);

		Image image = icon.getImage();
		Image newimg = image.getScaledInstance(height, width,  java.awt.Image.SCALE_DEFAULT); // scale it the smooth way
		icon = new ImageIcon(newimg);

		JLabel copyLabel = new JLabel(icon);
		panel.add(copyLabel);

		return panel;
	}

	public static JPanel Happy()
	{
		return Emote(DEFHEIGHT, DEFWIDTH, "Happy.gif");
	}

	public static JPanel Thinking()
	{
		return Emote(DEFHEIGHT, DEFWIDTH, "Thinking.gif");
	}

	public static JPanel Worry()
	{
		return Emote(DEFHEIGHT, DEFWIDTH, "Worry.gif");
	}

	public static JPanel Sorry()
	{
		return Emote(DEFHEIGHT, DEFWIDTH, "Sorry.gif");
	}

	public JPanel Name()
	{
		return name;
	}

	public static void SetName(String nameIn)
	{
		name= new JPanel();
		memberName= new JLabel(nameIn);
		name.add(memberName);
	}
}
