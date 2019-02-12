package factory.sumpleFactory.product;

import factory.sumpleFactory.productImpl.Fruit;

public class Apple implements Fruit {

    @Override
    public void get() {
        System.out.println("采集苹果");
    }
}
