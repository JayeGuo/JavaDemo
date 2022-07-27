package proxy.dynamic;

import net.sf.cglib.core.DebuggingClassWriter;
import net.sf.cglib.proxy.Enhancer;
import proxy.dynamic.cglib.Item;
import proxy.dynamic.cglib.LogMethodInterceptor;
import proxy.dynamic.cglib.LogSuperMethodInterceptor;

public class MainOfCglibProxy {
    public static void main(String[] args) {
        System.setProperty(DebuggingClassWriter.DEBUG_LOCATION_PROPERTY, "target/temp");

        testInvoke();

//        testSuperInvoke();

    }

    /**
     * 调用代理类，每个方法都会走拦截器
     */
    public static void testSuperInvoke() {
        Enhancer enhancer = new Enhancer();
        enhancer.setSuperclass(Item.class);
        enhancer.setCallback(new LogSuperMethodInterceptor());
        Item proxyItem = (Item) enhancer.create();
        proxyItem.run();
    }

    /**
     * 调用目标类，只有第一个方法会走拦截器
     */
    public static void testInvoke() {
        Enhancer enhancer = new Enhancer();
        enhancer.setSuperclass(Item.class);
        enhancer.setCallback(new LogMethodInterceptor(new Item()));
        Item proxyItem = (Item) enhancer.create();
        proxyItem.run();
    }
}
