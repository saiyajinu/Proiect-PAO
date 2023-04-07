package gradebook.model;

import java.util.List;

public class Course {
    private String courseName;
    private String room;
    private String period;

    public Course(){
        this.courseName = "null";
        this.room = "null";
        this.period = "null";
    }

    public Course(String courseName, String room, String period) {
        this.courseName = courseName;
        this.room = room;
        this.period = period;
    }

    public String getCourseName() {
        return courseName;
    }

    public void setCourseName(String courseName) {
        this.courseName = courseName;
    }

    public String getRoom() {
        return room;
    }

    public void setRoom(String room) {
        this.room = room;
    }

    public String getPeriod() {
        return period;
    }

    public void setPeriod(String period) {
        this.period = period;
    }
}
