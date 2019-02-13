package observer;

import java.util.Observable;
import java.util.Observer;

public class ConcreateObserver implements Observer {
    @Override
    public void update(Observable o, Object arg) {
        // o 被观察的对象     arg是发送时传递的参数
        System.out.println("发生变化了。。。");
    }
}
