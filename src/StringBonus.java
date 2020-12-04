import java.util.Scanner;

public class StringBonus {
    public static void main(String[] args) {
        Scanner userInput = new Scanner(System.in);
        System.out.println("Enter date as MM/DD/YYYY");
        String userDate = userInput.nextLine().trim();

//        Convert month from String to Integer to Use as case Statement
        String userMonth = userDate.substring(0, userDate.indexOf("/"));
        int monthInDigits = Integer.parseInt(userMonth);

//      Get the days portion of string
        String userDay= userDate.substring(userDate.indexOf("/") + 1, userDate.lastIndexOf("/"));

//      Get the years portion of string
        String userYear= userDate.substring(userDate.lastIndexOf("/") + 1, userDate.lastIndexOf("/")+5);

//      Use month as integer to find corresponding case statement
        switch (monthInDigits) {
            case 1:  System.out.println("January " + userDay + ", " + userYear); break;
            case 2:  System.out.println("February " + userDay + ", " + userYear); break;
            case 3:  System.out.println("March"  + userDay + ", " + userYear); break;
            case 4:  System.out.println("April"  + userDay + ", " + userYear); break;
            case 5:  System.out.println("May"  + userDay + ", " + userYear); break;
            case 6:  System.out.println("June"  + userDay + ", " + userYear); break;
            case 7:  System.out.println("July"  + userDay + ", " + userYear); break;
            case 8:  System.out.println("August " + userDay + ", " + userYear); break;
            case 9:  System.out.println("September " + userDay + ", " + userYear); break;
            case 10: System.out.println("October  " + userDay + ", " + userYear); break;
            case 11: System.out.println("November " + userDay + ", " + userYear); break;
            case 12: System.out.println("December " + userDay + ", " + userYear); break;
            default: System.out.println("Not a month!"); break;
        }

//        *************************************************************************************
//        ********************************    BONUS 2   ***************************************
//        *************************************************************************************
        System.out.println("Please enter any sentence.");

//        Users Sentence comes in as String
        String userSentence = userInput.nextLine();
//        Counter for the vowels and consonants
        int vowels = 0;
        int consonants = 0;

        //Convert String to lower case to check equality between letter values not capital and lowercase
        userSentence = userSentence.toLowerCase();

//        For Loop to loop through each CHAR in String
//        Check the index of String at i and compare to known good vowels
        for(int i = 0; i < userSentence.length(); i++) {
            char userLetter= userSentence.charAt(i);

//            IF VOWEL ADD TO VOWEL COUNT
            if(userLetter == 'a' || userLetter == 'e' || userLetter == 'i' || userLetter == 'o' || userLetter== 'u') {
                vowels++;

//                ELSE ADD ONLY CHARACTERS TO CONSONANTS THAT ARE BETWEEN A & Z
//                CHECK VOWEL FIRST SO VOWELS DONT ADD TO CONSONANTS
             } else if(userLetter>= 'a'&& userLetter<= 'z') {
            consonants++;
        }
        }
        System.out.println("Number of Vowels: " + vowels);
        System.out.println("Number of Consonants: " + consonants);


    }
}
