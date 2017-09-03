import java.awt.*;
import java.io.File;
import java.io.IOException;
import java.net.MalformedURLException;
import javax.swing.*;

public class Tutor extends JPanel {

	private static JPanel panel;
	//private static JLabel meh= new JLabel ("Stuff");

    Tutor() {
		panel= new JPanel();

		Tutor(1);

        setLayout(new BorderLayout());
		add(panel);
    }

    public void Tutor(int state) {

        if (state >= 1 || state <= 4) {
           JEditorPane editorPane = new JEditorPane();
           editorPane.setEditable(false);



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
        }
    }
}
