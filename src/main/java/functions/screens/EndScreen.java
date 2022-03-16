package functions.screens;

import functions.ResultsInNotepad;
import UI.Editor;

import java.io.FileWriter;
import java.io.IOException;
import java.util.List;

/**
 * EndScreen class - Show convert results
 * @author  Natali Makvits
 * @version 1.0
 * @since   01-March-2022
 */
public class EndScreen {
    /**
     * Show: output convert results in terminal, Show results in Notepad and in internal Editor
     * @param list -Results List
     * @see ResultsInNotepad#showResultsNoteped()
     * @see Editor#Editor()
     * @throws IOException if an error occurs
     * @see IOException
     **/
    public void endScreen(List list) throws IOException {
        System.out.println("Thanks for using our currency convertor");
        FileWriter writer = new FileWriter("Results.txt");
        for (Object lastUse : list) {
            System.out.println(lastUse);
                        //write to console to user
            writer.write(lastUse + "\n");
                        //Wrong-print twice -write the list to file Results.txt
        }

        writer.close();
        ResultsInNotepad showRes=new ResultsInNotepad();
        showRes.showResultsNoteped(); //show results.txt in notepad
        Editor ed = new Editor();
        ed.setVisible(true);
    }
}
