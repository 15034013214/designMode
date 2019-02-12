package factory.FactoryMethod;

public class MainClass {
    public static void main(String[] args){
        AppleFacory appleFacory = new AppleFacory();
        Apple apple = (Apple) appleFacory.getFruit();

        BananaFactory bananaFactory = new BananaFactory();
        Banana banana = (Banana)bananaFactory.getFruit();
    }
}
