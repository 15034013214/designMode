package observer;

import java.util.Observable;

public class BeObserver extends Observable {
    private String testProperty = "";

    public void setTestProperty(String testProperty) {
        this.testProperty = testProperty;
        setChanged();   // 设置状态已经改变
        notifyObservers();  // 通知观察者
    }

}
