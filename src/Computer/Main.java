package Computer;

public class Main {

    public static void main(String[] args) {

        Computer pc = new Computer("core i5", "16gb", "2tb");

        pc.print();
        pc.switchOff();
        pc.switchOn();
        pc.print();
        pc.switchOff();


    }

}