import java.util.Scanner;

public class ControlFlowExercises {
    public static void main(String[] args) {

//       int i = 5;
//       while (i <= 15){
//           System.out.print(i +" ");
//           i++;
//       };
//
//       System.out.println("");
//
//       for (int i2 = 5; i2 <= 15; i2++){
//           System.out.print(i2 +" ");
//       }
//
//
//
//
//
//
//
//       System.out.println("");
//       int x = 100;
//       do {
//            System.out.println(x);
//            x = x - 5;
//       } while (x >= -10);
////
//       for (int x2 = 100; x2 >= -15; x2 -= 5){
//           System.out.println(x2);
//       }
//
//
//
//
//
//
//       long z = 2L;
//       do {
//           System.out.println(z);
//           z *= z;
//       }while (z < 1000000L);
////
//
//
//       for(long z2 = 2; z2 < 1000000 ; z2 *= z2){
//           System.out.println(z2);
//       }


//     *************************************************
//     ***************FIZZ BUZZ IN JAVA*****************
//     *************************************************
//
//       for (int fizzbuzz = 1; fizzbuzz <=100; fizzbuzz +=1){
//           if (fizzbuzz % 15 == 0){
//               System.out.println("FizzBuzz");
//               continue;
//           } else if (fizzbuzz % 5 == 0) {
//               System.out.println("Buzz");
//               continue;
//           }else if (fizzbuzz % 3 == 0) {
//               System.out.println("Fizz");
//               continue;
//           }
//           System.out.println(fizzbuzz);
//       }

//     *************************************************
//     ***************FIZZ BUZZ IN JAVA*****************
//     *************************************************


        Scanner userInput = new Scanner(System.in);
//       String choice = "y";
//       do {
//           System.out.print("Enter an integer: ");
//            int integer = userInput.nextInt();
//           System.out.println("Here is your table!");
//           String header = "Number  " + "Squared " + "Cubed   " + "%n"
//                   +   "======  " + "======= " + "=====   %n";
//           System.out.printf(header);
//           for (int i = 1; i<=integer; i++){
//               int square = i * i;
//               int cube = i * i * i;
//               String row = i + "       " + square + "       " + cube;
//               System.out.println(row);
//       }
//           System.out.print("Continue? (y/n): ");
//           choice = userInput.next();
//           System.out.println();
//       }while (!choice.equalsIgnoreCase("n"));
//


       String userChoice = "y";
//       do {
//           System.out.println("Enter a numerical grade from 0 - 100");
//           int gradeScore = userInput.nextInt();
//           if (gradeScore <= 59){
//               System.out.println("Current grade is a : F");
//           }else if (gradeScore <= 66){
//               if (66 - gradeScore <= 2){
//                   System.out.println("Current grade is a : D+");
//               }else if (66 - gradeScore >= 6){
//                   System.out.println("Current grade is a : D-");
//               }else
//                   System.out.println("Current grade is a : D");
//           }else if (gradeScore <= 79){
//               if (79 - gradeScore <= 3){
//                   System.out.println("Current grade is a : C+");
//               }else if (79 - gradeScore >= 9){
//                   System.out.println("Current grade is a : C-");
//               }else
//                   System.out.println("Current grade is a : C");
//           }else if (gradeScore <= 87){
//               if (87 - gradeScore <= 3){
//                   System.out.println("Current grade is a : B+");
//               }else if (87 - gradeScore >= 6){
//                   System.out.println("Current grade is a : B-");
//               }else
//                  System.out.println("Current grade is a : B");
//           }else if (gradeScore <= 100){
//               if (100 - gradeScore <= 5){
//                   System.out.println("Current grade is a : A+");
//               }else if (100 - gradeScore >= 10){
//                   System.out.println("Current grade is a : A-");
//               }else
//                  System.out.println("Current grade is a : A");
//           }
//           System.out.print("Continue? (y/n): ");
//           userChoice = userInput.next();
//           System.out.println();
//       }while (!userChoice.equalsIgnoreCase("n"));


//        String userChoice = "y";
        do {
            System.out.println("Enter a numerical grade from 0 - 100");
            int numberGrade = userInput.nextInt();
            System.out.println();


            int quotient = numberGrade / 10;
            int remainder = numberGrade % 10;

            // This will hold the final letter grade
            String letterGrade ;

            switch (quotient) {
                case 10:
                    // The student got a 100%, so just return A+
                    letterGrade = "A";
                    break;
                case 9:
                    // 90-99 is an A
                    letterGrade = "A";
                    break;
                case 8:
                    // 80-89 is a B
                    letterGrade = "B";
                    break;
                case 7:
                    // 70-79 is a C
                    letterGrade = "C";
                    break;
                case 6:
                    // 60-69 is a D
                    letterGrade = "D";
                    break;
                default:
                    // Anything 59 or below is an F
                    System.out.println("F");
            }

            switch (remainder) {
                // For example, 70-73 are C-
                case 0:
                case 1:
                case 2:
                case 3:
                    letterGrade += "-";
                    break;
                // Likewise, 77-79 are C+
                case 7:
                case 8:
                case 9:
                    letterGrade += "+";
                    break;
                // Everything else just falls through, no + or - needed
            }


            System.out.println(letterGrade);
            System.out.print("Continue? (y/n): ");
            userChoice = userInput.next();
        } while (!userChoice.equalsIgnoreCase("n"));








//           switch(gradeScore)
//           {
//               case 1: gradeScore >= 96;
//                   System.out.println("grade is A+");
//                   break;
//               case 2: gradeScore >= 92;
//                   System.out.println("grade is A");
//                   break;
//               case 3: gradeScore >= 88;
//                   System.out.println("grade is A-");
//                   break;
//               case 4: gradeScore >= 85;
//                   System.out.println("grade is B+");
//                   break;
//               case 5: gradeScore >= 82;
//                   System.out.println("grade is B");
//                   break;
//               case 6: gradeScore >= 80;
//                   System.out.println("grade is B-");
//                   break;
//               case 7: gradeScore >= 77;
//                   System.out.println("grade is C+");
//                   break;
//               case 8: gradeScore >= 70;
//                   System.out.println("grade is C");
//                   break;
//               case 9: gradeScore >= 67;
//                   System.out.println("grade is C-");
//                   break;
//               case 10: gradeScore >= 65;
//                   System.out.println("grade is D+");
//                   break;
//               case 11: gradeScore >= 62;
//                   System.out.println("grade is D");
//                   break;
//               case 12: gradeScore >= 60;
//                   System.out.println("grade is D-");
//                   break;
//               case 13: gradeScore >= 0;
//               System.out.println("grade is F");
//               break;
//
//               default:
//                   System.out.println("ERROR");
//           }
//           System.out.print("Continue? (y/n): ");
//           userChoice = userInput.next();
//       }while (!userChoice.equalsIgnoreCase("n"));


    }
}
