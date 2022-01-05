package convertFunctional;

import tools.Coins_ENUM;

public class Coin_ILS extends Coin {

    public final double value = 0.28;

    public double calculate(double amount){
        return amount * getValue();
    }
     double getValue(){
        return value;
    }
}
