package Сlothes.Trousers;

public class Jeans implements Trousers {

    private String name;

    Jeans(String name) {
        this.name = name;
    }

    @Override
    public void putOn() {
        System.out.println(name + " одеты");
    }


    @Override
    public void takeOff() {
        System.out.println(name + " сняты");
    }


}
