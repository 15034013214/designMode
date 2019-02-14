package observer;

import java.util.Observable;

public class BeObserver extends Observable {
    private String testProperty = "";

    public void setTestProperty(String testProperty) {
        this.testProperty = testProperty;
        setChanged();   // 设置状态已经改变
        notifyObservers(testProperty);  // 通知观察者(发送通知的时候可以传递参数)
    }

}
