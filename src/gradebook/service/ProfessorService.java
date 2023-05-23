package gradebook.service;

import gradebook.model.Professor;
import gradebook.repository.ProfessorRepository;

public class ProfessorService {
    private ProfessorRepository professorRepository;

    public ProfessorService() {
        professorRepository = new ProfessorRepository();
    }

    public boolean addProfessor(String firstName, String lastName, Integer id, String phoneNumber, String mail, String subject) {
        Professor professor = new Professor(firstName, lastName, id, phoneNumber, mail, subject);
        return this.professorRepository.add(professor);
    }

    public Professor[] getAllProfessors() {
        return this.professorRepository.getAll();
    }
}
