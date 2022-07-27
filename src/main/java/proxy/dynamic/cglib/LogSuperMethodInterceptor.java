package proxy.dynamic.cglib;

import net.sf.cglib.proxy.MethodInterceptor;
import net.sf.cglib.proxy.MethodProxy;

import java.lang.reflect.Method;

public class LogSuperMethodInterceptor implements MethodInterceptor {

    @Override
    public Object intercept(Object obj, Method method, Object[] args, MethodProxy methodProxy) throws Throwable {
        System.out.println("----- LogMethodInterceptor begin -----");
        Object result = methodProxy.invokeSuper(obj, args);
//        Object result = methodProxy.invoke(obj, args); // 可以试试，会死循环，因为递归调用了
        System.out.println("----- LogMethodInterceptor end -----");
        return result;
    }
}
