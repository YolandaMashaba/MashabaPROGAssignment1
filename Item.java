
package rc.inventorymanagement;

/**
 *
 * @author Mashaba Yolanda Nkoka [ST10458688]
 */
public class Item {
    public String itemName;
    public int itemID;
    public int quantity;
    public double price;

    public Item(String itemName, int itemID, int quantity, double price) {
        this.itemName = itemName;
        this.itemID = itemID;
        this.quantity = quantity;
        this.price = price;
    }

    public String getDetails() {
        return "Item ID: " + itemID + "\nName: " + itemName + "\nQuantity: " + quantity + "\nPrice: R" + price;
    }

    public String getItemName() {
        return itemName;
    }
}


