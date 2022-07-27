package proxy.undynamic;

public class Person implements CleanThing{

    @Override
    public void cleanHouse() {
        System.out.println("自己打扫下房间的核心区域");
    }

    public void cleanSafeBox() {
        System.out.println("打扫下保险箱");
    }

    public Person getChild(){
        return new Person();
    }

}
