package proxy.dynamic.cglib;

import net.sf.cglib.proxy.MethodInterceptor;
import net.sf.cglib.proxy.MethodProxy;

import java.lang.reflect.Method;

public class LogMethodInterceptor implements MethodInterceptor {

    private Object targetObject;

    public LogMethodInterceptor(Object targetObject){
        this.targetObject = targetObject;
    }

    @Override
    public Object intercept(Object obj, Method method, Object[] args, MethodProxy proxy) throws Throwable {
        System.out.println("----- LogMethodInterceptor begin -----");
        Object result = method.invoke(targetObject, args);
        System.out.println("----- LogMethodInterceptor end -----");
        return result;
    }
}
