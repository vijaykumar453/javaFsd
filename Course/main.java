import java.util.ArrayList;

public class Student extends Person implements Enrollable {

    private int rollNumber;
    private ArrayList<Course> enrolledCourses;

    // Constructor
    public Student(String name, int age, int rollNumber) {
        super(name, age);
        this.rollNumber = rollNumber;
        enrolledCourses = new ArrayList<>();
    }

    // Enroll Method
    @Override
    public void enroll(Course course) {

        if (course.addStudent()) {
            enrolledCourses.add(course);
            System.out.println("Course Registered Successfully.");
        } else {
            System.out.println("Course is Full.");
        }

    }

    // Display Student Details
    public void displayStudent() {

        displayPerson();
        System.out.println("Roll Number : " + rollNumber);

    }

    // Display Registered Courses
    public void displayEnrolledCourses() {

        if (enrolledCourses.isEmpty()) {
            System.out.println("No Courses Registered.");
        } else {

            System.out.println("Registered Courses:");

            for (Course c : enrolledCourses) {
                System.out.println(c.getCourseId() + " - " + c.getCourseName());
            }

        }

    }
}