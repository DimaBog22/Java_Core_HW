package Animal;

public class Mammal extends Animal {

    @Override
    public int jump() {
        return 2;
    }

    @Override
    public void eat() {
        System.out.println("Mammal is eating");
    }

}
