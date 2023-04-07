package gradebook.model;

import gradebook.controller.ProfessorController;
import gradebook.controller.StudentController;

import java.util.Arrays;

public class Menu {
    public void Menu(){
        StudentController studentController = new StudentController();
        studentController.addStudent("Marian", "Ionescu", 0, "123123", 2, "23", false, false, "mama", "tata");
        Student[] allStudents = studentController.getAllStudents();
        System.out.println(Arrays.toString(allStudents));
        studentController.addGrade(0, "math", 10, "07/03/2023");
        studentController.addGrade(0, "math", 9, "14/03/2023");
        System.out.println(Arrays.toString(allStudents));
    }
}
