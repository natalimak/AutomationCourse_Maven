package functions;

import java.util.Scanner;
/**
 * StartOver class - Wait for answer from User
 * @author  Natali Makvits
 * @version 1.0
 * @since   01-March-2022
 */
public class StartOver {
    /**
     * Wait for answer from User
    */
    public String inputToStartOver() {
        Scanner scanner = new Scanner(System.in);
        String start = scanner.next();
        return start;
    }
}
