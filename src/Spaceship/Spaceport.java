package Spaceship;

public class Spaceport {

    public void lauch(IStart item) {

        if (item.preCheck() == false) {
            System.out.println("Предстартовая проверка провалена");
        } else {

            item.launch();

            for (int i = 10; i >= 1; i--) {
                System.out.print(i + " ");
            }

            System.out.println();
            item.start();

        }

    }

}
