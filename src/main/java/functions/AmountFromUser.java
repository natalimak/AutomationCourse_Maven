package functions;

import java.util.Scanner;

public class AmountFromUser {
    //--------------Input amount from user----------------
    public double inputAmount() {
        Scanner scanner = new Scanner(System.in);
        double amount = scanner.nextDouble();
        return amount;
    }
}
