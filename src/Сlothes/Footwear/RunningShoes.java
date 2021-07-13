package Сlothes.Footwear;

public class RunningShoes implements Footwear{

    private String nameOfShoes;

    RunningShoes (String name) {
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
