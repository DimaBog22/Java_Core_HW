package Transport;

public class CivilTransport extends AirTransport{

    public int passengers;
    public boolean isBusiness;

    public CivilTransport(int capacity, int maxSpeed, int weight, String brand, int wingspan, int minRunwayLength, int passengers, boolean isBusiness) {
        super(capacity, maxSpeed, weight, brand, wingspan, minRunwayLength);
        this.passengers = passengers;
        this.isBusiness = isBusiness;
    }
}
