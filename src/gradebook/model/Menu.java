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
        studentController.addStudent("Adrian", "Sefcic", 1000, "999999", 1, "101", false, false, "amam", "atat");
        Student[] allStudents = studentController.getAllStudents();
        studentController.addGrade(1000, "math", 10);
        studentController.addGrade(1000, "math", 9);
        studentController.addGrade(1001, "math", 10);
        studentController.addGrade(1001, "math", 10);
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
            System.out.println("0.Stop");
            ans = Integer.valueOf(sc.nextLine());
            String fstNm, lstNm, phnNo;
            Integer id;
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
                    break;
                case 3:
                    allStudents = studentController.getAllStudents();
                    System.out.println(Arrays.toString(allStudents));
                    System.out.println();
                    break;
                case 4:
                    Professor[] allProfessors = professorController.getAllProfessors();
                    System.out.println(Arrays.toString(allProfessors));
                    System.out.println();
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
                    break;
                case 6:
                    System.out.println("Getting Average Grade for Student...");
                    System.out.print("Student's ID: ");
                    id = Integer.valueOf(sc.nextLine());
                    System.out.println(studentController.getAvgGrade(id));
                    break;
                case 7:
                    System.out.println("Searching student by id...");
                    System.out.print("Student ID: ");
                    id = Integer.valueOf(sc.nextLine());
                    Student stud = studentController.getStudentById(id);
                    System.out.println(stud);
                    break;
                case 8:
                    System.out.println("Groups: 100, 101, 102, 201, 202, 203, 301, 302, 303");
                    System.out.print("Group Number: ");
                    String grNo = sc.nextLine();
                    System.out.println(groupController.getGroupByNo(grNo));
                    break;
                case 0:
                    break;
                default:
                    System.out.println("Wrong input");
                    break;
            }
        }while(ans != 0);

    }
}
