package proxy.dynamic.cglib;

public class Item {

    public void run(){
        System.out.println("item run");
        runElse();
    }

    public void runElse(){
        System.out.println("item run else");
    }

}
