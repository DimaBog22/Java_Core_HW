package Transport;

public class FreightTransport extends LandTransport{

    public int liftingCapacity;

    public FreightTransport(int capacity, int maxSpeed, int weight, String brand, int wheels, int fuelConsumption, int liftingCapacity) {
        super(capacity, maxSpeed, weight, brand, wheels, fuelConsumption);
        this.liftingCapacity = liftingCapacity;
    }
}
