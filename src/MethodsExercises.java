import javax.imageio.stream.ImageInputStream;
import java.util.Scanner;

public class MethodsExercises {

    public static String addition(long num1, long num2) {
        long sum = num1 + num2;
        return num1 + " + " + num2 + " = " + sum;
    }

    public static String subtraction(long num1, long num2) {
        long difference = num1 - num2;
        return num1 + " - " + num2 + " = " + difference;
    }

    public static String multipliction(long num1, long num2) {
        long product = num1 * num2;
        return num1 + " * " + num2 + " = " + product;
    }

    public static String division(long num1, long num2) {
        long quotient = num1 / num2;
        return num1 +  " / " + num2 + " = " + quotient;
    }

    public static String modulas(long num1, long num2) {
        long remainder = num1 % num2;
        return num1 +  " % " + num2 + " = " + remainder;
    }




    public static String multipliction2(long num1, long num2) {
        long product = 0;
        if(num2 == 0 || num1 == 0) {
            return num1 + " * " + num2 + " = " + product;

        } else if (num1 > 0 && num2 > 0) {
            for (int i = 0; i != num2; i++) {
                product += num1;
            }
        } else if (num2 < 0 && num1 < 0) {
            for (int i = 0; i != num2; i--) {
                product -= num1;
            }

        } else if(num1 < 0){
            for (int i = 0; i != num2; i++) {
                product += num1;
            }

        } else {
            for (int i = 0; i != num1; i++) {
                product += num2;
            }
        }
        return num1 + " * " + num2 + " = " + product;
    }

    public static String Failure (){
        return  "Sorry invalid entry";
    }

    public static long factorialUser(int n) {
        long resultOne = 1;
        for (int i = 1; i <= n; i++) {
            resultOne = resultOne * i;
        }
        return resultOne;
    }



    public static int getUserNumberCheckGoodandRender() {

        System.out.print("Enter a number between 1 and 10: ");
        Scanner scanner = new Scanner(System.in);
        int goodNumber = scanner.nextInt();
        if (goodNumber < 1 || goodNumber > 10) {

            System.out.println(Failure());

            goodNumber = getUserNumberCheckGoodandRender();

        } else if (goodNumber > 1 && goodNumber < 10) {
            return goodNumber;

        }
        scanner.close();
        return goodNumber;
    }

    public static String stop(){
//        int n = getUserNumberCheckGoodandRender();
//        long result = factorialUser(n);
//        System.out.println("The factorial of " + n + " is " + result);

        Scanner userInput = new Scanner(System.in);
        String keepGoing;
        do {
            int n = getUserNumberCheckGoodandRender();
            long result = factorialUser(n);
            System.out.println("The factorial of " + n + " is " + result);
            System.out.println("Would you like to continue?");
            keepGoing = userInput.nextLine().trim();
        }while (keepGoing.equalsIgnoreCase("yes"));
        return "Thanks for playing";
    }


        public static void main (String[]args){
            Scanner userInput = new Scanner(System.in);

//        System.out.println(addition(5, 5));
//        System.out.println(subtraction(5, 5));
//        System.out.println(multipliction(5, 5));
//        System.out.println(division(5, 5));

            System.out.println(multipliction2(-5, -2));
            System.out.println(multipliction2(5, 2));
            System.out.println(multipliction2(-5, 2));
            System.out.println(multipliction2(5, -2));
            System.out.println(multipliction2(5, 0));
            System.out.println(multipliction2(0, 5));
            System.out.println(multipliction2(0, 0));
            stop();
//               int n = getUserNumberCheckGoodandRender();
//                    long result = factorialUser(n);
//                    String keepGoing = stop(n, result);
//                    System.out.println("The factorial of " + n + " is " + result);


        }
}

