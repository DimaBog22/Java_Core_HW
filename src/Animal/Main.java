package Animal;

public class Main {

    public static void main(String[] args) {

//        Mammal mammal = new Mammal();
//        mammal.watch("Mammal jr.");
//        System.out.println(mammal.jump());
//        mammal.eat();
//
//        System.out.println("***");
//
//        Chinchilla chinchilla = new Chinchilla();
//        chinchilla.watch("Chinchilla");
//        System.out.println(chinchilla.jump());
//        chinchilla.eat();
//
//        System.out.println("***");
//
//        Bat bat = new Bat();
//        bat.jump();
//        bat.locate();
//        bat.eat();
//        bat.watch("Bat");

        Reptile gosha = new Reptile();
        gosha.watch("Gogen");
        gosha.eat();
        System.out.println(gosha.jump());
        gosha.kill(33);

    }

}
