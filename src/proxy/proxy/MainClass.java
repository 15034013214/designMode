package proxy.proxy;

/**
 * 一个买书的场景，
 * 我们想买书，去出版社的代理那里买书。代理需要先从出版社那里买书然后卖给我们。
 */
public class MainClass {
    public static void main(String[] args) {
        Subject proxy = new ProxySubject(); // 创建代理
        ((ProxySubject) proxy).setRealSubject(new RealSubject());   // 给代理指定出版社
        proxy.sellBook();   // 向代理买书（代理在内部向出版社买）
    }
}
