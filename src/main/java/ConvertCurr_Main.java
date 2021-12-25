import java.io.FileWriter;
import java.io.IOException;

import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.List;
import java.util.Scanner;

import convertFunctional.Coin;
import convertFunctional.Coin_Factory;
import tools.Coins_ENUM;

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
        mainScreen();

        //---------------First Screen-Welcome Screen-------------//
        input = firstScreen(input);
        System.out.println("Your input:" + input);//delete in end of project

        //---------------Second Screen-Choice c Screen-------------//
        System.out.println("Please enter an amount to covert");
        amount = secondScreen(amount);

        //---------------Third Screen-Result Screen-------------//
        thirdScreen(input, amount);
        //list.add("current option "+ input+ "an amount to convert" +amount+ ""+ thirdScreen(input, amount));
        //System.out.println(list); //Please delete me in end of project

        //---------------Start Over Screen-------------//
        System.out.println("Are you want to start over? Y/N?");
        startOverScreen(start);
            }
    }


//---------------------first screen--------------------
//user should enter 1 or 2 to convert from USB->ISL or ISL->USB
//if user choice is not 1 or 2, this screen will be appeared for get right choice
//-------------First screen------------

    private static void mainScreen() {
    System.out.println("Please enter 1 or 2");
    System.out.println("1. Dollars to Shekels");
    System.out.println("2. Shekels to Dollars");
}
    private static int firstScreen(int input) {
        while (input != 1 && input != 2) {

            try {
                input = inputCurrencyType();

            } catch (InputMismatchException | IllegalStateException e) {
                input = 0;
            } finally {
                if (input != 1 && input != 2) {
                    System.out.println("Invalid choice, please try again");
                }
            }
        }
        return input;
    }

    //----------------Second screen------------------
//user should enter an amount to convert from USB->ISL or ISL->USB
//if user choice is not positive double, this screen will be appeared for get correct amount
    private static double secondScreen(double amount) {
        while (amount <= 0) {

            try {
                amount = inputAmount();
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

//--------------Input Currency from user----------------
    private static int inputCurrencyType() {
        Scanner scanner = new Scanner(System.in);
        int input = scanner.nextInt();
        return input;
    }
//--------------Input to start over from user----------------
    private static String inputToStartOver() {
        Scanner scanner = new Scanner(System.in);
        String start = scanner.next();
        return start;
    }
//--------------Input amount from user----------------
    private static double inputAmount() {
        Scanner scanner = new Scanner(System.in);
        double amount = scanner.nextDouble();
        return amount;
    }


    //-----------------------Third screen------------------------
// perform calculation per choice and amount from user
// user get summary with his input and amount
//if user choice is not positive double, this screen will be appeared for get correct amount
    private static void thirdScreen(int input, double amount) throws Exception {
        Coins_ENUM coinType = Coins_ENUM.ILS;
        Coins_ENUM coinTypeToConvert = Coins_ENUM.ILS;
        Coin_Factory Coin_Factory=new Coin_Factory();
        if (input!=1 && input!=2) {
            System.out.println("Invalid choice, please try again");
        }
        if (input==1) {
            coinType = Coins_ENUM.ILS;
            coinTypeToConvert = Coins_ENUM.USD;

        }
        if (input==2) {
            coinType = Coins_ENUM.USD;
            coinTypeToConvert = Coins_ENUM.ILS;

        }

        Coin myCoin = Coin_Factory.getCoins(coinType);
        //-----to change----

        System.out.println(amount+ " " + coinType + "= " + myCoin.calculate(amount)+""+coinTypeToConvert);
        list.add(amount+ " " + coinType + "= " + myCoin.calculate(amount)+""+coinTypeToConvert);
    }

    //----------Ask User if wont ot start over to convert currency-------------
    private static String startOverScreen(String s) {
        while (!start.equalsIgnoreCase("y") && !start.equalsIgnoreCase("n")) {

            try {
                start = inputToStartOver();
                if (start.equalsIgnoreCase("n")){
                    endScreen();
                }
                return start;

            } catch (InputMismatchException | IllegalStateException | IOException e) {
                start = "Yes";
            } finally {
                if (!start.equalsIgnoreCase(String.valueOf("y")) && !start.equalsIgnoreCase(String.valueOf("n"))) {
                    System.out.println("Invalid choice, please try again");
                }
            }
        }
        return start;
    }

    //----------------End Screen-------------------------
    private static void endScreen() throws IOException {
        System.out.println("Thanks for using our currency convertor");
        FileWriter writer = new FileWriter("Results.txt");
        for (String lastUse : list) {
            System.out.println(lastUse);//write to console to user
            writer.write(String.valueOf(lastUse + "\n"));  //Wrong-print twice -write the list to file Results.txt
        }
        writer.close();
    }


}
