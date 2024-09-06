
package rc.mycompany.studentmanager;
import java.util.*;
import java.util.ArrayList;

/**
 *
 * @author Mashaba Yolanda Nkoka [ST10458688]
 */
    
public class StudentManager {
     
    public static void main(String[] args) {
        Student student = new Student();
        Scanner scanner = new Scanner(System.in);

        
        while (true) { // Start an infinite loop to keep the program running until the user decides to exit
            showMenu(); // Display the menu to the user

            try {
                String choice = scanner.nextLine(); // Get user input

                // Use a switch statement to handle different choices
                switch (choice) {
                    case "1": // User wants to capture a new student
                        student.saveStudent();
                        break;
                    case "2": // User wants to search for a student
                        student.searchStudent();
                        break;
                    case "3": // User wants to delete a student
                        student.deleteStudent();
                        break;
                    case "4": // User wants to view all students
                        student.studentReport();
                        break;
                    case "5": // User wants to exit the application
                        System.out.println("Exiting the application...");
                        return; // This breaks the loop and ends the program
                    default: // If the user enters an invalid option
                        System.out.println("Invalid option. Please try again.");
                }
            } catch (NumberFormatException e) {
                System.out.println("Invalid number format. Please enter a valid number.");
            } catch (InputMismatchException e) {
                System.out.println("Invalid input. Please try again.");
            } catch (Exception e) {
                System.out.println("An unexpected error occurred: " + e.getMessage());
            }
        }
    }
    

    // Method to display the menu
    private static void showMenu() {
        System.out.println("\nSTUDENT MANAGEMENT APPLICATION");
        System.out.println("----------------------------------");
        System.out.println("Please select one of the following menu items:");
        System.out.println("(1) Capture a New Student");
        System.out.println("(2) Search for a Student");
        System.out.println("(3) Delete a Student");
        System.out.println("(4) View All Students");
        System.out.println("(5) Exit");
        System.out.print("Enter your choice: ");
    }
    
}

        
        
        
    

