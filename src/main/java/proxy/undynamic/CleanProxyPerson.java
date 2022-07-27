package proxy.undynamic;

public class CleanProxyPerson implements CleanThing {

    private CleanThing cleanThing;

    public CleanProxyPerson(CleanThing cleanThing) {
        this.cleanThing = cleanThing;
    }

    @Override
    public void cleanHouse() {
        System.out.println("----- 整体清洁下（专业人士） -----");
        cleanThing.cleanHouse();
    }
}
