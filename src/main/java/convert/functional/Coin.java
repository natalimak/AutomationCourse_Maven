package convert.functional;
/**
 * Coin class - abstract class
 * @author  Natali Makvits
 * @version 1.0
 * @since   01-March-2022
 */
public abstract class Coin implements ICalculate{
    /**
     * These two are abstract methods, the child class must implement these methods
     * @see ICalculate
     */
      protected abstract double getValue();

     @Override
     public abstract double calculate(double value);
}
