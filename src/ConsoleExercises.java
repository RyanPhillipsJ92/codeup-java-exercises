import java.util.Scanner;

public class ConsoleExercises {
    public static void main(String[] args) {

//        double pi = 3.14159;
//        System.out.printf("The value of pi us approximately %6.2f%n", pi);
//
//
//
        Scanner userInput = new Scanner(System.in);
        userInput.useDelimiter("\n");
//        System.out.println("Please enter your age.");
//        String usersAge = userInput.next();


//        System.out.println("Please enter your first, middle, and last name.");
//        String firstName = userInput.next();
//        String middleName = userInput.next();
//        String lastName = userInput.next();
//        System.out.printf("first: %s, middle: %s, and last name: %s.%n", firstName, middleName, lastName);
//
//        System.out.println("Please enter a sentence of your choosing/");
//
//        String userSentence = userInput.next();
//        System.out.printf("Your sentence is: %s.%n",userSentence);
//
//        String userSentenceNextLine = userInput.nextLine();
//        System.out.printf("Your sentence is: %s.%n",userSentenceNextLine);

          System.out.printf("enter the length of your classroom in feet%n");
        float L = userInput.nextInt();
        System.out.printf("enter the width of your classroom in feet%n");
        float W = userInput.nextInt();
        System.out.printf("enter the Height of your classroom in feet%n");
        float H = userInput.nextInt();
        float A = L * W;
        float P = (L * 2) + (W * 2);
        float V = L * W * H;
        System.out.printf("The classroom length is: %.2f feet%n" +
                          "and a width of: %.2f feet%n" +
                          "a Height of: %.2f feet%n" +
                          "The perimeter is %.2f Feet%n" +
                          "The Area of the classroom is %.2f Square Feet.%n" +
                          "The volume of your classroom is: %.2f Cubic Feet.#n", L, W, H, P, A, V);
    }


}
