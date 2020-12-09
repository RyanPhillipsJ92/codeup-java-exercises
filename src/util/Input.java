package util;

import java.util.Scanner;

public class Input {
    private Scanner sc = new Scanner(System.in);

    String getString(){
        System.out.println("Please enter a string.");
        return  sc.nextLine();
    }

    boolean yesNo(){
        System.out.println("Please enter 'y' or 'yes'.");
         String userInput = sc.nextLine().trim();
        return userInput.equalsIgnoreCase("y") ||
                (userInput.equalsIgnoreCase("yes"));
    }

    int getInt(int min, int max){
        int userNumber;
        do {
        System.out.printf("please enter a number between %d and %d%n",min, max);
        userNumber = sc.nextInt();
    }while(userNumber >= min && userNumber <= max);
        return userNumber;
    }

}



