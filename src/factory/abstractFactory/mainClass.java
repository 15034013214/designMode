package factory.abstractFactory;

import factory.abstractFactory.entity.NorthApple;
import factory.abstractFactory.factory.FruitFactory;
import factory.abstractFactory.factory.NorthFactory;

public class mainClass {
    public static void main(String[] args) {
        FruitFactory fruitFactory = new NorthFactory();
        NorthApple northApple = (NorthApple) fruitFactory.getApple();
        northApple.get();
    }
}
