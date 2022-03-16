package convert.functional;
/**
 * Coin_ILS class - Convert amount (Shekels to EURO)
 * @author  Natali Makvits
 * @version 1.0
 * @since   01-March-2022
 */
    public class Coin_EUR extends Coin {
        /**
         * {@inheritdoc}
         */
        public final double value = 4.23;
    /**
     * {@inheritdoc}
     * @param amount an amount to convert
     * @return final amount after conversion
     * @see Coin_EUR#getValue
     */
        public double calculate(double amount){
            return amount * getValue();
        }
    /**
     * {@inheritdoc}
     * @return rate from Coin_EUR class
     */
        protected double getValue(){
            return value;
        }
    }

