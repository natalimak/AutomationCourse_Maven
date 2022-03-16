package functions.screens;

import functions.StartOver;
import java.io.IOException;
import java.util.InputMismatchException;
import java.util.List;
/**
 * StartOverScreen class - Wait for answer from User to start or not over to convert currency
 * @author  Natali Makvits
 * @version 1.0
 * @since   01-March-2022
 */
public class StartOverScreen {
    /**
     * get valid currency type from user (USD/EUR and ILS)
     * @param s (input from user: y/Y, n/N)
     * @param list -Results List
     * @see functions.InputFromUser#inputCurrencyType
     * @return value - (input from user: 1/2/3)
     * @see EndScreen#endScreen(List)
     * @see StartOver#inputToStartOver
     * @throws InputMismatchException if an error occurs
     * @see InputMismatchException
     * @throws IllegalStateException if an error occurs
     * @see IllegalStateException
     * @throws IOException if an error occurs
     * @see IOException
     **/
    public String startOverScreen(String s, List list) {
        while (!s.equalsIgnoreCase("y") &&
                !s.equalsIgnoreCase("n")) {

            try {
                StartOver sOver = new StartOver();
                s = sOver.inputToStartOver();
                if (s.equalsIgnoreCase("n")) {
                    EndScreen screenEnd = new EndScreen();
                    screenEnd.endScreen(list);
                }
            } catch (InputMismatchException | IllegalStateException | IOException e) {
                s = "Yes";
            } finally {
                if (!s.equalsIgnoreCase("y") &&
                        !s.equalsIgnoreCase("n")) {
                    System.out.println("Invalid choice, please try again");
                }
            }
        }
        return s;
    }
}