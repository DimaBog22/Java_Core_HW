package Shop;

public class Main {

    public static void main(String[] args) {

        Item adidasEasy = new Item(11, "adidas easy352", 200);
        Item adidasEasy2 = new Item(12, "adidas easy584", 300);
        Shop pobedy15 = new Shop();
        pobedy15.addItem(adidasEasy);
        pobedy15.addItem(adidasEasy2);

        System.out.println(pobedy15.getListOfItems());

        pobedy15.deleteItem(adidasEasy);

        System.out.println(pobedy15.getListOfItems());

    }

}
