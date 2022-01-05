import functions.Screen_2;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import java.util.Scanner;

public class enterValueToConvert {
    @BeforeClass
    public void runOnceBeforeClass() {
        System.out.println("Start test");
    }


    @Test
    public void convert1() {
        System.out.println ("test");
        Scanner scanner = new Scanner(System.in);
        double amount = scanner.nextDouble();
        System.out.println(amount);
    }

   @Test
    public void convert() {
        Screen_2 s2 = new Screen_2();
        System.out.println(s2.secondScreen(0.0));
    }

  //  @AfterClass
}
