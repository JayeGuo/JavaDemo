package proxy.dynamic;

import proxy.dynamic.jdk.IOrder;
import proxy.dynamic.jdk.LogInvocationHandler;
import proxy.dynamic.jdk.Order;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationHandler;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Proxy;

public class MainOfJDKProxy {

    public static void main(String[] args) throws Throwable {
        proxy();
//        simpleProxy();
    }

    public static void proxy() throws Throwable {
        IOrder order = new Order(); // 目标类
        LogInvocationHandler handler = new LogInvocationHandler(order); // 回调函数
        Class<?> proxyClass = Proxy.getProxyClass(order.getClass().getClassLoader(), order.getClass().getInterfaces());
        Constructor<?> constructor = proxyClass.getConstructor(InvocationHandler.class);
        IOrder proxyOrder = (IOrder) constructor.newInstance(handler);
        proxyOrder.run();
    }

    public static void simpleProxy(){
        IOrder order = new Order(); // 目标类
        LogInvocationHandler handler = new LogInvocationHandler(order); // 回调函数
        IOrder proxyOrder = (IOrder) Proxy.newProxyInstance(order.getClass().getClassLoader(), order.getClass().getInterfaces(), handler);
        proxyOrder.run();
    }
}
