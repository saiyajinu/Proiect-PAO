package gradebook.model;

public class Person {
    private String firstName;
    private String lastName;
    private Integer id;
    private String phoneNumber;


    public Person(){
        this.firstName = "null";
        this.lastName = "null";
        this.id = 0;
        this.phoneNumber = "null";
    }
    public Person(String firstName, String lastName, Integer id, String phoneNumber) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.id = id;
        this.phoneNumber = phoneNumber;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public Integer getId() {
        return id;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    @Override
    public String toString() {
        return lastName + ' ' + firstName;
    }
}
