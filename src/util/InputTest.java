package util;

public class InputTest {
   public static void main(String[] args) {
       Input input = new Input();
//       System.out.println("enter a string");
//      String test = input.getString();
//       System.out.println(test);
//       boolean test1 = input.yesNo();
//       System.out.println(test1);
       int test2 = input.getInt(10,50);
       System.out.println(test2);
       int test3 = input.getInt();
       System.out.println(test3);
       double test4 = input.getDouble(10.50,49.50);
       System.out.println(test4);
       double test5 = input.getDouble();
       System.out.println(test5);


    }
}
