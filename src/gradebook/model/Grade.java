package gradebook.model;
import java.time.LocalDate;

public class Grade {
    String subject;
    Integer value;
    LocalDate date;

    public Grade() {
        this.value = 0;
        this.date = LocalDate.now();
    }

    public Grade(String subject, Integer value) {
        this.subject = subject;
        this.value = value;
        this.date = LocalDate.now();
    }

    public String getSubject() {
        return subject;
    }

    public void setSubject(String subject) {
        this.subject = subject;
    }

    public Integer getValue() {
        return value;
    }

    public void setValue(Integer grade) {
        this.value = grade;
    }

    public LocalDate getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = LocalDate.now();
    }

    @Override
    public String toString() {
        return subject + ' ' + value + ' ' + date;
    }
}
