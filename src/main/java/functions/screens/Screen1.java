package functions.screens;

import functions.InputFromUser;
import java.util.InputMismatchException;

/**
 * Screen1 class - wait for correct choice (1,2,3) for convert options
 * @author  Natali Makvits
 * @version 1.0
 * @since   01-March-2022
 */
public class Screen1 {
    /**
     * get valid currency type from user (USD/EUR and ILS)
     * @param input (input from user: 1/2/3)
     * @see functions.InputFromUser#inputCurrencyType
     * @return value - (input from user: 1/2/3)
     * @throws InputMismatchException if an error occurs
     * @see InputMismatchException
     * @throws IllegalStateException if an error occurs
     * @see IllegalStateException
     **/
    public int firstScreen(int input) {
        while (input != 1 && input != 2 && input != 3) {

            try {
                InputFromUser userIn=new InputFromUser();
                input = userIn.inputCurrencyType();

            } catch (InputMismatchException | IllegalStateException e) {
                input = 0;
            } finally {
                if (input != 1 && input != 2&& input != 3) {
                    System.out.println("Invalid choice, please try again");
                }
            }
        }
        return input;
    }
}
