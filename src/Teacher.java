import java.util.ArrayList;

public class Teacher extends AbstractEmployee {
    private String group;
    private ArrayList<Course> courses;
    private ArrayList<Essay> essays;

    public Teacher(String name, String lastName, int yearEntered, int id, String post, AccountingManagement accountingManagement, String group) {
        super(name, lastName, yearEntered, id, post, accountingManagement);
        this.group = group;
        courses = new ArrayList<>();
        essays = new ArrayList<>();
    }

    public String getGroup() {
        return group;
    }

    public Course[] getCourses() {
        Course[] currentCoursesArray = new Course[courses.size()];
        return currentCoursesArray;
    }

    public void addCourse(Course course) {
        courses.add(course);
    }

    public void removeCourse(Course course) {
        if (courses.contains(course))
            courses.remove(course);
    }

    public void abstractUpdateIncome(UniversitySystem universitySystem) {
        currentIncome = 7 * 1000000;
        for (Course course : courses) {
            if (universitySystem.getCurrentDateAndTime().getMonth() - course.getStartTime().getMonth() <= 5) {
                currentIncome += 10 * 1000000;
            }
        }
    }

    public boolean abstractIsPromotable(UniversitySystem universitySystem) {
        int numberOfNewEssaysPublished = 0;
        for (Essay essay : essays) {
            if (essay.getYearPublished() - lastPromotionDate.getYear() >= 0)
                numberOfNewEssaysPublished++;
        }
        if (numberOfNewEssaysPublished >= 10)
            return true;
        else
            return false;
    }

    public void addEssay(Essay essay) {
        essays.add(essay);
    }
}
