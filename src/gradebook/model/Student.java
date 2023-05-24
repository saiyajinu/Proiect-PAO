package gradebook.model;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class Student extends Person {
    private Integer year;
    private String  group;
    private Boolean isForeign;
    private Boolean isMinority;
    private String motherFName;
    private String fatherFName;
    private List<Grade> grades;

    public Student(){
        super();
        this.year = 0;
        this.group = "null";
        this.isForeign = false;
        this.isMinority = false;
        this.motherFName = "null";
        this.fatherFName = "null";
        this.grades = new ArrayList<>();
    }
    public Student(String firstName, String lastName, Integer id, String phoneNumber, Integer year, String group, Boolean isForeign, Boolean isMinority, String motherFName, String fatherFName) {
        super(firstName, lastName, id, phoneNumber);
        this.year = year;
        this.group = group;
        this.isForeign = isForeign;
        this.isMinority = isMinority;
        this.motherFName = motherFName;
        this.fatherFName = fatherFName;
        this.grades = new ArrayList<>();
    }

    public void addGrade(Grade grade){
        grades.add(grade);
    }

    public Double getAvgGrade(){
        Double sum = 0.0;
        if (grades.isEmpty())
            return 0.0;
        for(int i = 0; i < grades.size(); i++){
            sum = sum + grades.get(i).getValue();
        }
        return sum/grades.size();
    }
    public Integer getYear() {
        return year;
    }

    public void setYear(Integer year) {
        this.year = year;
    }

    public String getGroup() {
        return group;
    }

    public void setGroup(String group) {
        this.group = group;
    }

    public Boolean getForeign() {
        return isForeign;
    }

    public void setForeign(Boolean foreign) {
        isForeign = foreign;
    }

    public Boolean getMinority() {
        return isMinority;
    }

    public void setMinority(Boolean minority) {
        isMinority = minority;
    }

    public String getMotherFName() {
        return motherFName;
    }

    public void setMotherFName(String motherFName) {
        this.motherFName = motherFName;
    }

    public String getFatherFName() {
        return fatherFName;
    }

    public void setFatherFName(String fatherFName) {
        this.fatherFName = fatherFName;
    }

    public HashMap<String, Double> computeGrades(){
        HashMap<String, List<Double>> preComputedGrades = new HashMap<String, List<Double>>();
        for(int i = 0; i < grades.size(); i++){
            if(!preComputedGrades.containsKey(grades.get(i).getSubject())){
                preComputedGrades.put(grades.get(i).getSubject(), List.of(Double.valueOf(grades.get(i).getValue()), 1.0));
            }
            else{
                Double oldValue = (preComputedGrades.get(grades.get(i).getSubject())).get(0);
                Double newCount = (preComputedGrades.get(grades.get(i).getSubject())).get(1)+1;
                preComputedGrades.put(grades.get(i).getSubject(), List.of(oldValue + Double.valueOf(grades.get(i).getValue()),newCount));
            }
        }
        HashMap<String, Double> computedGrades = new HashMap<String,Double>();
        for (String i : preComputedGrades.keySet()){
            computedGrades.put(i, preComputedGrades.get(i).get(0)/preComputedGrades.get(i).get(1));
        }
        return computedGrades;
    }
    public void printEachGradesSituation(){
        HashMap<String, Double> computedGrades = this.computeGrades();
        System.out.println(this.getFirstName() + ' ' + this.getLastName());
        for (String i : computedGrades.keySet()){
            System.out.println(i + ' ' + computedGrades.get(i));
        }
        System.out.println();
    }

    public void computeAndPrintAllGradesSituation(){
        HashMap<String, Double> computedGrades = this.computeGrades();
        Double gradesSum = 0.0;
        for (Double i : computedGrades.values()) {
            gradesSum = gradesSum + i;
        }
        System.out.println(this.getFirstName() + ' ' + this.getLastName() + " - " + gradesSum / computedGrades.size());
    }
    @Override
    public String toString() {
        return  super.toString() +
                ", Grades = " + grades + '\n';
    }
}
