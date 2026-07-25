public class Course {

    // Variables
    private String courseId;
    private String courseName;
    private int maxSeats;
    private int currentSeats;

    // Constructor
    public Course(String courseId, String courseName, int maxSeats) {
        this.courseId = courseId;
        this.courseName = courseName;
        this.maxSeats = maxSeats;
        this.currentSeats = 0;
    }

    // Getter Methods
    public String getCourseId() {
        return courseId;
    }

    public String getCourseName() {
        return courseName;
    }

    public int getMaxSeats() {
        return maxSeats;
    }

    public int getCurrentSeats() {
        return currentSeats;
    }

    // Add Student
    public boolean addStudent() {
        if (currentSeats < maxSeats) {
            currentSeats++;
            return true;
        }
        return false;
    }

    // Display Course Details
    public void displayCourse() {
        System.out.println("Course ID   : " + courseId);
        System.out.println("Course Name : " + courseName);
        System.out.println("Seats       : " + currentSeats + "/" + maxSeats);
    }
}