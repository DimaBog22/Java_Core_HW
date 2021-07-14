package Spaceship;

public class Run {

    public static void main(String[] args) {

        Spaceport baikonur = new Spaceport();
        IStart shuttleX99 = new Shuttle();
        IStart spaceX112 = new SpaceX();

        baikonur.lauch(shuttleX99);
        System.out.println("***");
        baikonur.lauch(spaceX112);

    }

}
