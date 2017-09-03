import java.awt.*;
import java.io.*;
import java.net.MalformedURLException;
import javax.swing.*;

public class Tutor extends JPanel {

	private static JPanel panel;
	//private static JLabel meh= new JLabel ("Stuff");

    Tutor() {
		panel= new JPanel();

		Tutor();

        setLayout(new BorderLayout());
		add(panel);
    }

	public void Tutor() {
		JEditorPane editorPane = new JEditorPane();
		editorPane.setEditable(false);

		File file = new File("P1.html");
		java.net.URL url;

		try {
			url = file.toURI().toURL();
		}
		catch (MalformedURLException e) {
			url = null;
			System.err.println("Error: Attempted to read bad URL");
		}


		try
		{
			editorPane.setPage("http://www.google.com");
		}
		catch (IOException e)
		{
			editorPane.setContentType("text/html");
			editorPane.setText("<html>Could not load http://www.google.com </html>");
		}
		 JScrollPane scrollPane = new JScrollPane(editorPane);
		 panel.add(scrollPane);

       /* if (state >= 1 || state <= 4) {




           panel.add(editorPane);

           String fileName = "P" + state + ".html";

           File file = new File(fileName);

           java.net.URL url;

           try {
                url = file.toURI().toURL();
           }
           catch (MalformedURLException e) {
               url = null;
               System.err.println("Error: Attempted to read bad URL");
           }

           if(url != null) {
               try {
                   editorPane.setPage(url);
               }
               catch (IOException e) {
                   System.err.println("Error: Attempted to read bad URL");
               }
           }
           else {
               System.err.println("Error: Couldn't find file");
           }

           JScrollPane scrollPane = new JScrollPane(editorPane);

           scrollPane.setVerticalScrollBarPolicy(JScrollPane.VERTICAL_SCROLLBAR_ALWAYS);
           scrollPane.setPreferredSize(new Dimension(250,145));
           scrollPane.setMinimumSize(new Dimension(10,10));
        }*/
    }

}
