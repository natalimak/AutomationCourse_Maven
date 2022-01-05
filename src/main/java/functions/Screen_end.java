package functions;

import tools.Editor;

import java.io.FileWriter;
import java.io.IOException;
import java.util.List;

public class Screen_end {
    //----------------End Screen-------------------------
    public void endScreen(List list) throws IOException {
        System.out.println("Thanks for using our currency convertor");
        FileWriter writer = new FileWriter("Results.txt");
        for (Object lastUse : list) {
            System.out.println(lastUse);
                        //write to console to user
            writer.write(String.valueOf(lastUse + "\n"));
                        //Wrong-print twice -write the list to file Results.txt
        }

        writer.close();
        ShowResults_Notepad showRes=new ShowResults_Notepad();
        showRes.showResultsNoteped(); //show results.txt in notepad
        Editor ed = new Editor();
        ed.setVisible(true);
    }
}
