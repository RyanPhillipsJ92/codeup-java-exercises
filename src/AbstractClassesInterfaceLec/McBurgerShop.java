package AbstractClassesInterfaceLec;

import java.util.ArrayList;
import java.util.List;

public class McBurgerShop implements McFranchise {

    String companyName = "McDonald's"; // this String is CONSTANT

    private List<String> menuItems;
    private List<String> menuCategories;
    private int seatingCapacity;
    private int openTime;
    private int closeTime;
    private boolean iceCreamTime;

    //Constructor for McBurgerShop
    public McBurgerShop(List<String>menuItems, List<String>menuCategories, int seatingCapacity, int openTime, int closeTime, boolean iceCreamTime){
        this.menuItems = menuItems;
        this.menuCategories = menuCategories;
        this.seatingCapacity = seatingCapacity;
        this.openTime = openTime;
        this.closeTime = closeTime;
        this.iceCreamTime = iceCreamTime;
    }

    // Abstract Methods (That we have to completely write out in any
    // class that IMPLEMENTS this interface
    @Override
    public void broilStuff(String menuItem){
        System.out.println("Cooking up a lovely " + menuItem);
    }
    @Override
    public void businessHours(int open, int close){
        System.out.println("Open: " + open + " Close : " + close);

    }
    @Override
    public String iceCreamMachineWorking(){
        if (this.iceCreamTime){
            return "Time for Ice Cream!";
        }else {
            return "No Ice Cream for YOU!";
        }
    }



    //GETTERS & SETTERS

    public String getCompanyName() {
        return companyName;
    }

    public void setCompanyName(String companyName) {
        this.companyName = companyName;
    }

    public List<String> getMenuItems() {
        return menuItems;
    }

    public void setMenuItems(List<String> menuItems) {
        this.menuItems = menuItems;
    }

    public List<String> getMenuCategories() {
        return menuCategories;
    }

    public void setMenuCategories(List<String> menuCategories) {
        this.menuCategories = menuCategories;
    }

    public int getSeatingCapacity() {
        return seatingCapacity;
    }

    public void setSeatingCapacity(int seatingCapacity) {
        this.seatingCapacity = seatingCapacity;
    }

    public int getOpenTime() {
        return openTime;
    }

    public void setOpenTime(int openTime) {
        this.openTime = openTime;
    }

    public int getCloseTime() {
        return closeTime;
    }

    public void setCloseTime(int closeTime) {
        this.closeTime = closeTime;
    }

    public boolean isIceCreamTime() {
        return iceCreamTime;
    }

    public void setIceCreamTime(boolean iceCreamTime) {
        this.iceCreamTime = iceCreamTime;
    }
    public static void main(String[] args) {
        // Let's try to access some of a McBurgerShop's items /methods
        List<String> theseMenuItems = new ArrayList<>();
        theseMenuItems.add("Big Mac");
        theseMenuItems.add("French Fries");
        theseMenuItems.add("Quarter Pounder");

        List<String> theseCatagories = new ArrayList<>();
        theseCatagories.add("Entrees");
        theseCatagories.add("Sides");
      theseCatagories.add("Drinks");
        McBurgerShop mcDonaldsSanAntonio = new McBurgerShop( theseMenuItems, theseCatagories, 200, 800, 2300, true);
        System.out.println(mcDonaldsSanAntonio.companyName);

        for (String thisItem: mcDonaldsSanAntonio.getMenuItems() ) {

            mcDonaldsSanAntonio.broilStuff(thisItem);

//            System.out.println("Menu Item: " + thisItem);
        }

        //Creat an instance of AustinMcD, which implements methods slightly differently than McBurgerShop
        AustinMcD austinMcDonalds = new AustinMcD(theseMenuItems, theseCatagories, 200, 800, 2300, true);
        System.out.println(austinMcDonalds.companyName);
        for (String thisItem: austinMcDonalds.getMenuItems() ) {
                // See how austin cooks their items
            austinMcDonalds.broilStuff(thisItem);

//            System.out.println("Menu Item: " + thisItem);
        }

    }

}
