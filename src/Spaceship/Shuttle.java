package Spaceship;

import java.util.Random;

public class Shuttle implements IStart {

    @Override
    public boolean preCheck() {

        Random random = new Random();
        int number = random.nextInt(10);

        if (number > 3) {
            return true;
        } else {
            return false;
        }

    }

    @Override
    public void launch() {
        System.out.println("Двигатели Шатла запущены. Все системы в норме");
    }

    @Override
    public void start() {
        System.out.println("Старт Шатла");
    }

}
