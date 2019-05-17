import java.util.ArrayList;

public class Student extends Person {
    protected String department;
    protected ArrayList<Course> courses;

    public Student(String name, String lastName, int yearEntered, int id, String department) {
        super(name, lastName, yearEntered, id);
        this.department = department;
        this.courses = new ArrayList<>();
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