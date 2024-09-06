
package rc.inventorymanagement;
import java.util.*;
/**
 *
 * @author Mashaba Yolanda Nkoka [ST10458688]
 */
public class InventoryManagement {

    public static void main(String[] args) {
       Inventory inventory = new Inventory();
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("\nInventory Management System");
            System.out.println("1. Add Item");
            System.out.println("2. Remove Item");
            System.out.println("3. Search Item");
            System.out.println("4. View All Items");
            System.out.println("5. Exit");
            System.out.print("Choose an option: ");
            int choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    System.out.print("Enter item name: ");
                    scanner.nextLine();  // Consume newline
                    String name = scanner.nextLine();
                    System.out.print("Enter item ID: ");
                    int id = scanner.nextInt();
                    System.out.print("Enter quantity: ");
                    int quantity = scanner.nextInt();
                    System.out.print("Enter price: ");
                    double price = scanner.nextDouble();
                    System.out.print("Is this a perishable item (y/n)? ");
                    char perishable = scanner.next().charAt(0);

                    if (perishable == 'y' || perishable == 'Y') {
                        System.out.print("Enter expiry date (yyyy-mm-dd): ");
                        scanner.nextLine();  // Consume newline
                        String expiryDate = scanner.nextLine();
                        inventory.addItem(new PerishableItem(name, id, quantity, price, expiryDate));
                    } else {
                        inventory.addItem(new Item(name, id, quantity, price));
                    }
                    break;

                case 2:
                    System.out.print("Enter item ID to remove: ");
                    int removeID = scanner.nextInt();
                    inventory.removeItem(removeID);
                    break;

                case 3:
                    System.out.print("Enter item name to search: ");
                    scanner.nextLine();  // Consume newline
                    String searchName = scanner.nextLine();
                    inventory.searchItem(searchName);
                    break;

                case 4:
                    inventory.viewAllItems();
                    break;

                case 5:
                    System.out.println("Exiting...");
                    System.exit(0);
                    break;

                default:
                    System.out.println("Invalid choice! Please choose again.");
            }
        }
    } 
 }

