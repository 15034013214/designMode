package proxy.javaProxy;

public class RealSubject implements Subject{

    @Override
    public void sellBook() {
        System.out.println("真实卖书");
    }
}
