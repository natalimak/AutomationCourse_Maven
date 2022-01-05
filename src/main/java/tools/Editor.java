package tools;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import javax.swing.JFrame;
import javax.swing.JTextArea;

public class Editor extends JFrame {

    public Editor() {
        super("Display txt on JTextArea!");
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setSize(250, 250);

        File file = new File("C:\\Users\\Administrator\\IdeaProjects\\AutomationCourse_Maven\\Results.txt");
        FileInputStream fis = null;
        String texto = "";

        try {
            fis = new FileInputStream(file);
            int content;
            while ((content = fis.read()) != -1) {
                texto += (char) content;
            }
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                if (fis != null) {
                    fis.close();
                }
            } catch (IOException ex) {
                ex.printStackTrace();
            }
        }

        JTextArea textArea = new JTextArea(texto);
        textArea.setLineWrap(true); //quebra de linha automática
        add(textArea);
    }

    }
