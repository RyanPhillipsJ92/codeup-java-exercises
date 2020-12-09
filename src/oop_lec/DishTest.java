package oop_lec;

public class DishTest {
    public static void main(String[] args) {

        Dish dish1 = new Dish();
        dish1.costInCents = 29;
        dish1.nameOfDish = "Unicorn steak, with a side a mashed pickle";
        dish1.wouldRecommend = true;
        dish1.printSummary();


        System.out.println(dish1.wouldRecommend);
       DishTools.shoutDishName(dish1.nameOfDish);
       DishTools.analyzeDishCost(dish1.costInCents);
       dish1.wouldRecommend = DishTools.flipRecommendation(dish1.wouldRecommend);
        System.out.println(DishTools.flipRecommendation(dish1.wouldRecommend));
    }

}
