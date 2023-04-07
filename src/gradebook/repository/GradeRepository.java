package gradebook.repository;

import gradebook.model.Grade;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class GradeRepository {
    private Grade[] storedGrades = new Grade[0];
    public boolean add(Grade grade){
        try {
            List<Grade> arrlist = new ArrayList<>(
                    Arrays.asList(storedGrades)
            );
            arrlist.add(grade);
            storedGrades = arrlist.toArray(storedGrades);
        } catch (Exception e) {
            System.out.println(e.getMessage());
            return false;
        }
        return true;
    }
    public Grade[] getAll() { return storedGrades;}
}
