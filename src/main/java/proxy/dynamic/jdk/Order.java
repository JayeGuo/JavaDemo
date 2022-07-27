package proxy.dynamic.jdk;

public class Order implements IOrder {

    @Override
    public void run() {
        System.out.println("Order run");
    }
}
