/**
 * Created by 9731021 on 5/13/2019.
 */
public class Account {
    private AbstractEmployee owner;
    private int balance;
    private int ownFromUniversity;

    public Account(AbstractEmployee owner) {
        this.owner = owner;
    }

    public AbstractEmployee getOwner() {
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
        balance += ownFromUniversity;
        ownFromUniversity = 0;
        LegalFish legalFish = new LegalFish(accountingManagement.genLegalFishId(), universitySystem.getDateAndTime(), owner);
        accountingManagement.addLegalFish(legalFish);
        owner.addLegalFish(legalFish);
    }
}
