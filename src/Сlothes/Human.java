package Сlothes;

import Сlothes.Footwear.Footwear;
import Сlothes.Jacket.Jacket;
import Сlothes.Trousers.Trousers;

public class Human implements Footwear, Jacket, Trousers {

    private String name;
    private Footwear footwer;
    private Jacket jacket;
    private Trousers trousers;

    public Human(String name, Footwear footwer,
          Jacket jacket, Trousers trousers) {

        this.name = name;
        this.footwer = footwer;
        this.jacket = jacket;
        this.trousers = trousers;

    }

    @Override
    public void putOn() {

        footwer.putOn();
        jacket.putOn();
        trousers.putOn();

    }


    @Override
    public void takeOff() {

        footwer.takeOff();
        jacket.takeOff();
        trousers.takeOff();

    }


}
