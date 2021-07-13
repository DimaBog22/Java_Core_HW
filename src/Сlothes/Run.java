package Сlothes;

import Сlothes.Footwear.*;
import Сlothes.Jacket.*;
import Сlothes.Trousers.*;

public class Run {

    public static void main(String[] args) {

        Footwear nike = new RunningShoes("nike");
        Footwear timberland = new WorkingShoes("timberland");

        Jacket carhartt = new Coat("carhartt");
        Jacket nb = new Windbreaker("new balance");

        Trousers calvinKlein = new Pants("calvin klein");
        Trousers levis = new Jeans("levi's");

        Human mike = new Human("Mike", nike,
                carhartt, calvinKlein);
        Human carl = new Human("Carl", timberland,
                nb, levis);


        mike.putOn();
        mike.takeOff();

        System.out.println("***");

        carl.putOn();
        carl.takeOff();


    }

}
