package gradebook.model;

import gradebook.controller.GroupController;
import gradebook.controller.ProfessorController;
import gradebook.controller.StudentController;

import java.util.Arrays;
import java.util.Scanner;

public class Menu {
    public void Menu(){
        StudentController studentController = new StudentController();
        ProfessorController professorController = new ProfessorController();
        GroupController groupController = new GroupController();

        studentController.addStudent("Marian", "Ionescu", 1000, "123123", 1, "101", false, false, "mama", "tata");
        studentController.addStudent("Adrian", "Sefcic", 1001, "999999", 1, "101", false, false, "amam", "atat");
        Student[] allStudents = studentController.getAllStudents();

        studentController.addGrade(1000, "Mathematics", 10);
        studentController.addGrade(1000, "Mathematics", 9);
        studentController.addGrade(1000, "Physics", 10);
        studentController.addGrade(1000, "Physics", 7);
        studentController.addGrade(1001, "Mathematics", 10);
        studentController.addGrade(1001, "Mathematics", 10);

        groupController.addStudent("101", studentController.getStudentById(1000));
        groupController.addStudent("101", studentController.getStudentById(1001));



        Scanner sc = new Scanner(System.in);
        Integer ans;
        do{
            System.out.println("What to do?");
            System.out.println("1.Add Student");
            System.out.println("2.Add Professor");
            System.out.println("3.Read All Students");
            System.out.println("4.Read All Professors");
            System.out.println("5.Add grade");
            System.out.println("6.Average grade for Student");
            System.out.println("7.Read Student by ID");
            System.out.println("8.Read Group by Number");
            System.out.println("9.Student Each Grades situation");
            System.out.println("10.Student General Grades situation");
            System.out.println("11.Group Gradebook");
            System.out.println("0.Stop");
            ans = Integer.valueOf(sc.nextLine());
            String fstNm, lstNm, phnNo;
            Integer id;
            AuditLog auditLog = new AuditLog();
            switch(ans){
                case 1:
                    String  group, mthNm, fthrNm, subject;
                    Integer year;
                    Boolean isF, isM;
                    System.out.println("Adding Student...");
                    System.out.print("First Name: ");
                    fstNm = sc.nextLine();
                    System.out.print("Last Name: ");
                    lstNm = sc.nextLine();
                    System.out.print("ID:");
                    id = Integer.valueOf(sc.nextLine());
                    System.out.print("Phone No.: ");
                    phnNo = sc.nextLine();
                    System.out.print("Year: ");
                    year = Integer.valueOf(sc.nextLine());
                    System.out.print("Group: ");
                    group = sc.nextLine();
                    System.out.print("Is foreign? (0/1) ");
                    isF = Boolean.valueOf(sc.nextLine());
                    System.out.print("Is part of minority? (0/1) ");
                    isM = Boolean.valueOf(sc.nextLine());
                    System.out.print("Mother name: ");
                    mthNm = sc.nextLine();
                    System.out.print("Father name: ");
                    fthrNm = sc.nextLine();
                    studentController.addStudent(fstNm, lstNm, id, phnNo, year, group, isF, isM, mthNm, fthrNm);
                    groupController.addStudent(group, studentController.getStudentById(id));
                    System.out.println();
                    auditLog.log("Added Student id= "+ id);
                    break;
                case 2:
                    String mail;
                    System.out.println("Adding Professor...");
                    System.out.print("First Name: ");
                    fstNm = sc.nextLine();
                    System.out.print("Last Name: ");
                    lstNm = sc.nextLine();
                    System.out.print("ID:");
                    id = Integer.valueOf(sc.nextLine());
                    System.out.print("Phone No.: ");
                    phnNo = sc.nextLine();
                    System.out.print("Mail: ");
                    mail = sc.nextLine();
                    System.out.print("Subject: ");
                    subject = sc.nextLine();
                    professorController.addProfessor(fstNm, lstNm, id, phnNo, mail, subject);
                    System.out.println();
                    auditLog.log("Added professor id= "+ id);
                    break;
                case 3:
                    allStudents = studentController.getAllStudents();
                    System.out.println(Arrays.toString(allStudents));
                    System.out.println();
                    auditLog.log("Read all students");
                    break;
                case 4:
                    Professor[] allProfessors = professorController.getAllProfessors();
                    System.out.println(Arrays.toString(allProfessors));
                    System.out.println();
                    auditLog.log("Read all professors");
                    break;
                case 5:
                    Integer value;
                    System.out.println();
                    System.out.println("Adding Grade...");
                    System.out.print("Student's ID: ");
                    id = Integer.valueOf(sc.nextLine());
                    System.out.print("The Subject: ");
                    subject = sc.nextLine();
                    System.out.print("Grade value: ");
                    value = Integer.valueOf(sc.nextLine());
                    studentController.addGrade(id, subject, value);
                    System.out.println();
                    auditLog.log("Added grade to student id= " + id);
                    break;
                case 6:
                    System.out.println("Getting Average Grade for Student...");
                    System.out.print("Student's ID: ");
                    id = Integer.valueOf(sc.nextLine());
                    System.out.println(studentController.getAvgGrade(id));
                    auditLog.log("Read avg grade of student id= " + id);
                    break;
                case 7:
                    System.out.println("Searching student by id...");
                    System.out.print("Student ID: ");
                    id = Integer.valueOf(sc.nextLine());
                    Student stud = studentController.getStudentById(id);
                    System.out.println(stud);
                    auditLog.log("Read student id= " + id);
                    break;
                case 8:
                    System.out.println("Groups: 100, 101, 102, 201, 202, 203, 301, 302, 303");
                    System.out.print("Group Number: ");
                    String grNo = sc.nextLine();
                    System.out.println(groupController.getGroupByNo(grNo));
                    auditLog.log("Read group " + grNo);
                    break;
                case 9:
                    System.out.println("Getting Students Grades situation...");
                    System.out.print("Student ID: ");
                    id = Integer.valueOf(sc.nextLine());
                    studentController.getStudentById(id).printEachGradesSituation();
                    auditLog.log("Got each grade's avg of student id= " + id);
                    break;
                case 10:
                    System.out.println("Getting Students General Grades situation...");
                    System.out.print("Student ID: ");
                    id = Integer.valueOf(sc.nextLine());
                    studentController.getStudentById(id).computeAndPrintAllGradesSituation();
                    auditLog.log("Got general grade avg of student id= " + id);
                    break;
                case 11:
                    System.out.println("Getting Group's Students and their Grade");
                    System.out.print("Group ID: ");
                    String groupNo = sc.nextLine();
                    groupController.getGroupByNo(groupNo).printAllStudentsAndTheirGrade();
                    auditLog.log("Got gradebook of group " + groupNo);
                    break;
                case 0:
                    auditLog.log("Exit program");
                    break;
                default:
                    System.out.println("Wrong input");
                    break;
            }
        }while(ans != 0);

    }
}
