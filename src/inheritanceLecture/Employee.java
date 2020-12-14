package inheritanceLecture;

public class Employee {
    public String name;
    public int id;
    public static String company;
    public Employee(){

    }

    public Employee (String name){ this.name = name; }

    public String getName(){ return name; }

    public void doWork(){ System.out.println("Working... Working..."); }

    public int getId() { return id; }
}
