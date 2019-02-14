package decorator;

public  abstract class Decorator extends Car{
    Car car = null;

    Decorator(Car car){
        this.car = car;
    }
}
