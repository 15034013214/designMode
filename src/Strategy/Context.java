package Strategy;

public class Context {
    private Strategy strategy = null;

    public Context(Strategy strategy){
        this.strategy = strategy;
    }

    public double count(double initCount){
        return strategy.discount(initCount);
    }
}
