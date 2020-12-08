package oop_lec;

public class DishTest {
    public static void main(String[] args) {

        Dish dish1 = new Dish();
        dish1.costInCents = 29;
        dish1.nameOfDish = "Unicorn steak, with a side a mashed pickle";
        dish1.wouldRecommend = true;
        dish1.printSummary();
    }

}
