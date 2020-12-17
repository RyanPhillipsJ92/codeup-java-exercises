package grades;

import java.util.ArrayList;
import java.util.List;

public class Student {
    private String name;
    private ArrayList<Integer> grades = new ArrayList<>();


    public Student(String name, int grade) {
        this.name = name;
        this.grades = new ArrayList<>();
        this.grades.add(grade);
    }

    public Student(String name) {
        this.name = name;
        this.grades = new ArrayList<>();
    }

    // returns the student's name
    public String getName() {
        return name;
    }


    // adds the given grade to the grades property
    public void addGrade(int grade) {
        this.grades.add(grade);
    }



    public ArrayList<Integer> getGrades() {
        return grades;
    }

    // returns the average of the students grades
    public double getGradeAverage() {
        int total = 0;
        for (int grade : grades) {
            total += grade;
        }
        return (double) total / grades.size();
    }


//    public static void main(String[] args) {
//        Student student = new Student("Ryan", 100);
//        System.out.println(student.getName());
//        student.addGrade(100);
//        student.addGrade(50);
//        student.addGrade(75);
//        System.out.println(student.getGradeAverage());
//
//        Student student1 = new Student("Jon", 50);
//        System.out.println(student1.getName());
//        student1.addGrade(100);
//        student1.addGrade(75);
//        student1.addGrade(87);
//        System.out.println(student1.getGradeAverage());
//
//    }
}
