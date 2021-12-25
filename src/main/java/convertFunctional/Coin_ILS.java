package convertFunctional;
import tools.Current_Currency_Rate_ILS;

public class Coin_ILS extends Coin_Abstract {
    Current_Currency_Rate_ILS value=new Current_Currency_Rate_ILS();

    public double calculate(double input){
        return input* value.value;
    }
    public double getValue(){
        return value;
    }

}
