package functions;

import java.io.IOException;
/**
 * ResultsInNotepad class - Show convert results in Notepad
 * @author  Natali Makvits
 * @version 1.0
 * @since   01-March-2022
 */
public class ResultsInNotepad {
    /**
     * results in Notepad
     **/
    public void showResultsNoteped() {
        try {
            ProcessBuilder pb = new ProcessBuilder("Notepad.exe",
                    "Results.txt");
            pb.start();
            }
        catch (IOException e) {
            System.out.println("Notepad doesn't exist");
        }
    }
}
