package grades;

import java.util.ArrayList;
import java.util.List;

public class Student {
private String name;
private ArrayList<Integer> grades;


    public Student(String name) {
        this.name = name;
        grades = new ArrayList<>();
    }

    // returns the student's name
    public String getName(){return name;}


    // adds the given grade to the grades property
    public void addGrade(int grade){
        grades.add(grade);
    };


    // returns the average of the students grades
    public double getGradeAverage(){
        int total = 0;
        double average = 0;
        System.out.println("Your grade average is:");
    for (int grade : grades){
        total += grade;
    }
    average = grades.size();;
    return total / average;
    }


    public static void main(String[] args) {
        Student student = new Student("Ryan");
        System.out.println(student .getName());
        student.addGrade(100);
        student.addGrade(50);
        student.addGrade(75);
        System.out.println(student.getGradeAverage());

        Student student1 = new Student("Jon");
        System.out.println(student1 .getName());
        student1.addGrade(100);
        student1.addGrade(75);
        student1.addGrade(87);
        System.out.println(student1.getGradeAverage());

    }
}
