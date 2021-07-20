package Shop;

public class Item {

    private int id;
    private String name;
    private int price;

    Item(int id, String name, int price) {

        this.id = id;
        this.name = name;
        this.price = price;

    }
    // setters
    public void setId(int id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setPrice(int price) {
        this.price = price;
    }

}
