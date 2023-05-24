package gradebook.model;

import java.util.ArrayList;
import java.util.List;
import java.util.TreeSet;

public class Group {
    private String groupNo;
    private TreeSet<Student> students;

    public Group() {
        this.groupNo = "null";
        this.students = new TreeSet<Student>(new StudentNameComparator());
    }

    public Group(String groupNo){
        this.groupNo = groupNo;
        this.students = new TreeSet<Student>(new StudentNameComparator());
    }
    public Group(String groupNo, TreeSet<Student> students) {
        this.groupNo = groupNo;
        this.students = students;
    }

    public String getGroupNo() {
        return groupNo;
    }

    public void setGroupNo(String groupNo) {
        this.groupNo = groupNo;
    }

    public TreeSet<Student> getStudents() {
        return students;
    }

    public void setStudents(TreeSet<Student> students) {
        this.students = students;
    }
    public void addStudent(Student student){students.add(student);}

    public void printAllStudentsAndTheirGrade(){
        for (Student student : students)
        {
            student.computeAndPrintAllGradesSituation();
        }
        System.out.println();
    }

    @Override
    public String toString(){
        return "Group " + groupNo + "\n" + students + '\n';
    }

}
