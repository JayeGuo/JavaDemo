package proxy.undynamic;

public class HouseAgent implements HouseAuth {

    private HouseAuth houseAuth;

    public HouseAgent(HouseAuth houseAuth) {
        this.houseAuth = houseAuth;
    }

    @Override
    public void visitHouse() {
        System.out.println("中介开始带人参观房子");
        houseAuth.visitHouse();
        System.out.println("参观结束");
    }
}
