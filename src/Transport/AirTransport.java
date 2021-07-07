package Transport;

public class AirTransport extends Transport{

    public int wingspan;
    public int minRunwayLength;

    public AirTransport(int capacity, int maxSpeed, int weight, String brand, int wingspan, int minRunwayLength) {
        super(capacity, maxSpeed, weight, brand);
        this.wingspan = wingspan;
        this.minRunwayLength = minRunwayLength;
    }
}
