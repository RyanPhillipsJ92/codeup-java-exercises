package AbstractClassesInterfaceLec;

//I am declaring this to be an abstract class
public abstract class Franchise {
    // All of the methods in an abstract class are like a list of rules and requirements
    // for what needs to be implemented in any class that **extends** this abstracts class

    //if we were to creat a class that extends a franchise
    // i.e. McDonald's on I-10 vs McDonald's on Loop 1604

    // Properties (Constant Values)

    // THis is always the same no matter where we build a franchise location.
    private final String companyName = "McDonalds";

    private String managerName;


    public Franchise(String managerName){
        this.managerName = managerName;
    }

    //Methods
    public abstract void broilStuff(String menuItem); //broilStuff("bigMac")

    //for example 8a.m. = 0800
    // 10p.m. = 2200
    public abstract void bussinessHours(int open, int close);

    // non-void method
    public abstract boolean iceCreamMachineWorking();

    //non-abstract method
    public void greetCustomer(){
        //we have to write out method body
        //because we did not use ABSTRACT keyword when declaring method
        System.out.println("Welcome to McDonald's, Enjoy your meal!");
    }

//    //Static
//    double result = Math.pow(10,2);

    //Non-Static
//    Math myCoolMathTool = new Math();
    // Math Library wont let this happen ^^^^



    // GETTER & SETTER String already set at top just needs getter
    public String getCompanyName(){
        return companyName;
        // can retrieve this from any class that extends this abstract class, even though its declared private
    }


    public String getManagerName() {
        return managerName;
    }

    public void setManagerName(String managerName) {
        this.managerName = managerName;
    }
}




