package oop_lec;

public class  DishTools {

    public static final int AVERAGE_COST_OF_DISH_IN_CENTS = 1300;

    public static void shoutDishName(String nameOfDish){
        System.out.println(nameOfDish.toUpperCase());
    }
    public static void analyzeDishCost(int costInCents){
        if (costInCents> AVERAGE_COST_OF_DISH_IN_CENTS){
            System.out.println("More expensive than average dish.");
        }else {
            System.out.println("Less expensive than average dish.");
        }

    }
    public static boolean flipRecommendation(boolean wouldRecommend){
        return !wouldRecommend;
    }
}
