//----------------Second screen------------------
//user should enter an amount to convert from USB->ISL or ISL->USB
//if user choice is not positive double,
// this screen will be appeared for get correct amount

package functions.screens;

import functions.AmountFromUser;

import java.util.InputMismatchException;
/**
 * Screen2 class - wait for enter an amount to convert from user
 * @author  Natali Makvits
 * @version 1.0
 * @since   01-March-2022
 */
public class Screen2 {

    /**
     * convert currency between USD/EUR and ILS
     * @param amount - amount to convert (not positive double)
     * @see functions.InputFromUser#inputCurrencyType
     * @return - amount to convert (not positive double)
     * @throws InputMismatchException if an error occurs
     * @see InputMismatchException
     * @throws IllegalStateException if an error occurs
     * @see IllegalStateException
     **/
     public double secondScreen(double amount) {

        while (amount <= 0) {
            try {
                AmountFromUser userAm=new AmountFromUser();
                amount = userAm.inputAmount();
            } catch (InputMismatchException | IllegalStateException e) {
                amount = -1.0;
            } finally {
                if (amount <= 0) {
                    System.out.println("Invalid choice, please try again");
                }
            }
        }
        return amount;
    }
}
