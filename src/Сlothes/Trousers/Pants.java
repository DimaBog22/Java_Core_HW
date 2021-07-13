package Сlothes.Trousers;

public class Pants implements Trousers{

    private String nameOfShoes;

    Pants (String name) {
        this.nameOfShoes = name;
    }

    @Override
    public void putOn() {
        System.out.println(nameOfShoes + " одеты");
    }


    @Override
    public void takeOff() {
        System.out.println(nameOfShoes + " сняты");
    }


}
