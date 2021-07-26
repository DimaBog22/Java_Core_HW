package Shop;

public class Main {

    public static void main(String[] args) {

        Item adidasEasy = new Item(11, "adidas easy352", 200);
        Item adidasEasy2 = new Item(12, "adidas easy584", 300);
        System.out.println(adidasEasy.getPrice());
        System.out.println(adidasEasy2.getPrice());
        Shop pobedy15 = new Shop();
        pobedy15.addItem(adidasEasy);
        pobedy15.addItem(adidasEasy2);

        System.out.println(pobedy15.getListOfItems());

        pobedy15.deleteItem(adidasEasy);

        System.out.println(pobedy15.getListOfItems());

        pobedy15.changeItem(adidasEasy2, "adidas easy 222");
        System.out.println(pobedy15.getListOfItems());

        Item adidasEasy4 = new Item(16, "adidas easy54", 700);
        Item adidasEasy5 = new Item(18, "adidas easy456547", 900);

        pobedy15.addItem(adidasEasy4);
        pobedy15.addItem(adidasEasy5);

        System.out.println("***");
        pobedy15.sort();





    }

}
