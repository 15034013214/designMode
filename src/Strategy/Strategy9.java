package Strategy;

/**
 * 打九折
 */
public class Strategy9 implements Strategy{
    @Override
    public double discount(double initCount) {
        return initCount * 0.9;
    }
}
