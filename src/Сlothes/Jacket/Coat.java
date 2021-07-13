package Сlothes.Jacket;

public class Coat implements Jacket{

    private String nameOfShoes;

    Coat (String name) {
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
