package factory.abstractFactory.entity;

public class Banana implements Fruit {
    @Override
    public void get() {
        System.out.println("采集香蕉");
    }
}
