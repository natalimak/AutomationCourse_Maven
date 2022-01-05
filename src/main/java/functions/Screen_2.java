package functions;

import java.util.InputMismatchException;

public class Screen_2 {
    //----------------Second screen------------------
//user should enter an amount to convert from USB->ISL or ISL->USB
//if user choice is not positive double, this screen will be appeared for get correct amount
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
