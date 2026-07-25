import java.util.HashMap;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // Create Student
        Student student = new Student("Srinivas", 19, 101);

        // Create HashMap to store courses
        HashMap<String, Course> courses = new HashMap<>();

        // Add Courses
        courses.put("CS101", new Course("CS101", "Java Programming", 2));
        courses.put("CS102", new Course("CS102", "Python Programming", 2));
        courses.put("CS103", new Course("CS103", "Data Structures", 2));

        int choice;

        do {

            System.out.println("\n===== STUDENT COURSE REGISTRATION =====");
            System.out.println("1. View Courses");
            System.out.println("2. Enroll Course");
            System.out.println("3. View Registered Courses");
            System.out.println("4. Exit");
            System.out.print("Enter your choice: ");

            choice = sc.nextInt();

            switch (choice) {

                case 1:
                    System.out.println("\nAvailable Courses:");
                    for (Course c : courses.values()) {
                        c.displayCourse();
                        System.out.println();
                    }
                    break;

                case 2:
                    System.out.print("Enter Course ID: ");
                    String id = sc.next();

                    if (courses.containsKey(id)) {
                        student.enroll(courses.get(id));
                    } else {
                        System.out.println("Invalid Course ID!");
                    }
                    break;

                case 3:
                    student.displayStudent();
                    student.displayEnrolledCourses();
                    break;

                case 4:
                    System.out.println("Thank You!");
                    break;

                default:
                    System.out.println("Invalid Choice!");

            }

        } while (choice != 4);

        sc.close();
    }
}