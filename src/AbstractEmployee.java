import java.util.ArrayList;

/**
 * Created by 9731021 on 5/13/2019.
 */
public abstract class AbstractEmployee extends Person {
    protected String post;
    protected ArrayList<LegalFish> legalFishes;
    protected int currentIncome;
    protected Account account;
    protected DateAndTime lastPromotionDate;

    public AbstractEmployee(String name, String lastName, int yearEntered, int id, String post, AccountingManagement accountingManagement) {
        super(name, lastName, yearEntered, id);
        legalFishes = new ArrayList<>();
        this.post = post;
        this.account = new Account(this);
        accountingManagement.addAccount(this.account);
    }

    public String getPost() {
        return post;
    }

    public LegalFish[] getLegalFishes() {
        LegalFish[] legalFishesArray = new LegalFish[legalFishes.size()];
        for (int i = 0; i < legalFishes.size(); i++)
            legalFishesArray[i] = legalFishes.get(i);
        return legalFishesArray;
    }

    public void addLegalFish(LegalFish legalFish) {
        legalFishes.add(legalFish);
    }

    public abstract void abstractUpdateIncome(UniversitySystem universitySystem);

    public Account getAccount() {
        return account;
    }

    public abstract boolean abstractIsPromotable(UniversitySystem universitySystem);

    public void setLastPromotionDate(DateAndTime lastPromotionDate) {
        this.lastPromotionDate = lastPromotionDate;
    }

    public DateAndTime getLastPromotionDate() {
        return lastPromotionDate;
    }

    public int getCurrentIncome() {
        return currentIncome;
    }

    public void setCurrentIncome(int currentIncome) {
        this.currentIncome = currentIncome;
    }
}