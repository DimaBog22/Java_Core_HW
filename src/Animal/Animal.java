package Animal;

public abstract class Animal {

    public abstract int jump();

    public abstract void eat();

    public void watch(String name) {
        System.out.println(name + " is watching");
    }

}
