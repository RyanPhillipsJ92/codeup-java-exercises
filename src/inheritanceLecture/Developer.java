package inheritanceLecture;

public class Developer extends Employee{
        public Developer(){

    }
    public Developer(String name){
        super(name);
    }

    public void doWork(){
        System.out.println("Writing code...");
    }


    public void debug(){
        System.out.println("DEBUGGING");
    }
    public static void main(String[] args){
            Employee Bob = new Employee("Bob");
            System.out.println(Bob.getName());
            Bob.doWork();


            Developer John = new Developer();
//             System.out.println(John.getName());
            John.doWork();
            John.debug();
    }
}
