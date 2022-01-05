package functions;

import java.io.IOException;

public class ShowResults_Notepad {
    //----------------//show results.txt in notepad------------------

    public void showResultsNoteped() throws IOException {
        ProcessBuilder pb = new ProcessBuilder("Notepad.exe", "Results.txt");
        pb.start();
    }
}
