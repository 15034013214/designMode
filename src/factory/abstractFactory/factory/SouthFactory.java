package factory.abstractFactory.factory;

import factory.abstractFactory.entity.*;

public class SouthFactory implements FruitFactory{
    @Override
    public Fruit getApple() {
       return new SouthApple();
    }

    @Override
    public Fruit getBanana() {
        return new SouthBanana();
    }
}
