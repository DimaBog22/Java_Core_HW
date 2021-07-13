package Сlothes.Footwear;

public class WorkingShoes implements Footwear{

    private String nameOfShoes;

    WorkingShoes (String name) {
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
