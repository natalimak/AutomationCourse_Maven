package convertFunctional;

import tools.Coins_ENUM;

public class Coin_USD extends Coin {
    Coins_ENUM userCoins= Coins_ENUM.USD;

    public final double value = 3.52;
    public double calculate(double input) {
        return input * getValue();
    }
    double getValue() {
        return value;
    }
}

