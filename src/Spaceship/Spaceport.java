package Spaceship;

public class Spaceport {

    public void lauch(IStart item) {

        if (item.preCheck() == false) {
            System.out.println("Предстартовая проверка провалена");
        } else {
            item.launch();
        }

    }

}
