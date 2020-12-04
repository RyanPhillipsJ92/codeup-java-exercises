import java.util.Scanner;

public class Bob {
   public static void main(String[] args) {

       String bobsSentence = "";
       Scanner userInput = new Scanner(System.in);
       do {
           System.out.println("Say something to our good friend Bob!");
            bobsSentence = userInput.nextLine();
           if (bobsSentence.trim().endsWith("?")){
               System.out.println("sure");
           }else if (bobsSentence.trim().endsWith("!")){
               System.out.println("Whoa, Chill out!");
           }else if (bobsSentence.trim().equalsIgnoreCase("")){
               System.out.println("Fine. Be that way!");
           }else if (bobsSentence.trim().equalsIgnoreCase("bye")){
               System.out.println("...Bob didn't want to talk to you anyway!");
           }else {
               System.out.println("Whatever.");
           }
       }while (!bobsSentence.equalsIgnoreCase("bye"));

    }

}
