import java.awt.Dimension;
import java.io.File;
import java.io.IOException;
import java.net.MalformedURLException;
import javax.swing.*;

public class Tutor extends JPanel {
    
    public static void main(String[] args) throws MalformedURLException {
        Tutor(1);
    }
    
    public static void Tutor(int state) throws MalformedURLException {
        
        if (state >= 1 || state <= 4) {
           JFrame frame = new JFrame();
           
           JEditorPane editorPane = new JEditorPane();
           editorPane.setEditable(false);
           
           frame.setVisible(true);
           
           frame.add(editorPane);
           
           String fileName = "P" + state + ".html";
           
           File file = new File(fileName);
           
           java.net.URL url = file.toURI().toURL();
           
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
