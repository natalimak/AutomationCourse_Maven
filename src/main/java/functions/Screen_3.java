package functions;

import convertFunctional.Coin;
import convertFunctional.Coin_Factory;
import tools.Coins_ENUM;

public class Screen_3 {

      //-----------------------Third screen------------------------
// perform calculation per choice and amount from user
// user get summary with his input and amount
//if user choice is not positive double, this screen will be appeared for get correct amount
    public String thirdScreen(int input, double amount) throws Exception {
        Coins_ENUM coinType = Coins_ENUM.ILS;
        Coins_ENUM coinTypeToConvert = Coins_ENUM.ILS;
        Coin_Factory Coin_Factory=new Coin_Factory();
        if (input!=1 && input!=2&& input!=3) {
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
        if (input==3) {
            coinType = Coins_ENUM.ILS;
            coinTypeToConvert = Coins_ENUM.EUR;

        }

        Coin myCoin = Coin_Factory.getCoins(coinType);
       // String forResult = coinType+ "to "+coinTypeToConvert;
       // Results result=new Results(myCoin.calculate(amount),forResult);
        String result =  amount+ " " + coinType + "= " + myCoin.calculate(amount)+""+coinTypeToConvert;
        System.out.println(result);

        return result;
    }

}

