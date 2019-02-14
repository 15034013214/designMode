package decorator;

public class DecoratorSwin extends Decorator {
    DecoratorSwin(Car car) {
        super(car);
    }

    public void swin(){
        System.out.println("现在是两栖车---可以游泳");
    }

    @Override
    void show() {
        this.car.show();
        swin();
    }
}
