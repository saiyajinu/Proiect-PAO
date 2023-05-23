package gradebook.service;

import gradebook.model.Group;
import gradebook.model.Student;
import gradebook.repository.GroupRepository;

public class GroupService {
    private GroupRepository groupRepository;
    public GroupService() { groupRepository = new GroupRepository();}
    public boolean addGroup(String groupNo){
        Group group = new Group(groupNo);
        return this.groupRepository.add(group);
    }
    public void addStudent(String groupNo, Student student) { this.groupRepository.addStudent(groupNo, student);}
    public Group[] getAllGroups(){return this.groupRepository.getAllGroups();}

    public Group getGroupByNo(String groupNo){return this.groupRepository.getGroupByNo(groupNo);}
}
