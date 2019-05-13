/**
 * Created by 9731021 on 5/13/2019.
 */
public class Worker extends AbstractEmployee {
    public Worker(String name, String lastName, int yearEntered, int id, String post, AccountingManagement accountingManagement) {
        super(name, lastName, yearEntered, id, post, accountingManagement);
    }

    public void abstractUpdateIncome(UniversitySystem universitySystem) {
        currentIncome = 3 * 1000000;
    }

    public boolean abstractIsPromotable(UniversitySystem universitySystem) {
        if (universitySystem.getCurrentDateAndTime().getYear() - lastPromotionDate.getYear() >= 3) {
            setLastPromotionDate(universitySystem.getCurrentDateAndTime());
            return true;
        } else
            return false;
    }
}
