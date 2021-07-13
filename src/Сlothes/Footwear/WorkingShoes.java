package Сlothes.Footwear;

public class WorkingShoes implements Footwear{

    private String name;

    public WorkingShoes (String name) {
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
