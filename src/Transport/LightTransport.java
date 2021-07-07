package Transport;

public class LightTransport extends LandTransport {

    public String type;
    public int passengers;

    public LightTransport(int capacity, int maxSpeed, int weight, String brand,
                          int wheels, int fuelConsumption, String type, int passengers) {
        super(capacity, maxSpeed, weight, brand, wheels, fuelConsumption);
        this.type = type;
        this.passengers = passengers;
    }

    public double calcCapacity(){
        return this.capacity * 0.74;
    }

    public void describe(){
        System.out.println("кол-во пассажиров: " + this.passengers +
                ", мощность в л.с.: " + this.capacity + ", макс скорость: " +
                this.maxSpeed + ", вес: " + this.weight + ", бренд: " +
                this.brand + ", кол-во колёс: " + this.wheels +
                ", расход топлива: " + this.fuelConsumption + ", тип кузова: " +
                this.type + ", мощность в кВ: " + calcCapacity());
    }

    private double calcFuel(double distance) {

        //Дистанцию умножить на Расход и разделить на 100

        return distance * this.fuelConsumption / 100;

    }

    public void showInfoAboutWay(double distance, double time) {

        System.out.println("За время " + time + ", автомобиль " + this.brand +
                ", двигаясь с максимальной скоростью " + this.maxSpeed + " км/ч, проедет " +
                distance + " км и израсходует " + calcFuel(distance) + " литров топлива");

    }

}
