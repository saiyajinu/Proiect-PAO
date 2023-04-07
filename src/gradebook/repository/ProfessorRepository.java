package gradebook.repository;

import gradebook.model.Professor;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ProfessorRepository {
    private Professor[] storedProfessors = new Professor[0];
    public boolean add(Professor professor){
        try {
            List<Professor> arrlist = new ArrayList<>(
                    Arrays.asList(storedProfessors)
            );
            arrlist.add(professor);
            storedProfessors = arrlist.toArray(storedProfessors);
        } catch (Exception e) {
            System.out.println(e.getMessage());
            return false;
        }
        return true;
    }
    public Professor[] getAll() { return storedProfessors;}
}
