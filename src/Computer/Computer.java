package Computer;

import java.util.Random;
import java.util.Scanner;

public class Computer {

    public String cpu;
    public String ram;
    public String hdd;
    public int workCycle = 0;
    public int workCycleLimit = 3;
    boolean isWorking = true;
    boolean isOn = false;

    Computer(String cpu, String ram, String hdd) {

        this.cpu = cpu;
        this.ram = ram;
        this.hdd = hdd;

    }

    public void print() {
        System.out.println("cpu: " + cpu + ", ram: " + ram + ", hdd: " + hdd +
                ", work cycles: " + workCycle + ", Limit: " + workCycleLimit);
    }

    public void switchOn() {

//      метод включить, при включении может произойти сбой, при вызове метода
//      рандом загадывает число (0 либо 1), вы вводите число с клавиатуры, если
//      угадали, комп включается, если нет -  сгорает.Если комп сгорел при попытке
//      включить, нужно выдать сообщение что ему конец

        if (workCycle >= workCycleLimit) {

            System.out.println("Количество циклов работы " + workCycle + " превышает лимит циклов работы " + workCycleLimit);
            System.out.println("Купите новый комп");

        } else if (isOn == true) {

            System.out.println("Вы не можете включить уже включенный комп");

        } else if (isWorking == true){

            Random random = new Random();
            int randomNumber = random.nextInt(2);
            String message = "Компьютер сгорел при попытке включения";

            System.out.println("Введите число 1 или 0:");
            Scanner sc = new Scanner(System.in);
            int number = sc.nextInt();

                if (number == randomNumber) {

                    System.out.println("Добро пожаловать");
                    workCycle++;
                    isOn = true;

                } else {

                    System.out.println(message);
                    isWorking = false;

                }
        }

    }

    public void switchOff() {

        if (workCycle >= workCycleLimit) {

            System.out.println("Количество циклов работы " + workCycle + " превышает лимит циклов работы " + workCycleLimit);
            System.out.println("Купите новый комп");

        } else if (isOn == true && isWorking == true) { // проверка на то, что нельзя нельзя выключить комп, если он не включен

            Random random = new Random();
            int randomNumber = random.nextInt(2);
            String message = "Компьютер сгорел при попытке включения";

            System.out.println("Введите число 1 или 0:");
            Scanner sc = new Scanner(System.in);
            int number = sc.nextInt();

                if (number == randomNumber) {

                    System.out.println("Всего доброго");
                    workCycle++;
                    isOn = false;

                } else {

                    System.out.println(message);
                    isWorking = false;

                }

        } else {
            System.out.println("Вы не можете выключить компьютер, тк он не включен или сгорел");
        }

    }

}
