package oop_lec;

public class Dish {
    public int costInCents;
    public String nameOfDish = "NAME_OF_DISH_HERE";
    public boolean wouldRecommend;

    public void printSummary() {
        String recommendation;
        if (wouldRecommend){
            recommendation = "This dish comes recommended!";
        }else {
            recommendation = "This dish is not recommended!";
        }
        System.out.printf("Cost: $%d.00%n" +
                "Name: %s%n" +
                "Recommended: %s%n",costInCents, nameOfDish,recommendation);
    }
}
