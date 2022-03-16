package functions.screens;

import convert.functional.Coin;
import convert.functional.Coin_Factory;
import convert.functional.CoinsTypes;

/**
 * Screen3 class - Calculates the conversion of an amount by currency type
 * @author  Natali Makvits
 * @version 1.0
 * @since   01-March-2022
 */
public class Screen3 {
    /**
     * Calculates the conversion of an amount by currency type
     * @param input - input from user: 1/2/3- currency type
     * @param amount - amount to convert
     * @see functions.InputFromUser#inputCurrencyType
     * @return result - an amount after conversion
     * @see CoinsTypes
     * @see Coin_Factory#getCoins(CoinsTypes)
     **/
     public String thirdScreen(int input, double amount)  {
        CoinsTypes coinType = CoinsTypes.ILS;
        CoinsTypes coinTypeToConvert = CoinsTypes.ILS;
        Coin_Factory Coin_Factory=new Coin_Factory();
        if (input!=1 && input!=2&& input!=3) {
            System.out.println("Invalid choice, please try again");
        }

        if (input==1) {
            coinType = CoinsTypes.ILS;
            coinTypeToConvert = CoinsTypes.USD;
        }

        if (input==2) {
            coinType = CoinsTypes.USD;
            coinTypeToConvert = CoinsTypes.ILS;

        }
        if (input==3) {
            coinType = CoinsTypes.ILS;
            coinTypeToConvert = CoinsTypes.EUR;

        }

        Coin myCoin = Coin_Factory.getCoins(coinType);

        String result =  amount+ " " + coinType + "= "
                + myCoin.calculate(amount)+""+coinTypeToConvert;
        System.out.println(result);

        return result;
    }

}

