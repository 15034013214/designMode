package proxy.javaProxy;

import java.lang.reflect.Proxy;

public class MainClass {
    public static void main(String[] args) {
        RealSubject realSubject = new RealSubject();
        MyHandler myHandler = new MyHandler(realSubject);     // 实例化处理程序，并绑定被代理实例。
        /*
            第一个参数：  代理类的类加载器
            第二个参数：  代理类要实现的接口列表
            第三个参数：  处理程序
         */
        Subject subject = (Subject) Proxy.newProxyInstance(RealSubject.class.getClassLoader() , realSubject.getClass().getInterfaces() , myHandler);   // 创建代理对象。
        subject.sellBook();
    }
}
