package convert.functional;

import static io.restassured.RestAssured.get;
/**
 * Coin_ILS class - Take USD->Shekel rate from API and convert amount (USD to Shekels)
 * @author  Natali Makvits
 * @version 1.0
 * @since   01-March-2022
 */
public class Coin_ILS extends Coin {
    String URL = "http://api.exchangeratesapi.io/v1/latest?access_key=" +
            "064cbd8b5bdbfa5b5134f41981ff6ed5&symbols=USD,ILS";
    float value =get(URL).body().path("rates.ILS");

    /**
     * {@inheritdoc}
     * @param amount an amount to convert
     * @return final amount after conversion
     * @see Coin_ILS#getValue
     */
    public double calculate(double amount){
        return amount * getValue();
    }
    /**
     * {@inheritdoc}
     * @return rate from API
     */
     public double getValue(){
        return value;
    }
}
