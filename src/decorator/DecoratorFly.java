package decorator;

/**
 * 给车添加飞行功能的装饰器
 */
public class DecoratorFly extends Decorator {
    DecoratorFly(Car car){
        super(car);
    }

    public void fly(){
        System.out.println("现在是飞车---可以飞");
    }

    @Override
    public void show() {
        car.show();
        fly();
    }
}
