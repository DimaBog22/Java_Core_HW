package Animal;

public class Bat extends Mammal implements Echolator {

    @Override
    public int jump() {

        System.out.println("Bat is flying");
        return 0;

    }

    @Override
    public void locate() {
        System.out.println("Bat is in France");
    }
}
