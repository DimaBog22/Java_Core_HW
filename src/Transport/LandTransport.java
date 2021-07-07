package Transport;

public class LandTransport extends Transport{

    int wheels;
    int fuelConsumption;

    public LandTransport(int capacity, int maxSpeed, int weight, String brand, int wheels, int fuelConsumption) {
        super(capacity, maxSpeed, weight, brand);
        this.wheels = wheels;
        this.fuelConsumption = fuelConsumption;
    }
}
