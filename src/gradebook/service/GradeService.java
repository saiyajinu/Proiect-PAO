package gradebook.service;

import gradebook.model.Grade;
import gradebook.model.Professor;
import gradebook.repository.GradeRepository;
import gradebook.repository.ProfessorRepository;

import java.util.ArrayList;

public class GradeService {
    private GradeRepository gradeRepository;

    public GradeService() {
        gradeRepository = new GradeRepository();
    }

    public boolean addGrade(String subject, Integer value) {
        Grade grade = new Grade(subject, value);
        return this.gradeRepository.add(grade);
    }

    public Grade[] getAllGrades() {
        return this.gradeRepository.getAll();
    }
}
