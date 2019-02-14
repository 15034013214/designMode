package decorator;

/**
 * 车的抽象类
 */
public abstract class Car {
    void run(){}    // 不许要扩展的方法
    abstract void show();   // 需要扩展的方法
}
