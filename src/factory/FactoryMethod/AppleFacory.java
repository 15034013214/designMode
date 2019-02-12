package factory.FactoryMethod;

public class AppleFacory implements FruitFactory{
    /**
     * 具体的工厂方法。
     * @return
     */
    @Override
    public Fruit getFruit() {
        return new Apple();
    }
}
