package proxy.undynamic;

public class MainOfUndynamicProxy {

    public static void main(String[] args) {
        CleanThing person = new Person();
        CleanThing proxyPerson = new CleanProxyPerson(person);
        proxyPerson.cleanHouse();
    }
}
