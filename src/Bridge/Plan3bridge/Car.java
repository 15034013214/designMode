package Bridge.Plan3bridge;

public abstract class Car {
    // Java继承中，子类不能继承父类的私有成员。
    // 但是这个成员却被子类用。this.getEntity()的方式拿到了。
    // 说明：抽象类的私有成员也被继承了，但是访问的权限没有，需要通过继承自父类的方法才能获取到。
    /*
    从网上学习后得出如下结论：
        不管父类中的成员变量是私有的还是其他，子类统统拥有。
        但是私有的不能被子类直接访问，只能通过从父类中继承的set和get方法来访问。
        就像上面那句话说的那样，对父类的私有变量具有拥有权，但是不具有使用权，只能通过从父类中继承的set和get方法来使用。
     */
    private Engine engine;

    public Car(Engine engine){      // 抽象类的构造方法使用类给子类继承用的。
        this.engine  = engine;
    }

    public Engine getEngine() {
        return engine;
    }

    public abstract void installEngine();
}
