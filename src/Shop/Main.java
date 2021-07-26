package Shop;

public class Main {

    public static void main(String[] args) {

        Item adidasEasy = new Item(11, "adidas easy", 300);
        Shop pobedy15 = new Shop();
        pobedy15.addItem(adidasEasy);

        System.out.println(pobedy15.listOfItems);

    }

}
