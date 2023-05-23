package gradebook.repository;

import gradebook.model.Grade;
import gradebook.model.Student;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class StudentRepository {
    private Student[] storedStudents = new Student[0];
    public boolean add(Student student) {
        try {
            List<Student> arrlist = new ArrayList<>(
                    Arrays.asList(storedStudents)
            );
            arrlist.add(student);
            storedStudents = arrlist.toArray(storedStudents);
        } catch (Exception e) {
            System.out.println(e.getMessage());
            return false;
        }
        return true;
    }

    public void addGrade(Integer id, Grade grade){
        storedStudents[id-1000].addGrade(grade);
    }

    public Double getAvgGrade(Integer id){ return storedStudents[id-1000].getAvgGrade();}

    public Student[] getAll() {
        return storedStudents;
    }

    public Student getStudentById(Integer id){ return storedStudents[id-1000];}
}


