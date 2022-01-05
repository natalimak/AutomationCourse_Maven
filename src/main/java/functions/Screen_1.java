package functions;

import java.util.InputMismatchException;

public class Screen_1 {
    public int firstScreen(int input) {
        while (input != 1 && input != 2 && input != 3) {

            try {
                InputFromUser userin=new InputFromUser();
                input = userin.inputCurrencyType();

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
