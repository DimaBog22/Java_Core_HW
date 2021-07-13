package Сlothes.Trousers;

public class Pants implements Trousers{

    private String name;

    public Pants (String name) {
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
