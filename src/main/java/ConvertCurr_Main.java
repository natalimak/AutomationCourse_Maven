import java.util.ArrayList;
import java.util.List;
import functions.screens.*;

/**
 * Program convert currency between USD/EUR (United States Dollars/Euro) and ILS (Israeli Shekel).
 * @author  Natali Makvits
 * @version 1.0
 * @since   01-March-2022
 */
public class ConvertCurr_Main {
    static List<String> list = new ArrayList<>();
    static String start="";

    /**
     * convert currency between USD/EUR and ILS
     * @param args n or other string.
     * @see functions.screens.MainScreen#mainScreen
     * @see functions.screens.Screen1#firstScreen
     * @see functions.screens.Screen2#secondScreen(double)
     * @see functions.screens.Screen3#thirdScreen(int, double)
     * @see functions.screens.StartOverScreen#startOverScreen(String, List)
     * @throws Exception if an error occurs
     * @see Exception
     **/
    public static void main(String[] args) throws Exception {

        System.out.println("Welcome to currency converter");

     while (!start.equalsIgnoreCase("n")){
         start="";
         int input = 0;
         double amount = -1.0;

        //---------------Main Screen-------------------//
         MainScreen sMain=new MainScreen();
         sMain.mainScreen();

        //---------------First Screen-Welcome Screen-------------//
        Screen1 s1=new Screen1();
        input = s1.firstScreen(input);
        System.out.println("Your input:" + input);//delete in end of project

        //---------------Second Screen-Choice c Screen-------------//
         System.out.println("Please enter an amount to covert");
         Screen2 s2=new Screen2();
         amount = s2.secondScreen(amount);

        //---------------Third Screen-Result Screen-------------//
        Screen3 s3 = new Screen3();
        list.add(s3.thirdScreen(input,amount));

        //---------------Start Over Screen-------------//
        System.out.println("Do you want to start over? Y/N?");
        StartOverScreen startOver=new StartOverScreen();
        start= startOver.startOverScreen(start,list);
            }
    }
}
