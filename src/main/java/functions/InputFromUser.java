package functions;

import java.util.Scanner;

public class InputFromUser {
    //--------------Input Currency from user----------------
    public int inputCurrencyType() {
        Scanner scanner = new Scanner(System.in);
        int input = scanner.nextInt();
        return input;
    }
}
