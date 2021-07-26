package Shop;

import java.util.HashMap;
import java.util.Map;

public class Shop {

    private Map<Integer, String> listOfItems = new HashMap<Integer, String>();

    public void addItem(Item item) {
        listOfItems.put(item.id, item.name);
    }

    public Map getListOfItems() {
        return listOfItems;
    }

    public void deleteItem(Item item) {
        listOfItems.remove(item.id);
    }

    public void changeItem(Item item, String newName) {
        // метод меняет содержимое
//      listOfItems.put(item.id, newName);
        listOfItems.replace(item.id, newName);

    }


}
