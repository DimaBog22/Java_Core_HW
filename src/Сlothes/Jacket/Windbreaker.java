package Сlothes.Jacket;

public class Windbreaker implements Jacket{

    private String nameOfShoes;

    Windbreaker (String name) {
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
