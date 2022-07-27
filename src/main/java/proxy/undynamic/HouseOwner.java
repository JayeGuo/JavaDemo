package proxy.undynamic;

public class HouseOwner implements HouseAuth {

    @Override
    public void visitHouse() {
        System.out.println("HouseOwner visitHouse");
    }

    public void fixHouse(){
        System.out.println("HouseOwner fixHouse");
    }
}
