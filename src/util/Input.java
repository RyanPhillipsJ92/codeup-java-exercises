package util;

import java.util.Scanner;

public class Input {

    private Scanner sc;

    public Input(){
        this.sc = new Scanner(System.in);
    }

   public  String getString(){
//        System.out.println("Please enter a string.");
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
    }while(userNumber <= min || userNumber > max);
        return userNumber;
    }


    int getInt(){
        System.out.println("Enter an Integer.");
        try {
            return Integer.parseInt(getString());
        }catch (NumberFormatException e) {
            e.printStackTrace(System.out);
            return getInt();
        }

    }

    double getDouble(double min, double max){
        try {
            do {
                System.out.printf("please enter a number between %.2f and %.2f%n", min, max);
            } while (Double.parseDouble(getString()) <= min || Double.parseDouble(getString()) >= max);
            return Double.parseDouble(getString());
        } catch (NumberFormatException e) {
            e.printStackTrace();
            return getDouble(min,max);
        }
    }
    double getDouble(){
        System.out.println("Enter a Number with a decimal.");
        try {
            return Double.parseDouble(getString());
        } catch (NumberFormatException e) {
            e.printStackTrace(System.out);
            return getDouble();
        }
    }



//public System getString(String prompt){
//    System.out.println(prompt);
//    return getString();
//}
}



