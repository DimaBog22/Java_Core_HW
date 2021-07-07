package Transport;

public class MilitaryTransport extends AirTransport{

    public boolean isCatapult;
    public int rockets;

    public MilitaryTransport(int capacity, int maxSpeed,
                             int weight, String brand, int wingspan,
                             int minRunwayLength, boolean isCatapult, int rockets) {
        super(capacity, maxSpeed, weight, brand, wingspan, minRunwayLength);
        this.isCatapult = isCatapult;
        this.rockets = rockets;
    }

    public void describe(){
        System.out.println("Размах крыльев: " + this.wingspan +
                ", мощность в л.с.: " + this.capacity + ", макс скорость: " +
                this.maxSpeed + ", вес: " + this.weight + ", бренд: " +
                this.brand + ", Минимальная длина взлётно-посадочной полосы для взлёта: "
                + this.minRunwayLength +
                ", Наличие системы катапультирования: " + this.isCatapult +
                ", мощность в кВ: " + calcCapacity() + ", Кол-во ракет на борту: "
                + this.rockets);
    }

}
