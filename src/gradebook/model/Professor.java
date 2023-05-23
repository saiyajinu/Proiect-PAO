package gradebook.model;

import java.util.ArrayList;

public class Professor extends Person{
    private String mail;
    private String subject;

    public Professor() {
        super();
        this.mail = "null";
        this.subject = "null";
    }

    public Professor(String firstName, String lastName, Integer id, String phoneNumber, String mail, String subject) {
        super(firstName, lastName, id, phoneNumber);
        this.mail = mail;
        this.subject = subject;
    }

    public String getMail() {
        return mail;
    }

    public void setMail(String mail) {
        this.mail = mail;
    }

    public String getSubject() {
        return subject;
    }

    public void setSubject(String subject) {
        this.subject = subject;
    }

    @Override
    public String toString() {
        return "Professor{" + super.toString() +
                "mail='" + mail + '\'' +
                "subject='" + subject + '\'' +
                '}';
    }
}
