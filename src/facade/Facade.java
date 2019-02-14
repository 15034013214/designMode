package facade;

public class Facade {
    private Class1 class1;
    private Class2 class2;
    private Class3 class3;

    public Facade(){
        class1 = new Class1();
        class2 = new Class2();
        class3 = new Class3();
    }

    public void do12Something(){
        class1.doSomething();
        class2.doSomething();
    }

    public void do123Something(){
        class1.doSomething();
        class2.doSomething();
        class3.doSomething();
    }
}
