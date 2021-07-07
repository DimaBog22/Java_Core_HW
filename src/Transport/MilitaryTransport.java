package Transport;

public class MilitaryTransport extends AirTransport{

    public boolean isCatapult;
    public int rockets;

    public MilitaryTransport(int capacity, int maxSpeed, int weight, String brand, int wingspan, int minRunwayLength, boolean isCatapult, int rockets) {
        super(capacity, maxSpeed, weight, brand, wingspan, minRunwayLength);
        this.isCatapult = isCatapult;
        this.rockets = rockets;
    }
}
