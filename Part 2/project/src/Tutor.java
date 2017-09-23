//**************************************************************
// AUTHOR: Kaitlyn DiLorenzo
// STUDENT ID: 1208983772
// FOR: CSE 360
// SPECIFICATION: Opens HTML files in a JPanel
// DUE DATE: 9/8/2017
//**************************************************************

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
    private static final JLabel ERROR_LABEL = new JLabel("Error: Could not open file");

    public  Tutor() {

        //Create new JEditorPane, JPanel, and JScrollPane objects
        editorPane = new JEditorPane();
        panel = new JPanel();
        scrollPane = new JScrollPane(editorPane);

        editorPane.setEditable(true);

        //Set JScrollPane settings
        scrollPane.setPreferredSize(new Dimension(600, 370));
        scrollPane.setVerticalScrollBarPolicy(JScrollPane.VERTICAL_SCROLLBAR_ALWAYS);

        //Set JLabel settings
        NAME_LABEL.setFont(NAME_LABEL.getFont().deriveFont(32f));
        NAME_LABEL.setBackground(new Color(0, 105, 145));
        NAME_LABEL.setOpaque(true);

        ERROR_LABEL.setFont(NAME_LABEL.getFont().deriveFont(32f));
        ERROR_LABEL.setBackground(new Color(0, 105, 145));
        ERROR_LABEL.setOpaque(true);

        //Set panel color and add JLabel
        panel.setBackground(new Color(0, 105, 145));
        panel.setOpaque(true);
        panel.add(NAME_LABEL);

        setLayout(new BorderLayout());
	add(panel);
    }

    //Open HTML file
    private void setHTML(String fileName) {
        file = new File("resources/" + fileName);

	try {
            url = file.toURI().toURL();
	}
	catch(MalformedURLException e) {
            error();
            return;
	}

        try {
            editorPane.setPage(url);
        }
        catch(IOException e) {
            error();
            return;
        }

        editorPane.setVisible(true);

        panel.add(scrollPane);

        url = null;
    }

    //Display error message
    private void error() {
        System.out.println("Entered error()");

        url = null;

        panel.removeAll();
        panel.add(ERROR_LABEL);
    }

    //Display P1.html
    public void phase1() {
        panel.removeAll();
        setHTML("P1.html");
    }

    //Display P2.html
    public void phase2() {
        panel.removeAll();
        setHTML("P2.html");
    }

    //Display P3.html
    public void phase3() {
        panel.removeAll();
        setHTML("P3.html");
    }

    //Display P4.html
    public void phase4() {
        panel.removeAll();
        setHTML("P4.html");
    }
}

