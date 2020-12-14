

import java.util.Arrays;
import java.util.Random;

public class ServerNameGenerator {
   static String[] adjective = {"plump", "eager", "itchy", "mammoth", "scrawny", "jolly", "ambitious", "teeny", "mysterious", "obnoxious"};
   static String[] nouns = {"area", "book", "business", "case", "child", "company", "country", "fact", "family", "government"};

   static Random rando = new Random();
    static int  random10 = rando.nextInt((10 - 1) +1);
    static int  random210 = rando.nextInt((10 - 1) +1);


    public static String getRandAdjAndNoun(){ ;
        return adjective[random10] + "-" + nouns[random210];

    }

    public static void main(String[] args) {
        System.out.println("Here is your server name :");
        System.out.println(getRandAdjAndNoun());



    }

}
