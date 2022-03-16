//--------------Input Currency from user----------------

package functions;

import java.util.Scanner;
/**
 * InputFromUser class - Input Currency from user
 * @author  Natali Makvits
 * @version 1.0
 * @since   01-March-2022
 */
public class InputFromUser {
    /**
     * wait for Input Currency from user
     * @return input-input from user
     **/
    public int inputCurrencyType() {
        Scanner scanner = new Scanner(System.in);
        int input = scanner.nextInt();
        return input;
    }
}
