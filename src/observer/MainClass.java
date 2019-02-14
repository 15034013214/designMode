package observer;

public class MainClass {
    public static void main(String[] args) {
        ConcreateObserver concreateObserver = new ConcreateObserver();
        BeObserver beObserver = new BeObserver();
        beObserver.addObserver(concreateObserver);  // 注册观察者

        beObserver.setTestProperty("1");
    }
}
