package convertFunctional;

import tools.Coins_ENUM;

public class Coin_USD extends Coin {

    public final double value = 3.52;
    public double calculate(double input) {
        return input * getValue();
    }
    double getValue() {
        return value;
    }
}

