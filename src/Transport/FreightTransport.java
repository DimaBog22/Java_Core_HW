package Transport;

public class FreightTransport extends LandTransport{

    public int liftingCapacity;

    public FreightTransport(int capacity, int maxSpeed, int weight,
                            String brand, int wheels, int fuelConsumption,
                            int liftingCapacity) {
        super(capacity, maxSpeed, weight, brand, wheels, fuelConsumption);
        this.liftingCapacity = liftingCapacity;
    }

    public double calcCapacity(){
        return this.capacity * 0.74;
    }

    public void describe(){
        System.out.println("грузоподъемность: " + this.liftingCapacity +
                ", мощность в л.с.: " + this.capacity + ", макс скорость: " +
                this.maxSpeed + ", вес: " + this.weight + ", бренд: " +
                this.brand + ", кол-во колёс: " + this.wheels +
                ", расход топлива: " + this.fuelConsumption +
                ", мощность в кВ: " + calcCapacity());
    }
}
