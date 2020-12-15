package AbstractClassesInterfaceLec;

//Declaring as an 'interface'

public interface McFranchise {
    // Properties
    String companyName = "McDonald's"; // this String is CONSTANT



    //NO CONSTRUCTOR IN INTERFACE  (ONLY IN ABSTRACT CLASSES)

    // Abstract Methods (That we have to completely write out in any
    // class that IMPLEMENTS this interface

    public void broilStuff(String menuItem);

    public void businessHours(int open, int close);

    public String iceCreamMachineWorking();

}
