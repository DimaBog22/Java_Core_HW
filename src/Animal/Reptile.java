package Animal;

public class Reptile extends Animal implements PeopleLocator{

    @Override
    public int jump() {
        return 5;
    }

    @Override
    public void eat() {
        System.out.println("Chinchilla is the best food");
    }

    @Override
    public int kill(int people) {

        System.out.println("I'm reptile, I killed " + people + " people");
        return people;

    }
}
