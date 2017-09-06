import java.awt.*;
import java.io.*;
import java.net.MalformedURLException;
import javax.swing.*;

public class Tutor extends JPanel {

    private static File file;
    private static java.net.URL url;
    private static JEditorPane editorPane;
    private static JPanel panel;
    private static JScrollPane scrollPane;
    private static final JLabel NAME_LABEL = new JLabel("Kaitlyn DiLorenzo");
    private static final JLabel ERROR_LABEL = new JLabel("Error");

    public  Tutor() {
        editorPane = new JEditorPane();
        panel = new JPanel();
        scrollPane = new JScrollPane(editorPane);
        
        editorPane.setEditable(true);
        
        scrollPane.setPreferredSize(new Dimension(600, 450));
        scrollPane.setVerticalScrollBarPolicy(JScrollPane.VERTICAL_SCROLLBAR_ALWAYS);
        
        NAME_LABEL.setFont(NAME_LABEL.getFont().deriveFont(32f));
        panel.add(NAME_LABEL);

        setLayout(new BorderLayout());
	add(panel);
    }
    
    private void setHTML(String fileName) {
        file = new File(fileName);

	try {
            url = file.toURI().toURL();
	}
	catch(MalformedURLException e) {
            url = null;
            
            ERROR_LABEL.setText("Error: Could not open file");
            scrollPane.add(ERROR_LABEL);
            
            return;
	}
        
        try {
            editorPane.setPage(url);
        }
        catch(IOException e) {
            url = null;
            
            ERROR_LABEL.setText("Error: Could not open file");
            scrollPane.add(ERROR_LABEL);
            
            return;
        }
        
        editorPane.setVisible(true);
        
        panel.add(scrollPane);
      
        url = null;
    }
    
    public void phase1() {
        panel.removeAll();
        setHTML("P1.html");
    }
    
    public void phase2() {
        panel.removeAll();
        setHTML("P2.html");
    }
    
    public void phase3() {
        panel.removeAll();
        setHTML("P3.html");
    }
    
    public void phase4() {
        panel.removeAll();
        setHTML("P4.html");
    }
}
