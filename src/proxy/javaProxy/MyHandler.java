package proxy.javaProxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

public class MyHandler implements InvocationHandler {
    RealSubject realSubject = null;

    // 持有被代理类。
    public MyHandler(RealSubject realSubject){
        this.realSubject = realSubject;
    }

    /**
     * 当你执行代理者的某个方法的时候，最后跑的都是invoke方法。
     * @param proxy 代理者，如果你想对代理者做一些操作可以使用这个参数
     * @param method    被执行的方法
     * @param args  执行该方法所需的参数
     * @return
     * @throws Throwable
     */
    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        System.out.println("执行被代理的方法之前的动作");
        Object result = method.invoke(realSubject, args);
        System.out.println("执行被代理的方法之后的动作");
        return result;
    }
}
