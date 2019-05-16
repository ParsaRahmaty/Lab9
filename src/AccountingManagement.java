import java.util.ArrayList;

public class AccountingManagement {
    private ArrayList<Account> accounts;
    private ArrayList<LegalFish> legalFishes;
    private DateAndTime nextEndTerm;
    private static int staticLastLegalFishId = 0;

    public AccountingManagement() {
        accounts = new ArrayList<>();
        legalFishes = new ArrayList<>();
    }

    public Account[] getAccounts() {
        Account[] accountsArray = new Account[accounts.size()];
        for (int i = 0; i < accounts.size(); i++)
            accountsArray[i] = accounts.get(i);
        return accountsArray;
    }

    public LegalFish[] getLegalFishes() {
        LegalFish[] legalFishesArray = new LegalFish[legalFishes.size()];
        for (int i = 0; i < legalFishes.size(); i++)
            legalFishesArray[i] = legalFishes.get(i);
        return legalFishesArray;
    }

    public DateAndTime getNextEndTerm() {
        return nextEndTerm;
    }

    public void addAccount(Account account) {
        accounts.add(account);
    }

    public void removeAccount(Account account) {
        if (accounts.contains(account))
            accounts.remove(account);
    }

    public void addLegalFish(LegalFish legalFish) {
        legalFishes.add(legalFish);
    }

    public void setNextEndTerm(DateAndTime nextEndTerm) {
        this.nextEndTerm = nextEndTerm;
    }

    public void settle(UniversitySystem universitySystem) {
        for (Account account : accounts)
            account.checkout(this, universitySystem);
    }

    public static int genLegalFishId() {
        staticLastLegalFishId++;
        return staticLastLegalFishId;
    }
}
