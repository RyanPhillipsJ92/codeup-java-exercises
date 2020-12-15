package AbstractClassesInterfaceLec;

import java.util.ArrayList;
import java.util.List;

//San Antonio installation of franchise
public class BurgerShop extends Franchise{
// this will be an ACTUAL McDonalds Store
    //It has to follow all the 'rules' set in "Franchise" abstract class


    //properties (can have as many custom as we want)
    private List<String> menuItems;
    private List<String> menuCategories;
    private int seatingCapacity;
    private int openTime;
    private int closeTime;
    private boolean iceCreamTime;

    //Constructor\

    public BurgerShop(String managerName, List<String> menuItems, List<String> menuCategories, int seatingCapacity, int openTime, int closeTime, boolean iceCreamTime) {
        super(managerName);
        this.menuItems = menuItems;
        this.menuCategories = menuCategories;
        this.seatingCapacity = seatingCapacity;
        this.openTime = openTime;
        this.closeTime = closeTime;
        this.iceCreamTime = iceCreamTime;
    }

//Overide the methods that have to be written per the 'Franchise' abstract class
@Override
    public void broilStuff(String menuItem) {
        System.out.println("Cooking up a lovely " + menuItem);
    }

@Override
    public void bussinessHours(int open, int close) {
        System.out.println("Open: " + open + " Close : " + close);
    }

@Override
    public boolean iceCreamMachineWorking() {
        //This could be just be replaced by a getter
        //If we wanted to make it more complex we could check if store is open then return true
        if (this.openTime > 0100){
            return this.iceCreamTime;
        }
        return false;
    }


    public static void main(String[] args) {
        List<String> theseMenuItems = new ArrayList<>();
        theseMenuItems.add("Big Mac");
        theseMenuItems.add("Grench Fries");

        List<String> theseCatagories = new ArrayList<>();
        theseCatagories.add("Entrees");
        theseCatagories.add("Sides");

        BurgerShop mcDonaldsSanAntonio = new BurgerShop("Ryan Phillips", theseMenuItems, theseCatagories, 200, 800, 2300, true);

        mcDonaldsSanAntonio.setManagerName("Bob Doll");
        mcDonaldsSanAntonio.setIceCreamTime(false); //IceCream No Longer Works

    }



    //GETTERS AND SETTERS
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
}
