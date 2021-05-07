package grades;

import java.util.ArrayList;


public class Student {

    private String name;
    private ArrayList<Integer> grades = new ArrayList<>();

    public Student(String name){
        this.name = name;
    }

    // returns the student's name
    public String getName(){
        return name;
    };
    // adds the given grade to the grades property
    public void addGrade(int grade){
        grades.add(grade);
    };
    // returns the average of the students grades
    public double getGradeAverage(){
        int sumOfGrade = 0;
        for(int i = 0; i <grades.size(); i++){
            sumOfGrade += grades.get(i);
        }
        return (double)sumOfGrade/grades.size();
    };

    public static void main(String[] args){

        Student Su = new Student("Shanshan");
        Su.addGrade(100);
        Su.addGrade(95);
        Su.addGrade(99);
        Su.addGrade(90);
        Su.addGrade(100);
        System.out.println("Su.getGradeAverage() = " + Su.getGradeAverage());

    }




}
