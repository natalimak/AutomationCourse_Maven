package convertFunctional;

public abstract class Coin implements ICalculate{
      abstract double getValue();

     @Override
     public abstract double calculate(double value);
}
