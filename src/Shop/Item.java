package Shop;

public class Item {

    protected int id;
    protected String name;
    protected int price;

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
