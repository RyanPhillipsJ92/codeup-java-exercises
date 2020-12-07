import javax.imageio.stream.ImageInputStream;
import javax.print.DocFlavor;
import java.util.Scanner;

public class MethodsExercises {

//    public static String addition(long num1, long num2) {
//        long sum = num1 + num2;
//        return num1 + " + " + num2 + " = " + sum;
//    }
//
//    public static String subtraction(long num1, long num2) {
//        long difference = num1 - num2;
//        return num1 + " - " + num2 + " = " + difference;
//    }
//
//    public static String multipliction(long num1, long num2) {
//        long product = num1 * num2;
//        return num1 + " * " + num2 + " = " + product;
//    }
//
//    public static String division(long num1, long num2) {
//        long quotient = num1 / num2;
//        return num1 +  " / " + num2 + " = " + quotient;
//    }
//
//    public static String modulas(long num1, long num2) {
//        long remainder = num1 % num2;
//        return num1 +  " % " + num2 + " = " + remainder;
//    }
//
//
//
//
//    public static String multipliction2(long num1, long num2) {
//        long product = 0;
//        if(num2 == 0 || num1 == 0) {
//            return num1 + " * " + num2 + " = " + product;
//
//        } else if (num1 > 0 && num2 > 0) {
//            for (int i = 0; i != num2; i++) {
//                product += num1;
//            }
//        } else if (num2 < 0 && num1 < 0) {
//            for (int i = 0; i != num2; i--) {
//                product -= num1;
//            }
//
//        } else if(num1 < 0){
//            for (int i = 0; i != num2; i++) {
//                product += num1;
//            }
//
//        } else {
//            for (int i = 0; i != num1; i++) {
//                product += num2;
//            }
//        }
//        return num1 + " * " + num2 + " = " + product;
//    }
//
//    public static String Failure (){
//        return  "Sorry invalid entry";
//    }
//
//    public static long factorialUser(int n) {
//        long resultOne = 1;
//        for (int i = 1; i <= n; i++) {
//            resultOne = resultOne * i;
//        }
//        return resultOne;
//    }
//
//
//
//    public static int getUserNumberCheckGoodandRender() {
//
//        System.out.print("Enter a number between 1 and 10: ");
//        Scanner scanner = new Scanner(System.in);
//        int goodNumber = scanner.nextInt();
//        if (goodNumber < 1 || goodNumber > 10) {
//
//            System.out.println(Failure());
//
//            goodNumber = getUserNumberCheckGoodandRender();
//
//        } else if (goodNumber > 1 && goodNumber < 10) {
//            return goodNumber;
//
//        }
//        scanner.close();
//        return goodNumber;
//    }
//
//    public static String stop(){
//        int n = getUserNumberCheckGoodandRender();
//        long result = factorialUser(n);
//        System.out.println("The factorial of " + n + " is " + result);

//    public static int diceRoll() {
//        Scanner sidesOfDice = new Scanner(System.in);
//        System.out.println("Please enter how many sides of the dice their are");
//        int howMany = sidesOfDice.nextInt();
//        int die1;
//        int die2;
//        die1 = (int)(Math.random()*howMany)+1;
//        die2 =(int)(Math.random()*howMany)+1;
//        int roll = die1 + die2;
//        String response = "you rolled a " + die1 + " and a " + die2 + " for a total of: " + roll;
//        System.out.println(response);
//        return roll;
//    }


//    public static String HighLow() {
//        Scanner scanner = new Scanner(System.in);
//        int NumberToGuess = (int)(Math.random()*100)+1;
//        int numberGuessed;
//        int numberOfGuesses = 0;
//        do {
//            System.out.println("Guess a number between 1 - 100");
//            numberGuessed = scanner.nextInt();
//            if (NumberToGuess > numberGuessed){
//                numberOfGuesses +=1;
//                System.out.printf("HIGHER%nYou have guessed %d time/s%n",numberOfGuesses);
//            }else if (NumberToGuess < numberGuessed){
//                numberOfGuesses +=1;
//                System.out.printf("LOWER%nYou have guessed %d time/s%n",numberOfGuesses);
//            }
//        }while(NumberToGuess != numberGuessed);
////        System.out.println("Woah you nerd.");
//        scanner.close();
//        numberOfGuesses +=1;
//        System.out.printf( "GOOD GUESS.%nIt took you %d guesses%n", numberOfGuesses);
//        return "GOOD GUESS.";
//    }

//    Scanner userInput = new Scanner(System.in);



//        String keepGoing;
//        do {
//            int n = getUserNumberCheckGoodandRender();
//            long result = factorialUser(n);
//            System.out.println("The factorial of " + n + " is " + result);
//            System.out.println("Would you like to continue?");
//            keepGoing = userInput.nextLine().trim();
//        }while (keepGoing.equalsIgnoreCase("y"));
//        return "Thanks for playing";
//    }

    public static int getInteger(int min, int max) {
        Scanner sc = new Scanner(System.in);
        if (!sc.hasNextInt()) {
            System.out.println("Not a number!");
            return getInteger(min, max);
        }
        int userInput = sc.nextInt();
        if (userInput >= min && userInput <= max) {
            return userInput;
        } else {
            System.out.println("Number not in range!");
            return getInteger(min, max);
        }
    }


    public static int randomWithRange(int min, int max)
    {
        int range = (max - min) + 1;
        return (int)(Math.random() * range) + min;
    }


    public static void rollDiceGame(Scanner sc) {
        String userChoice;
        System.out.print("Please enter the number of sides for the dice: ");
        int nSides = getInteger(1, 20);
        do {
            System.out.println("You have rolled a " + randomWithRange(1, nSides) + " and a " + randomWithRange(1, nSides));
            do {
                System.out.println("Would you like to roll again? [y/n]");
                userChoice = sc.next().trim();
            } while (!userChoice.equalsIgnoreCase("y") & !userChoice.equalsIgnoreCase("n"));

        } while (!userChoice.equals("n"));
    }







        public static void main (String[]args){
//            Scanner userInput = new Scanner(System.in);

//        System.out.println(addition(5, 5));
//        System.out.println(subtraction(5, 5));
//        System.out.println(multipliction(5, 5));
//        System.out.println(division(5, 5));

//            System.out.println(multipliction2(-5, -2));
//            System.out.println(multipliction2(5, 2));
//            System.out.println(multipliction2(-5, 2));
//            System.out.println(multipliction2(5, -2));
//            System.out.println(multipliction2(5, 0));
//            System.out.println(multipliction2(0, 5));
//            System.out.println(multipliction2(0, 0));
//            stop();
//            diceRoll();
//            HighLow();
            Scanner sc = new Scanner(System.in);
                rollDiceGame(sc);
        }
}

