package AbstractClassesInterfaceLec;

import java.util.List;

public class AustinMcD implements McFranchise {


    private List<String> menuItems;
    private List<String> menuCategories;
    private int seatingCapacity;
    private int openTime;
    private int closeTime;
    private boolean iceCreamTime;

    //CONSTRUCTOR

    public AustinMcD(List<String> menuItems, List<String> menuCategories, int seatingCapacity, int openTime, int closeTime, boolean iceCreamTime) {
        this.menuItems = menuItems;
        this.menuCategories = menuCategories;
        this.seatingCapacity = seatingCapacity;
        this.openTime = openTime;
        this.closeTime = closeTime;
        this.iceCreamTime = iceCreamTime;
    }





    //OVERIDING METHODS FROM INTERFACE
    @Override
    public void broilStuff(String menuItem) {
        System.out.println("The hipster kitchen just whipped up a " + menuItem);
    }

    @Override
    public void businessHours(int open, int close) {
        System.out.println("The hipster store opens at: " + open + " and closes at" + close);
    }

    @Override
    public String iceCreamMachineWorking() {
        if (this.iceCreamTime){
            return "Made with all organic milk";
        }else {
            return "we ran out of organic milk! No icea cream for you";
        }
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
