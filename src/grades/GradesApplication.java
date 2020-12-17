package grades;

import java.sql.Statement;
import java.util.ArrayList;
import java.util.HashMap;
import util.Input;

public class GradesApplication{
    private ArrayList<Integer> groceries = new ArrayList<>();
    static Input input = new Input();

    public static void main(String[] args) {
        HashMap<String, Student> students = new HashMap<>();

          Student Bob = new Student("Bob",100);
             students.put("BigBobsBeepers", Bob);
                 Bob.addGrade(100);
                 Bob.addGrade(95);
                 Bob.addGrade(90);
//
          Student Ryan = new Student("Ryan", 90);
             students.put("Ryan.phillips.j92", Ryan);
                 Ryan.addGrade(100);
                 Ryan.addGrade(90);
                 Ryan.addGrade(80);
//
          Student Zach = new Student("Zach", 80);
             students.put("Zach", Zach);
                Zach.addGrade(90);
                Zach.addGrade(85);
                Zach.addGrade(80);

          Student Roberto = new Student("Roberto", 75);
            students.put("Roberto",Roberto);
                Roberto.addGrade(85);
                Roberto.addGrade(75);
                Roberto.addGrade(65);

//        System.out.println(students);//returns object not name
//        System.out.println(Bob.getName());//returns name
//        System.out.println(Bob.getGrades());
//        System.out.println(Bob.getGradeAverage());
//
//        System.out.println(Ryan.getName());//returns name
//        System.out.println(Ryan.getGrades());
//        System.out.println(Ryan.getGradeAverage());
//
//        System.out.println(Zach.getName());//returns name
//        System.out.println(Zach.getGrades());
//        System.out.println(Zach.getGradeAverage());
//
//        System.out.println(Roberto.getName());//returns name
//        System.out.println(Roberto.getGrades());
//        System.out.println(Roberto.getGradeAverage());

        commandListInterface(students);

    }

    public static void commandListInterface(HashMap<String, Student> students) {
        System.out.println("Welcome!\n");
        System.out.println("Here are the GitHub usernames of our students:\n");
        do {
            for (String key : students.keySet()) {
                System.out.print("| " + key + " |");
            }
            System.out.println("\n\nWhat username would you like to see more information on?\n");
            String usernameKey = input.getString();
            if (students.containsKey(usernameKey)) {
                Student selectedStudent = students.get(usernameKey);
                System.out.printf("\nName: %s - GitHub Username: %s\n", selectedStudent.getName(), usernameKey);
                System.out.printf("Current GPA: %.2f\n", selectedStudent.getGradeAverage());
            } else {
                System.out.println("\nSorry, no student found with the GitHub username of " + usernameKey);
            }
            System.out.println("\nWould you like to see another student?\n");
        } while (input.yesNo());
        System.out.println("\nGoodbye, and have a wonderful day!");
    }

}
