package convertFunctional;

public interface ICalculate {
    public default double calculate(double value){
        return value;
    }
}
