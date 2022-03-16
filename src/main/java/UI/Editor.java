package UI;

import functions.ResultsInNotepad;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import javax.swing.JFrame;
import javax.swing.JTextArea;
/**
 * Editor class - Show convert results
 * @author  Natali Makvits
 * @version 1.0
 * @since   01-March-2022
 */
public class Editor extends JFrame {
    /**
     * Internal Editor
     * @see ResultsInNotepad#showResultsNoteped()
     * @see Editor#Editor()
     * @throws IOException if an error occurs
     * @see IOException
     **/
    public Editor() {
        super("Display txt on JTextArea!");
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setSize(250, 250);

        File file = new File("Results.txt");
        FileInputStream fis = null;
        StringBuilder texTo = new StringBuilder();

        try {
            fis = new FileInputStream(file);
            int content;
            while ((content = fis.read()) != -1) {
                texTo.append((char) content);
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

        JTextArea textArea = new JTextArea(texTo.toString());
        textArea.setLineWrap(true);
        add(textArea);
    }
}
