package convertFunctional;

import tools.Coins_ENUM;

public class Coin_Factory {
//Factory for creating coins by user choice

    public Coin getCoins(Coins_ENUM e) throws Exception {
        switch (e){

        case USD:
                return new Coin_USD();

        case ILS:
            return new Coin_ILS();

        }
        return null;
    }
}
