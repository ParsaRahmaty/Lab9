/**
 * Created by 9731021 on 5/13/2019.
 */
public class Account {
    private AccountingInterface owner;
    private int balance;
    private int ownFromUniversity;

    public Account(AccountingInterface owner) {
        this.owner = owner;
    }

    public AccountingInterface getOwner() {
        return owner;
    }

    public int getBalance() {
        return balance;
    }

    public int getOwnFromUniversity() {
        return ownFromUniversity;
    }

    public void setBalance(int balance) {
        this.balance = balance;
    }

    public void setOwnFromUniversity(int ownFromUniversity) {
        this.ownFromUniversity = ownFromUniversity;
    }

    public void checkout(AccountingManagement accountingManagement, UniversitySystem universitySystem) {
        LegalFish legalFish = new LegalFish(accountingManagement.genLegalFishId(), ownFromUniversity, universitySystem.getCurrentDateAndTime(), owner);
        balance += ownFromUniversity;
        ownFromUniversity = 0;
        accountingManagement.addLegalFish(legalFish);
        owner.addLegalFish(legalFish);
    }
}
