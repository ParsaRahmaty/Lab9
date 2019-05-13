public class Essay {
    private String subject;
    private int yearPublished;

    public Essay(String subject, int yearPublished) {
        this.subject = subject;
        this.yearPublished = yearPublished;
    }

    public String getSubject() {
        return subject;
    }

    public int getYearPublished() {
        return yearPublished;
    }
}
