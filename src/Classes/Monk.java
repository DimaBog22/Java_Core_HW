package Classes;

public class Monk {

    public short id;
    public int age;
    public double experience;

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

        Monk steve = new Monk();
        steve.age = 10;
        System.out.println(steve.age);

        for (int i = 0; i < 10; i++) {
            System.out.println(steve.kick());
        }

        steve.speak("Hi low");

    }

}
