package gradebook.model;

import java.util.Date;

public class Grade {
    String subject;
    Integer value;
    String date;

    public Grade() {
        this.value = 0;
        this.date = "null";
    }

    public Grade(String subject, Integer value, String date) {
        this.subject = subject;
        this.value = value;
        this.date = date;
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

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    @Override
    public String toString() {
        return "Grade{" +
                "subject='" + subject + '\'' +
                ", grade=" + value +
                ", date='" + date + '\'' +
                '}';
    }
}
