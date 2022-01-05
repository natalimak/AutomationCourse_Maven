package convertFunctional;

    public class Coin_EUR extends Coin {

        public final double value = 4.23;

        public double calculate(double amount){
            return amount * getValue();
        }
        double getValue(){
            return value;
        }
    }

