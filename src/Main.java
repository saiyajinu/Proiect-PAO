import gradebook.controller.GradeController;
import gradebook.controller.ProfessorController;
import gradebook.controller.StudentController;
import gradebook.model.*;
import gradebook.repository.ProfessorRepository;

import java.util.ArrayList;
import java.util.Arrays;

public class Main {
    public static void main(String[] args){
        StudentController studentController = new StudentController();
        ProfessorController professorController = new ProfessorController();
//        ArrayList<String> myArray = new ArrayList<String>(Arrays.asList("bio", "fiz", "mate"));
//        boolean addedProf = professorController.addProfessor("mIrCiCa", "IONescU", 0, "123", ":321", myArray);
//        System.out.println("Prof added: " + addedProf);
//        Professor[] allProf = professorController.getAllProfessors();
//        System.out.println(Arrays.toString(allProf));

        studentController.addStudent("Marian", "Ionescu", 0, "123123", 2, "23", false, false, "mama", "tata");
        Student[] allStudents = studentController.getAllStudents();
        System.out.println(Arrays.toString(allStudents));
        studentController.addGrade(0, "math", 10, "07/03/2023");
        studentController.addGrade(0, "math", 9, "14/03/2023");
        System.out.println(Arrays.toString(allStudents));



    }

}