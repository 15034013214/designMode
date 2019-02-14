package proxy.proxy;

public class ProxySubject implements Subject{
    private RealSubject realSubject;

    public void setRealSubject(RealSubject realSubject){
        this.realSubject = realSubject;
    }
    @Override
    public void sellBook() {
        System.out.println("代理向RealSubject买书");
        realSubject.sellBook();
        dazhe();
    }

    private void dazhe(){
        System.out.println("代理打折，满减。");
    }
}
