import java.util.ArrayList;

public class Course {
    private String name;
    private Teacher teacher;
    private Teacher teacherAssistant;
    private ArrayList<Student> students = new ArrayList<>();
    private DateAndTime startTime;

    public Course(String name, Teacher teacherAssistant) {
        this.name = name;
        this.teacherAssistant = teacherAssistant;
    }

    public Teacher getTeacherAssistant() {
        return teacherAssistant;
    }

    public void setTeacherAssistant(Teacher teacherAssistant) {
        this.teacherAssistant = teacherAssistant;
    }

    public String getName() {
        return name;
    }

    public Teacher getTeacher() {
        return teacher;
    }

    public Student[] getStudents() {
        Student[] studentsArray = new Student[students.size()];
        for (int i = 0; i < students.size(); i++)
            studentsArray[i] = students.get(i);
        return studentsArray;
    }

    public void addStudent(Student student) {
        this.students.add(student);
    }

    public void removeStudent(Student student) {
        if (students.contains(student))
            students.remove(student);
    }
}
