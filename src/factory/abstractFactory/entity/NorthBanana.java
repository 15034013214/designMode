package factory.abstractFactory.entity;

public class NorthBanana extends Banana {
    @Override
    public void get() {
        System.out.println("获取北方香蕉");
    }
}
