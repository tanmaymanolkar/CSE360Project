//**************************************************************
// AUTHOR: Adam Brossman
// STUDENT ID: 1208719261
// FOR: CSE 360
// SPECIFICATION: handles loading animated gif's so that they can be be displayed by the companion class
// DUE DATE: 3/4/2016
//**************************************************************



import java.awt.*;
import java.net.*;
import javax.swing.*;
import java.nio.file.*;


public class Emote extends JPanel
{
	private ImageIcon icon;
	private JLabel error = new JLabel("Error");
	private static Color bgColor= new Color(238,238,238), glass = new Color (0,0,0,0);

	//Counstructors
	Emote(int height, int width, String name)
	{
		emote(height, width, name);
	}

	Emote(int height, int width, String name, Color color)
	{
		bgColor= color;
		emote(height, width, name);
		setBackground(bgColor);
	}

	private void emote(int height, int width, String name)
	{
		if(name.contains(".gif") != true)
		{
			name= name +".gif";
		}
		name= "resources/" + name;

		Path file = Paths.get(name);

		if (Files.exists(file))
		{
			icon = new ImageIcon(name);

			Image image = icon.getImage();
			Image newimg = image.getScaledInstance(height, width,  java.awt.Image.SCALE_DEFAULT);
			icon = new ImageIcon(newimg);

			JLabel copyLabel = new JLabel(icon);
			add(copyLabel);
		}
		else
		{
			error.setText("Error: Media data not found");
			error.setForeground(Color.RED);
			error.setFont(error.getFont().deriveFont(32f));
			add(error);
		}
		setBorder(BorderFactory.createEmptyBorder());
	}

	public void emoteSize(int newHeight, int newWidth)
	{
		Image image = icon.getImage();
		Image newimg = image.getScaledInstance(newHeight, newWidth,  java.awt.Image.SCALE_DEFAULT); // scale it the smooth way
		icon = new ImageIcon(newimg);
	}
}
