package singleton;

/**
 * 单例模式饿汉式
 */
public class HungerMode {
    private static final HungerMode hungerMode = new HungerMode(); // 初始化单例 （私有，静态，常量）
    private HungerMode(){}  // 私有化构造函数
    public static HungerMode getEntity() { // 全局获取单例的方法
        return hungerMode;
    }
}
