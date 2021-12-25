package convertFunctional;
import tools.Current_Currency_Rate_USD;

public class Coin_USD extends Coin_Abstract {

    Current_Currency_Rate_USD value = new Current_Currency_Rate_USD();

    public double calculate(double input) {
        return input * value.value;
    }

    public double getValue() {
        return value;
    }
}
