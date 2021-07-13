package Сlothes.Footwear;

public class RunningShoes implements Footwear{

    private String name;

    public RunningShoes(String name) {
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
