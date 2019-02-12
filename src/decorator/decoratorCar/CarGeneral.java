package decorator.decoratorCar;

/**
 * 普通的车
 */
public class CarGeneral extends Car{
    @Override
    void run() {
        System.out.println("现在是普通车---可以跑");
    }

    @Override
    void show() {
        run();
    }
}
