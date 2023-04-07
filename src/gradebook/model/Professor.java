package gradebook.model;

import java.util.ArrayList;

public class Professor extends Person{
    String mail;
    ArrayList<String> classes;

    public Professor() {
        super();
        this.mail = "null";
        this.classes = new ArrayList<String>();
    }

    public Professor(String firstName, String lastName, Integer id, String phoneNumber, String mail, ArrayList<String> classes) {
        super(firstName, lastName, id, phoneNumber);
        this.mail = mail;
        this.classes = classes;
    }

    public String getMail() {
        return mail;
    }

    public void setMail(String mail) {
        this.mail = mail;
    }

    public ArrayList<String> getClasses() {
        return classes;
    }

    public void setClasses(ArrayList<String> classes) {
        this.classes = classes;
    }

    @Override
    public String toString() {
        return "Professor{" + super.toString() +
                "mail='" + mail + '\'' +
                ", classes=" + classes +
                '}';
    }
}
