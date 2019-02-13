package observer;

import java.util.Observable;
import java.util.Observer;

public class ConcreateObserver implements Observer {
    @Override
    public void update(Observable o, Object arg) {
        System.out.println("发生变化了。。。");
    }
}
