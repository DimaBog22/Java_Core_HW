package Сlothes.Jacket;

public class Coat implements Jacket{

    private String name;

    public Coat (String name) {
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
