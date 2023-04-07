package gradebook.service;

import gradebook.model.Professor;
import gradebook.repository.ProfessorRepository;

import java.util.ArrayList;

public class ProfessorService {
    private ProfessorRepository professorRepository;

    public ProfessorService() {
        professorRepository = new ProfessorRepository();
    }

    public boolean addProfessor(String firstName, String lastName, Integer id, String phoneNumber, String mail, ArrayList<String> classes) {
        Professor professor = new Professor(firstName, lastName, id, phoneNumber, mail, classes);
        return this.professorRepository.add(professor);
    }

    public Professor[] getAllProfessors() {
        return this.professorRepository.getAll();
    }
}
