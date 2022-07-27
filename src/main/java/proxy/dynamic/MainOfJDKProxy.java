package proxy.dynamic;

import proxy.dynamic.jdk.IOrder;
import proxy.dynamic.jdk.LogInvocationHandler;
import proxy.dynamic.jdk.Order;

import java.lang.reflect.Proxy;

public class MainOfJDKProxy {

    public static void main(String[] args) {
        IOrder order = new Order();
        LogInvocationHandler handler = new LogInvocationHandler(order);
        IOrder proxyOrder = (IOrder) Proxy.newProxyInstance(order.getClass().getClassLoader(), order.getClass().getInterfaces(), handler);
        proxyOrder.run();
    }
}
