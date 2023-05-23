package gradebook.controller;

import gradebook.model.Group;
import gradebook.model.Student;
import gradebook.service.GroupService;

public class GroupController {
    private GroupService groupService;
    public GroupController() { this.groupService = new GroupService(); this.initGroups();}

    public boolean addGroup(String groupNo) { return groupService.addGroup(groupNo);}

    public void initGroups(){
        addGroup("100");
        addGroup("101");
        addGroup("102");
        addGroup("200");
        addGroup("201");
        addGroup("202");
        addGroup("300");
        addGroup("301");
        addGroup("302");

    }
    public void addStudent(String groupNo, Student student){groupService.addStudent(groupNo, student);}
    public Group[] getAllGroups(){return this.groupService.getAllGroups();}
    public Group getGroupByNo(String groupNo){return this.groupService.getGroupByNo(groupNo);}
}
