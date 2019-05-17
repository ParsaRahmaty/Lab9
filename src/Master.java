import java.util.ArrayList;

/**
 * Created by 9731021 on 5/13/2019.
 */
public class Master extends Student implements AccountingInterface{
    private ArrayList<Essay> essays;
    private ArrayList<LegalFish> legalFishes;
    private int currentIncome;

    public Master(String name, String lastName, int yearEntered, int id, String department) {
        super(name, lastName, yearEntered, id, department);
        this.essays = new ArrayList<>();
        this.legalFishes = new ArrayList<>();
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

    public void addLegalFish(LegalFish legalFish) {
        legalFishes.add(legalFish);
    }

    public void abstractUpdateIncome(UniversitySystem universitySystem) {
        currentIncome = essays.size() * 500000;
    }
}
