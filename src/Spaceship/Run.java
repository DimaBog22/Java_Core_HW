package Spaceship;

public class Run {

    public static void main(String[] args) {

        Spaceport baikonur = new Spaceport();
        IStart shuttleX99 = new Shuttle();

        baikonur.lauch(shuttleX99);

    }

}
