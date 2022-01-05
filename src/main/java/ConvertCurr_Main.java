import java.util.ArrayList;
import java.util.List;

import functions.*;

public class ConvertCurr_Main {
    static List<String> list = new ArrayList<>();
    static String start="";

    public static void main(String[] args) throws Exception {

        System.out.println("Welcome to currency converter");
     while (!start.equalsIgnoreCase(String.valueOf("n"))){
         start="";
         int input = 0;
         double amount = -1.0;

        //---------------Main Screen-------------------//
         Screen_main sMain=new Screen_main();
         sMain.mainScreen();

        //---------------First Screen-Welcome Screen-------------//
        Screen_1 s1=new Screen_1();
        input = s1.firstScreen(input);
        System.out.println("Your input:" + input);//delete in end of project

        //---------------Second Screen-Choice c Screen-------------//
         System.out.println("Please enter an amount to covert");
         Screen_2 s2=new Screen_2();
         amount = s2.secondScreen(amount);

        //---------------Third Screen-Result Screen-------------//
        Screen_3 s3 = new Screen_3();
        list.add(s3.thirdScreen(input,amount));

        //---------------Start Over Screen-------------//
        System.out.println("Do you want to start over? Y/N?");
        Screen_startOver startOver=new Screen_startOver();
        start= startOver.startOverScreen(start,list);
            }
    }
}
