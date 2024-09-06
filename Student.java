
package rc.mycompany.studentmanager;
import java.util.*;
import java.util.ArrayList;



/**
 *
 * @author Mashaba Yolanda Nkoka [ST10458688]
 */
public class Student {
   
    //Arrays to store information
    private String studentID;
    private String name;
    private int age;
    private String email;
    private String course;

    // List to store students
    public static ArrayList<Student> students = new ArrayList<>();
    public static Scanner scanner = new Scanner(System.in);

    // Constructor
    public Student() {
        this.studentID = "";
        this.name = "";
        this.age = 0;
        this.email = "";
        this.course = "";
    }

    public Student(String studentID, String name, int age, String email, String course) {
        this.studentID = studentID;
        this.name = name;
        this.age = age;
        this.email = email;
        this.course = course;
    }

    // Accessor methods (Getters)
    public String getStudentID() {
        return studentID;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public String getEmail() {
        return email;
    }

    public String getCourse() {
        return course;
    }

    // Mutator methods (Setters)
    public void setStudentID(String studentID) {
        this.studentID = studentID;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setCourse(String course) {
        this.course = course;
    }

    // Display student info
    public void displayStudentInfo() {
        System.out.println("STUDENT ID: " + studentID);
        System.out.println("STUDENT NAME: " + name);
        System.out.println("STUDENT AGE: " + age);
        System.out.println("STUDENT EMAIL: " + email);
        System.out.println("STUDENT COURSE: " + course);
        System.out.println("----------------------------------");
    }

    // Save student information
    public void saveStudent() {
        System.out.print("Enter the student ID: ");
        String studentID = scanner.nextLine();

        if (findStudent(studentID) != null) {
            System.out.println("Student with ID " + studentID + " already exists.");
            return;
        }

        System.out.print("Enter the student name: ");
        String name = scanner.nextLine();

        System.out.print("Enter the student age: ");
        int age = Integer.parseInt(scanner.nextLine());
        if (age < 16 || age > 65) {
            System.out.println("Invalid age! Please enter an age between 16 and 65.");
            return;
        }

        System.out.print("Enter the student email: ");
        String email = scanner.nextLine();

        System.out.print("Enter the student course: ");
        String course = scanner.nextLine();

        // Create a new student object and set the details
        Student newStudent = new Student(studentID, name, age, email, course);
        students.add(newStudent);
        System.out.println("Student captured successfully!");
    }

    // Search for a student by ID
    public void searchStudent() {
        System.out.print("Enter the student ID to search: ");
        String studentID = scanner.nextLine();

        Student student = findStudent(studentID);
        if (student != null) {
            student.displayStudentInfo();
        } else {
            System.out.println("Student with ID " + studentID + " not found.");
        }
    }

    // Delete a student by ID
    public void deleteStudent() {
        System.out.print("Enter the student ID to delete: ");
        String studentID = scanner.nextLine();

        Student student = findStudent(studentID);
        if (student != null) {
            System.out.print("Are you sure you want to delete student " + studentID + "? (y/n): ");
            String confirmation = scanner.nextLine();
            if (confirmation.equalsIgnoreCase("y")) {
                students.remove(student);
                System.out.println("Student with ID " + studentID + " was deleted.");
            } else {
                System.out.println("Deletion cancelled.");
            }
        } else {
            System.out.println("Student with ID " + studentID + " not found.");
        }
    }

    // View all students
    public void studentReport() {
        if (students.isEmpty()) {
            System.out.println("No students found.");
        } else {
            for (Student student : students) {
                student.displayStudentInfo();
            }
        }
    }

    // Find a student by ID
    public Student findStudent(String studentID) {
        for (Student student : students) {
            if (student.getStudentID().equals(studentID)) {
                return student;
            }
        }return null;
    
        
    }
    
    
        
    }

        

    
    
     



