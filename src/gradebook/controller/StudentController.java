package gradebook.controller;


import gradebook.model.Student;
import gradebook.service.StudentService;

public class StudentController {
    private StudentService studentService;

    public StudentController() {
        this.studentService = new StudentService();
    }

    public boolean addStudent(String firstName, String lastName, Integer id, String phoneNumber, Integer year, String group, Boolean isForeign, Boolean isMinority, String motherFName, String fatherFName) {
        firstName = capitalizeString(firstName);
        lastName = capitalizeString(lastName);
        motherFName = capitalizeString(motherFName);
        fatherFName = capitalizeString(fatherFName);
        return studentService.addStudent(firstName, lastName, id, phoneNumber, year, group, isForeign, isMinority, motherFName, fatherFName);
    }

    public void addGrade(Integer id, String subject, Integer value){
        studentService.addGradeToStudent(id, subject, value);
    }

    public Double getAvgGrade(Integer id){
        return studentService.getAvgGrade(id);
    }
    public Student[] getAllStudents() {
        return studentService.getAllStudents();
    }

    public Student getStudentById(Integer id){ return studentService.getStudentById(id);}

    private String capitalizeString (String str) {
        return str.substring(0,1).toUpperCase() + str.substring(1).toLowerCase();
    }

}
