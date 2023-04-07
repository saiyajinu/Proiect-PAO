package gradebook.service;

import gradebook.model.Grade;
import gradebook.model.Student;
import gradebook.repository.StudentRepository;

public class StudentService {
    private StudentRepository studentRepository;

    public StudentService() {
        studentRepository = new StudentRepository();
    }

    public boolean addStudent(String firstName, String lastName, Integer id, String phoneNumber, Integer year, String group, Boolean isForeign, Boolean isMinority, String motherFName, String fatherFName) {
        Student student = new Student(firstName, lastName, id, phoneNumber, year, group, isForeign, isMinority, motherFName, fatherFName);
        student.setId(id);
        return this.studentRepository.add(student);
    }

    public void addGradeToStudent(Integer id, String subject, Integer value, String date){
        Grade grade = new Grade(subject, value, date);
        this.studentRepository.addGrade(id, grade);
    }

    public Student[] getAllStudents() {
        return this.studentRepository.getAll();
    }
}
