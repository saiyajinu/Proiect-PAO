package gradebook.repository;
import gradebook.model.Group;
import gradebook.model.Student;

import java.util.*;

public class GroupRepository {
    private Map<String, Group> storedGroups = new HashMap<String, Group>();

    public boolean add(Group group){
        try {
            storedGroups.put(group.getGroupNo(), group);
        } catch (Exception e) {
            System.out.println(e.getMessage());
            return false;
        }
        return true;
    }

    public void addStudent(String groupNo, Student student){ storedGroups.get(groupNo).addStudent(student);}


    public Group[] getAllGroups(){
        return storedGroups.values().toArray(new Group[0]);
    }

    public Group getGroupByNo(String groupNo){
        return storedGroups.get(groupNo);
    }
}
