package gradebook.controller;

import gradebook.model.Professor;
import gradebook.service.ProfessorService;


import java.util.ArrayList;

public class ProfessorController {
    private ProfessorService professorService;

    public ProfessorController() {
        this.professorService = new ProfessorService();
    }

    public boolean addProfessor(String firstName, String lastName, Integer id, String phoneNumber, String mail, ArrayList<String> classes) {
        firstName = capitalizeString(firstName);
        lastName = capitalizeString(lastName);
        return professorService.addProfessor(firstName, lastName, id, phoneNumber, mail, classes);
    }

    public Professor[] getAllProfessors() {
        return professorService.getAllProfessors();
    }

    private String capitalizeString (String str) {
        return str.substring(0,1).toUpperCase() + str.substring(1).toLowerCase();
    }
}
