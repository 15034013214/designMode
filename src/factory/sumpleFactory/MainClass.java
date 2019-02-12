package factory.sumpleFactory;

import factory.sumpleFactory.factory.FruitFactory;
import factory.sumpleFactory.product.Apple;
import factory.sumpleFactory.product.Banana;

public class MainClass {
    public static void main(String[] args) throws InstantiationException, IllegalAccessException, ClassNotFoundException {
        Apple apple = (Apple) FruitFactory.getFruit("Apple");
        Banana banana = (Banana)FruitFactory.getFruit("Banana");
    }
}
