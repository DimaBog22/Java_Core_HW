package Transport;

public class FreightTransport extends LandTransport{

    public int liftingCapacity;

    public FreightTransport(int capacity, int maxSpeed, int weight,
                            String brand, int wheels, int fuelConsumption,
                            int liftingCapacity) {
        super(capacity, maxSpeed, weight, brand, wheels, fuelConsumption);
        this.liftingCapacity = liftingCapacity;
    }

    public void describe(){
        System.out.println("грузоподъемность: " + this.liftingCapacity +
                ", мощность в л.с.: " + this.capacity + ", макс скорость: " +
                this.maxSpeed + ", вес: " + this.weight + ", бренд: " +
                this.brand + ", кол-во колёс: " + this.wheels +
                ", расход топлива: " + this.fuelConsumption +
                ", мощность в кВ: " + calcCapacity());
    }

    public void canLift(int yourWeight) {

        if (liftingCapacity > yourWeight) {
            System.out.println("Грузовик загружен");
        } else {
            System.out.println("Вам нужен грузовик побольше");
        }

    }

}
