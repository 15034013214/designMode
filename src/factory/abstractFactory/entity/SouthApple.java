package factory.abstractFactory.entity;

public class SouthApple extends Apple {
    @Override
    public void get() {
        System.out.println("获取南方苹果");
    }
}
