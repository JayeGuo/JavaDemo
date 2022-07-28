package proxy.reflection;

import proxy.dynamic.jdk.Order;
import proxy.undynamic.Person;

import java.lang.reflect.Method;
import java.util.Objects;

public class MainOfReflection {
    public static void main(String[] args) throws Throwable {
        Person person = new Person();
        invokeByName(person, "cleanHouse");
        invokeByName(person, "cleanSafeBox");

        Order order = new Order();
        invokeByName(order, "run");
    }

    public static void invokeByName(Object object, String methodName) throws Throwable{
        Class<?> aClass = Class.forName(object.getClass().getName());
        Method method = aClass.getMethod(methodName, new Class[0]);
        method.invoke(object, null);
    }

    public static void invokeByName(Person object, String methodName){
        if ("cleanHouse".equals(methodName)) {
            object.cleanHouse();
        } else if ("cleanSafeBox".equals(methodName)) {
            object.cleanSafeBox();
        }
    }


}
