package Strategy;

/**
 * 打九折
 */
public class Strategy8 implements Strategy{
    @Override
    public double discount(double initCount) {
        return initCount * 0.8;
    }
}
