package oop_lec;

public class Student {
    // ======================== slide 8 (constructors)

//        public String name;
        public String cohort;
        public void testMethod(){
            System.out.println("will this run?");
        }

    public Student() {
        System.out.println("new Student created!");

    }

        public Student(String studentName) {
            this();
            name = studentName;
            cohort = "Unassigned";
            System.out.println("with only name");
        }

        public Student(String studentName, String assignedCohort) {
            this(studentName);
            name = studentName;
            cohort = assignedCohort;
            System.out.println("wiht name and cohort");
        }



    public String name;
    private double grade;

    public Student(String studentName, double grade) {
        this.name = studentName;
        this.grade = grade;
    }

    //getter
    public double shareGrade(){
        return grade;
    }

    //setter
    public void changeGrade(double grade){
        this.grade = grade;
    }

    // ======================== slide 9 (this keyword)

//        public String name;
//        public String cohort;
//
//        public Student(String name) {
//            this(name, "Unassigned");
//        }
//
//        public Student(String name, String cohort) {
//            this.name = name;
//            this.cohort = cohort;
//        }
//
//        public String sayHello() {
//            return "Hello from " + this.name + "!";
//        }


    // ======================== slide 10 (visibility)

//        public String name;
//        private double grade;
//
//        public Student(String name, double grade) {
//            this.name = name;
//            this.grade = grade;
//        }
//
//        public double shareGrade() {
//            return grade;
//        }
//


}
