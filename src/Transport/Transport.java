package Transport;

public class Transport {

    public int capacity;
    public int maxSpeed;
    public int weight;
    public String brand;

    public Transport(int capacity, int maxSpeed, int weight, String brand) {
        this.capacity = capacity;
        this.maxSpeed = maxSpeed;
        this.weight = weight;
        this.brand = brand;
    }

    public double calcCapacity(){
        return this.capacity * 0.74;
    }

}
