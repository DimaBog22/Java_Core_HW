package Сlothes.Jacket;

public class Windbreaker implements Jacket{

    private String name;

    public Windbreaker (String name) {
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
