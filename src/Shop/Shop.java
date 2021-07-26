package Shop;

import java.util.*;

public class Shop {

    private Map<Integer, String> listOfItems = new HashMap<Integer, String>();

    public void addItem(Item item) {
        listOfItems.put(item.getId(), item.getName());
    }

    public Map getListOfItems() {
        return listOfItems;
    }

    public void deleteItem(Item item) {
        listOfItems.remove(item.getId());
    }

    public void changeItem(Item item, String newName) {
        // метод меняет содержимое
//      listOfItems.put(item.id, newName);
        listOfItems.replace(item.getId(), newName);

    }

    public void sort() {

        Map<Integer, String> sortedMap = new TreeMap<Integer, String>(listOfItems);
        System.out.println(sortedMap);

    }

}
