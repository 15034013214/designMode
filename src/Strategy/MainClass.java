package Strategy;

/**
 * 使用策略模式实现一个打折系统。不同的策略的打折力度不同。
 */
public class MainClass {
    public static void main(String[] args) {
        Context context = new Context(new Strategy9());
        double outCount = context.count(100);
        System.out.println(outCount);
    }
}
