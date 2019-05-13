import java.util.ArrayList;

/**
 * Created by 9731021 on 5/13/2019.
 */
public class Master extends Student{
    ArrayList<Essay> essays = new ArrayList<>();

    public Master(String name, String lastName, int yearEntered, int id, String department) {
        super(name, lastName, yearEntered, id, department);
    }

    public Essay[] getEssays() {
        Essay[] essaysArray = new Essay[essays.size()];
        for (int i = 0; i < essays.size(); i++)
            essaysArray[i] = essays.get(i);
        return essaysArray;
    }

    public void addEssay(Essay essay) {
        essays.add(essay);
    }
}
