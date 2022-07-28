package proxy.dynamic.cglib;

import net.sf.cglib.proxy.MethodInterceptor;
import net.sf.cglib.proxy.MethodProxy;

import java.lang.reflect.Method;

public class LogSuperMethodInterceptor implements MethodInterceptor {

    @Override
    public Object intercept(Object proxyObject, Method method, Object[] args, MethodProxy methodProxy) throws Throwable {
        System.out.println("----- LogMethodInterceptor begin -----");
        Object result = methodProxy.invokeSuper(proxyObject, args);
//        Object result = methodProxy.invoke(obj, args); // 死循环
        System.out.println("----- LogMethodInterceptor end -----");
        return result;
    }
}
