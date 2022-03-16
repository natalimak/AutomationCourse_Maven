//--------------Input amount from user----------------

package functions;

import java.util.Scanner;
/**
 * StartOver class - Wait for an amount from User
 * @author  Natali Makvits
 * @version 1.0
 * @since   01-March-2022
 */
public class AmountFromUser {
    /**
     * Wait for an amount from User
     */
    public double inputAmount() {
        Scanner scanner = new Scanner(System.in);
        double amount = scanner.nextDouble();
        return amount;
    }
}
