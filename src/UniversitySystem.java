import java.util.ArrayList;

public class UniversitySystem {
    private DateAndTime currentDateAndTime;
    private ArrayList<Course> courses;
    private ArrayList<AbstractEmployee> employees;
    private ArrayList<Student> students;
    private AccountingManagement accountingManagement;

    public UniversitySystem(AccountingManagement accountingManagement) {
        this.accountingManagement = accountingManagement;
    }

    public DateAndTime getCurrentDateAndTime() {
        return currentDateAndTime;
    }

    public Course[] getCourses() {
        Course[] coursesArray = new Course[courses.size()];
        for (int i = 0; i < courses.size(); i++)
            coursesArray[i] = courses.get(i);
        return coursesArray;
    }

    public AbstractEmployee[] getEmployees() {
        AbstractEmployee[] employeesArray = new AbstractEmployee[employees.size()];
        for (int i = 0; i < employees.size(); i++)
            employeesArray[i] = employees.get(i);
        return employeesArray;
    }

    public Student[] getStudents() {
        Student[] studentsArray = new Student[students.size()];
        for (int i = 0; i < students.size(); i++)
            studentsArray[i] = students.get(i);
        return studentsArray;
    }

    public void addCourse(Course course) {
        courses.add(course);
    }

    public void removeCourse(Course course) {
        courses.remove(course);
    }

    public void addEmployee(AbstractEmployee employee) {
        employees.add(employee);
    }

    public void removeEmployee(AbstractEmployee employee) {
        employees.remove(employee);
    }

    public void addStudent(Student student) {
        students.add(student);
    }

    public void removeStudent(Student student) {
        students.remove(student);
    }

    public void updateDateAndTime(DateAndTime dateAndTime) {
        this.currentDateAndTime = dateAndTime;
    }

    public AccountingManagement getAccountingManagement() {
        return accountingManagement;
    }
}
