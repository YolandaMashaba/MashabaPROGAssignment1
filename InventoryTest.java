/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit5TestClass.java to edit this template
 */
package rc.inventorymanagement;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 *
 * @author RC_Student_lab
 */
public class InventoryTest {
    
    public InventoryTest() {
    }
    
    @BeforeAll
    public static void setUpClass() {
    }
    
    @AfterAll
    public static void tearDownClass() {
    }
    
    @BeforeEach
    public void setUp() {
    }
    
    @AfterEach
    public void tearDown() {
    }

    /**
     * Test of addItem method, of class Inventory.
     */
    @Test
    public void testAddItem() {
        System.out.println("addItem");
        Item item = null;
        Inventory instance = new Inventory();
        instance.addItem(item);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of removeItem method, of class Inventory.
     */
    @Test
    public void testRemoveItem() {
        System.out.println("removeItem");
        int itemID = 0;
        Inventory instance = new Inventory();
        instance.removeItem(itemID);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of searchItem method, of class Inventory.
     */
    @Test
    public void testSearchItem() {
        System.out.println("searchItem");
        String name = "";
        Inventory instance = new Inventory();
        instance.searchItem(name);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of viewAllItems method, of class Inventory.
     */
    @Test
    public void testViewAllItems() {
        System.out.println("viewAllItems");
        Inventory instance = new Inventory();
        instance.viewAllItems();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
