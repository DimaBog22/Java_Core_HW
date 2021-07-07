package Transport;

public class LightTransport extends LandTransport{

    public String type;
    public int passengers;

    public LightTransport(int capacity, int maxSpeed, int weight, String brand, int wheels, int fuelConsumption, String type, int passengers) {
        super(capacity, maxSpeed, weight, brand, wheels, fuelConsumption);
        this.type = type;
        this.passengers = passengers;
    }
}
