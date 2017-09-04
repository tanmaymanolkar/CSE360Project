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
import java.nio.file.*;


public class Companion extends JPanel
{
	private static JPanel happy, thinking, worry, sorry, master;
	private static JLabel memberName= new JLabel("Adam Brossman"), error= new JLabel("Error");

	private static final int DEFHEIGHT = 300, DEFWIDTH = 300;

	public Companion()
	{
		master= new JPanel();

		happy=  Emote(DEFHEIGHT, DEFWIDTH, "Happy.gif");
		thinking=  Emote(DEFHEIGHT, DEFWIDTH, "Thinking.gif");
		worry=  Emote(DEFHEIGHT, DEFWIDTH, "Worry.gif");
		sorry=  Emote(DEFHEIGHT, DEFWIDTH, "Sorry.gif");

		//Name Panel
		memberName.setFont(memberName.getFont().deriveFont(32f));
		master.add(memberName);

		setLayout(new BorderLayout());
		add(master);
	}

	private static JPanel Emote(int height, int width, String name)
	{
		JPanel emotePanel = new JPanel();

		if(name.contains(".gif") != true)
		{
			name= name +".gif";
		}

		Path file = Paths.get(name);

		if (Files.exists(file))
		{
			ImageIcon icon = new ImageIcon(name);

			Image image = icon.getImage();
			Image newimg = image.getScaledInstance(height, width,  java.awt.Image.SCALE_DEFAULT); // scale it the smooth way
			icon = new ImageIcon(newimg);

			JLabel copyLabel = new JLabel(icon);
			emotePanel.add(copyLabel);
		}
		else
		{
			error.setText("Error: Media data not found");
			emotePanel.add(error);
		}
		return emotePanel;
	}

	public void Happy()
	{
		master.removeAll();
		master.add(happy);
	}

	public void Thinking()
	{
		master.removeAll();
		master.add(thinking);
	}

	public void Worry()
	{
		master.removeAll();
		master.add(worry);
	}

	public void Sorry()
	{
		master.removeAll();
		master.add(sorry);
	}

}
