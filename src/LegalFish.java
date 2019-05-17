/**
 * Created by 9731021 on 5/13/2019.
 */
public class LegalFish {
    private int id;
    private int amount;
    private DateAndTime dateAndTime;
    private AccountingInterface employee;

    public LegalFish(int id, int amount, DateAndTime dateAndTime, AccountingInterface employee) {
        this.id = id;
        this.amount = amount;
        this.dateAndTime = dateAndTime;
        this.employee = employee;
    }

    public int getId() {
        return id;
    }

    public int getAmount() {
        return amount;
    }

    public DateAndTime getDateAndTime() {
        return dateAndTime;
    }

    public AccountingInterface getEmployee() {
        return employee;
    }
}
