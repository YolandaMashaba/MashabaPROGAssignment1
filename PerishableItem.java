
package rc.inventorymanagement;

/**
 *
 * @author Mashaba Yolanda Nkoka [ST10458688]
 */
public class PerishableItem extends Item {
    public String expiryDate;

    public PerishableItem(String itemName, int itemID, int quantity, double price, String expiryDate) {
        super(itemName, itemID, quantity, price);
        this.expiryDate = expiryDate;
    }

    @Override
    public String getDetails() {
        return super.getDetails() + "\nExpiry Date: " + expiryDate;
    }
}
