package util;

import java.util.Scanner;

public class Input {

    private Scanner sc;

    public Input(){
        this.sc = new Scanner(System.in);
    }

    String getString(){
        System.out.println("Please enter a string.");
        return this.sc.nextLine();
    }

    public boolean yesNo(){
        System.out.println("Please enter 'y' or 'yes'.");
         String userInput = this.sc.nextLine().trim();
        return userInput.equalsIgnoreCase("y") ||
                userInput.equalsIgnoreCase("yes");
    }

    int getInt(int min, int max){
        int userNumber;
        do {
        System.out.printf("please enter a number between %d and %d%n",min, max);
        userNumber = this.sc.nextInt();
    }while(userNumber <= min || userNumber >= max);
        return userNumber;
    }


    int getInt(){
        System.out.println("Enter a Number.");
            return this.sc.nextInt();
    }

    double getDouble(double min, double max){
        double userNumber;
        do {
            System.out.printf("please enter a number between %.2f and %.2f%n",min, max);
            userNumber = this.sc.nextDouble();
        }while(userNumber <= min || userNumber >= max);
        return userNumber;
    }
    double getDouble(){
        System.out.println("Enter a Number.");
        return this.sc.nextDouble();
    }


}



