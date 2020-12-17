package grades;

import java.util.*;
import java.util.stream.Collectors;

import util.Input;
public class GroceryList {

    public static void chooseCategory() {
        int i = 1;

        ArrayList<String> foodCategories = new ArrayList<>(Arrays.asList("Meat", "Dairy", "Produce"));
        HashMap<ArrayList<String>, String> foods = new HashMap<>();


        System.out.println("Choose a number to corresponding category of grocery.");
        for (String category : foodCategories) {
            System.out.println(i +") " + category);
            i += 1;
        }
//        switch(expression) {
//            case 1:
//                // code block
//                break;
//            case 2:
//                // code block
//                break;
//            case 3:
//                // code block
//                break;
//            default:
        // code block

//        1 )Given an ordered list of grocery categories to choose from, select the category.
//                     display prewritten list of categories as an ARRAY LIST
//                            What category do they choose
//                                Save user input for Category, item, and quantity to insert to hashmap

//                2) Enter the name of the item.
//                      What is the name?

//                3) Enter how many of the item.
//                       What is the quantity
//                          Would you like to add another item  - (if no exit if yes repeat step 1 - 3)
    }


    public static void main(String[] args) {
        Input input = new Input();

        boolean createList = true;
        System.out.println("Would you like to create a new Grocery List?");
        boolean proceed = input.yesNo();
        if (proceed) {
            System.out.println("Would you like add new item?");
            boolean proceedGroceryList = input.yesNo();
            if (proceedGroceryList) {
                chooseCategory();
            }
//                Print list ie -
//            Once the user finalizes the list, they will be presented with a complete list organized alphabetically and grouped by a category, and including quantity.


        }
    }
}
