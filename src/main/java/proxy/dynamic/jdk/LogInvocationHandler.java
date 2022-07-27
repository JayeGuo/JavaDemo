package proxy.dynamic.jdk;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

public class LogInvocationHandler implements InvocationHandler {

    private Object targetObject;

    public LogInvocationHandler(Object targetObject){
        this.targetObject = targetObject;
    }

    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        System.out.println("----- LogInvocationHandler begin -----");
        method.invoke(targetObject, args);
        System.out.println("----- LogInvocationHandler end -----");
        return null;
    }
}
