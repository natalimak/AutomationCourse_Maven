package functions;

import java.io.IOException;
import java.util.InputMismatchException;
import java.util.List;

public class Screen_startOver {
    //----------Ask User if wont ot start over to convert currency-------------
    public String startOverScreen(String s, List list) {
        while (!s.equalsIgnoreCase("y") && !s.equalsIgnoreCase("n")) {

            try {
                StartOver sOver = new StartOver();
                s = sOver.inputToStartOver();
                if (s.equalsIgnoreCase("n")) {
                    Screen_end screenEnd = new Screen_end();
                    screenEnd.endScreen(list);
                }
            } catch (InputMismatchException | IllegalStateException | IOException e) {
                s = "Yes";
            } finally {
                if (!s.equalsIgnoreCase(String.valueOf("y")) && !s.equalsIgnoreCase(String.valueOf("n"))) {
                    System.out.println("Invalid choice, please try again");
                }
            }
        }
        return s;
    }
}