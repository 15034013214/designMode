package decorator.decoratorCar;

// 通过装饰器模式给车添加新功能
public class MainClass {
    public static void main(String[] args) {
        Car car = new CarGeneral(); // 普通车
        Decorator carDecorator = new DecoratorFly(car); // 将普通车放到  飞行装饰器
        Decorator carDecorator2 = new DecoratorSwin(carDecorator);  // 将飞车放到  两栖装饰器
        carDecorator2.show();
    }
}
