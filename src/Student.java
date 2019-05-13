import java.util.ArrayList;

public class Student extends Person {
    private String department;
    private ArrayList<Course> courses;

    public Student(String department) {
        this.department = department;
        courses = new ArrayList<>();
    }

    public String getDepartment() {
        return department;
    }

    public Course[] getCourses() {
        Course[] coursesArray = new Course[courses.size()];
        for (int i = 0; i < courses.size(); i++)
            coursesArray[i] = courses.get(i);
        return coursesArray;
    }

    public void addCourse(Course course) {
        courses.add(course);
    }
}
