public class Person {
    private String name;
    private String lastName;
    private int yearEntered;
    private int id;

    public Person(String name, String lastName, int yearEntered, int id) {
        this.name = name;
        this.lastName = lastName;
        this.yearEntered = yearEntered;
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public String getLastName() {
        return lastName;
    }

    public int getYearEntered() {
        return yearEntered;
    }

    public int getId() {
        return id;
    }
}
