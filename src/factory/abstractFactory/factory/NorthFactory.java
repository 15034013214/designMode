package factory.abstractFactory.factory;

import factory.abstractFactory.entity.Fruit;
import factory.abstractFactory.entity.NorthApple;
import factory.abstractFactory.entity.NorthBanana;

public class NorthFactory implements FruitFactory{
    @Override
    public Fruit getApple() {
       return new NorthApple();
    }

    @Override
    public Fruit getBanana() {
        return new NorthBanana();
    }
}
