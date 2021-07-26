package Shop;

import java.util.HashMap;
import java.util.Map;

public class Shop {

    public Map <Integer, String> listOfItems = new HashMap<Integer, String>();

    public void addItem(Item item) {

        listOfItems.put(item.id, item.name);

    }





}
