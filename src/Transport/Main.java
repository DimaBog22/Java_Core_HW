package Transport;

public class Main {

    public static void main(String[] args) {

        LightTransport audi = new LightTransport(150, 230, 2000,
                "Audi", 4, 8, "sedan", 4);

        audi.showInfoAboutWay(575.5, 2.5);

        FreightTransport fiat = new FreightTransport(230, 150,
                3800,"Fiat", 4, 16, 2000);

        fiat.canLift(1000);
        fiat.canLift(2500);

    }

}
