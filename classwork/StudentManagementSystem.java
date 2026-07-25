import java.util.ArrayList;
import java.util.Scanner;

// Base Class
class Person {
    protected int id;
    protected String name;
    protected int age;

    public Person(int id, String name, int age) {
        this.id = id;
        this.name = name;
        this.age = age;
    }

    public void displayPerson() {
        System.out.println("ID   : " + id);
        System.out.println("Name : " + name);
        System.out.println("Age  : " + age);
    }
}

// Derived Class
class Student extends Person {
    private String course;
    private double marks;

    public Student(int id, String name, int age, String course, double marks) {
        super(id, name, age);
        this.course = course;
        this.marks = marks;
    }

    public String getGrade() {
        if (marks >= 90)
            return "A+";
        else if (marks >= 80)
            return "A";
        else if (marks >= 70)
            return "B";
        else if (marks >= 60)
            return "C";
        else if (marks >= 50)
            return "D";
        else
            return "Fail";
    }

    public void displayStudent() {
        displayPerson();
        System.out.println("Course: " + course);
        System.out.println("Marks : " + marks);
        System.out.println("Grade : " + getGrade());
        System.out.println("----------------------------");
    }
}

// Main Class
public class StudentManagementSystem {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        ArrayList<Student> students = new ArrayList<>();

        int choice;

        do {
            System.out.println("\n========== STUDENT MANAGEMENT SYSTEM ==========");
            System.out.println("1. Add Student");
            System.out.println("2. View Students");
            System.out.println("3. Search Student");
            System.out.println("4. Exit");
            System.out.print("Enter your choice: ");

            choice = sc.nextInt();

            switch (choice) {

                case 1:
                    sc.nextLine();

                    System.out.print("Enter Student ID: ");
                    int id = sc.nextInt();
                    sc.nextLine();

                    System.out.print("Enter Name: ");
                    String name = sc.nextLine();

                    System.out.print("Enter Age: ");
                    int age = sc.nextInt();
                    sc.nextLine();

                    System.out.print("Enter Course: ");
                    String course = sc.nextLine();

                    System.out.print("Enter Marks: ");
                    double marks = sc.nextDouble();

                    students.add(new Student(id, name, age, course, marks));

                    System.out.println("Student Added Successfully!");
                    break;

                case 2:

                    if (students.isEmpty()) {
                        System.out.println("No Student Records Found.");
                    } else {
                        System.out.println("\n------ Student Records ------");
                        for (Student s : students) {
                            s.displayStudent();
                        }
                    }

                    break;

                case 3:

                    System.out.print("Enter Student ID to Search: ");
                    int searchId = sc.nextInt();

                    boolean found = false;

                    for (Student s : students) {
                        if (s.id == searchId) {
                            System.out.println("\nStudent Found");
                            s.displayStudent();
                            found = true;
                            break;
                        }
                    }

                    if (!found) {
                        System.out.println("Student Not Found.");
                    }

                    break;

                case 4:
                    System.out.println("Thank You for Using Student Management System.");
                    break;

                default:
                    System.out.println("Invalid Choice.");
            }

        } while (choice != 4);

        sc.close();
    }
}