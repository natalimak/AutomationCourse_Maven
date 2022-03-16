package functions.screens;
/**
 * The MainScreen class show options to convert
 * @author  Natali Makvits
 * @version 1.0
 * @since   01-March-2022
 */
public class MainScreen {

    /**
     * show option to convert currency between USD/EUR and ILS
     **/

    /*---------------------first screen--------------------
user should enter 1 or 2 to convert from USB->ISL or ISL->USB or ISL->EUR
if user choice is not 1 or 2, this screen will be appeared for get right choice*/

    public void mainScreen() {
        System.out.println("Please enter 1 or 2 or 3");
        System.out.println("1. Dollars to Shekels");
        System.out.println("2. Shekels to Dollars");
        System.out.println("3. Shekels to Euro");
    }
}
