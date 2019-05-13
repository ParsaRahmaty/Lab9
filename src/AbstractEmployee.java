import java.util.ArrayList;

/**
 * Created by 9731021 on 5/13/2019.
 */
public abstract class AbstractEmployee extends Person {
    protected String post;
    protected ArrayList<LegalFish> legalFishes;
    protected int currentIncome;
    protected Account account;

    public AbstractEmployee(String name, String lastName, int yearEntered, int id, String post, AccountingManagement accountingManagement) {
        super(name, lastName, yearEntered, id);
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
}
