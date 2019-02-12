package singleton;

/**
 * 双重检查
 */
public class SafeLazyMode {
    private static SafeLazyMode safeLazyMode = null;
    private SafeLazyMode(){}
    public static SafeLazyMode getEntity(){
        if(null == safeLazyMode){   // 当成功创建实例后这个判断就不会通过。
            synchronized (SafeLazyMode.class){  // 防止第一次有多个线程同时创建实例。
                if(null == safeLazyMode){   // 如果没有这个判断将会发生什么？然后就知道他的作用了。
                    safeLazyMode = new SafeLazyMode();
                }
            }
        }
        return safeLazyMode;
    }
}
