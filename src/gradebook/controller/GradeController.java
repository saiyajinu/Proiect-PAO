package gradebook.controller;

import gradebook.model.Grade;
import gradebook.model.Professor;
import gradebook.service.GradeService;
import gradebook.service.ProfessorService;

import java.util.ArrayList;

public class GradeController {
    private GradeService gradeService;

    public GradeController() {
        this.gradeService = new GradeService();
    }

    public boolean addGrade(String subject, Integer value, String date) {
        return gradeService.addGrade(subject, value, date);
    }

    public Grade[] getAllGrades() {
        return gradeService.getAllGrades();
    }
}
