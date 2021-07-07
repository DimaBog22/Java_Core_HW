package Transport;

public class CivilTransport extends AirTransport{

    public int passengers;
    public boolean isBusiness;

    public CivilTransport(int capacity, int maxSpeed, int weight, String brand,
                          int wingspan, int minRunwayLength, int passengers,
                          boolean isBusiness) {
        super(capacity, maxSpeed, weight, brand, wingspan, minRunwayLength);
        this.passengers = passengers;
        this.isBusiness = isBusiness;
    }


    public double calcCapacity(){
        return this.capacity * 0.74;
    }

    public void describe(){
        System.out.println("Размах крыльев: " + this.wingspan +
                ", мощность в л.с.: " + this.capacity + ", макс скорость: " +
                this.maxSpeed + ", вес: " + this.weight + ", бренд: " +
                this.brand + ", Минимальная длина взлётно-посадочной полосы для взлёта: " + this.minRunwayLength +
                ", Наличие бизнес класса: " + this.isBusiness +
                ", мощность в кВ: " + calcCapacity() +
                ", кол-во пассажиров: " + this.passengers);
    }

}
