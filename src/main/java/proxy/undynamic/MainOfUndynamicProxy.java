package proxy.undynamic;

public class MainOfUndynamicProxy {

    public static void main(String[] args) {
        HouseAuth houseOwner = new HouseOwner();
        HouseAuth houseAgent = new HouseAgent(houseOwner);
        houseAgent.visitHouse();
    }
}
