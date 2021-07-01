package Classes;

public class Monk {

    public short id;
    public int age;
    public double experience;

    // create constructor

    public Monk(int age) {

        this.age = age;

    }

    public static void repeat(String message) {
        for (int i = 0; i < 3; i++) {
            System.out.println(message);
        }
    }

    public double kick() {

        double damage = Math.random();
        return damage;

    }

    public void speak(String word) {
        System.out.println("Monk is speaking " + word);
    }

}

class Executor {

    public static void main(String[] args) {

        Monk steve = new Monk(10);

        System.out.println(steve.age);

//        for (int i = 0; i < 10; i++) {
//            System.out.println(steve.kick());
//        }

        steve.speak("Hi low");

        // execution of static method repeat
//        Monk.repeat("Hiiiihihi");
//        steve.repeat("EEEE");

    }

}
