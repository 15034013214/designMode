package singleton;

/**
 * 懒汉式 (多线程，线程不安全)
 */
public class LazyMode {
    private static LazyMode lazyMode = null; // null的单例（私有，静态）
    private LazyMode(){}    // 私有化构造函数
    public static LazyMode getEntity(){     // 提供全局访问单例的方法
        if(null == lazyMode){
            lazyMode = new LazyMode();
        }
        return lazyMode;
    }
}