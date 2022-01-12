package functions;

import java.io.File;
import java.io.IOException;
import java.util.InputMismatchException;
import java.util.Locale;

public class ShowResults_Notepad {
    //----------------//show results.txt in notepad------------------

    public void showResultsNoteped() throws IOException {
        try {
            ProcessBuilder pb = new ProcessBuilder("Notepad.exe", "Results.txt");
            pb.start();
            }
        catch (IOException e) {
            System.out.println("Notepad doesn't exist");
        }
         }
      }
