
package rc.inventorymanagement;
import java.util.*;
/**
 *
 * @author Mashaba Yolanda Nkoka [ST10458688]
 */
public class Inventory {
    public ArrayList<Item> items;

    public Inventory() {
        items = new ArrayList<>();
    }

    public void addItem(Item item) {
        items.add(item);
        System.out.println("Item added successfully!");
    }

    public void removeItem(int itemID) {
        items.removeIf(item -> item.itemID == itemID);
        System.out.println("Item removed successfully!");
    }

    public void searchItem(String name) {
        for (Item item : items) {
            if (item.getItemName().equalsIgnoreCase(name)) {
                System.out.println(item.getDetails());
                return;
            }
        }
        System.out.println("Item not found.");
    }

    public void viewAllItems() {
        if (items.isEmpty()) {
            System.out.println("No items in inventory.");
        } else {
            for (Item item : items) {
                System.out.println(item.getDetails());
                System.out.println("-----------------------");
            }
        }
    }
}
