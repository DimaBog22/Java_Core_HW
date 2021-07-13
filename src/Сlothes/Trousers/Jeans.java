package Сlothes.Trousers;

public class Jeans implements Trousers {

    private String nameOfShoes;

    Jeans(String name) {
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
