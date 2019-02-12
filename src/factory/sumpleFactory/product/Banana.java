package factory.sumpleFactory.product;

import factory.sumpleFactory.productImpl.Fruit;

public class Banana implements Fruit {
    @Override
    public void get() {
        System.out.println("采集香蕉");
    }
}
