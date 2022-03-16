package convert.functional;

/**
 * Coin_Factory class - Factory for creating coins by user choice
 * @author  Natali Makvits
 * @version 1.0
 * @since   01-March-2022
 */
public class Coin_Factory {
    /**
     * Calculates the conversion of an amount by currency type
     * @param e - currency type from user
     * @see functions.InputFromUser#inputCurrencyType
     * @return Coin_USD - an amount after conversion (Shekels to USD)
     * @return Coin_ILS - an amount after conversion (USD to Shekels)
     * @return Coin_EUR - an amount after conversion (Shekels to EURO)
     * @see Coin_USD
     * @see Coin_ILS
     * @see Coin_EUR
     **/
    public Coin getCoins(CoinsTypes e) {
        return switch (e) {
            case USD -> new Coin_USD();
            case ILS -> new Coin_ILS();
            case EUR -> new Coin_EUR();
        };
    }
}
