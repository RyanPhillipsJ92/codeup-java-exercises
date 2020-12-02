public class HelloWorld {
    public static void main(String[] args) {

        int myFavoriteNumber = 18;
        String myString = "My name is, Ryan";
        System.out.println(myString);
//        myString = 3.14159;  Wont work cant reassign a string to a number

        long myNumber;
//        System.out.println(myNumber); get warning variable myNumber might not have been initialized

//        myNumber = 3.14; wont work, get error java: incompatible types: possible lossy conversion from double to long

        myNumber = 123L;
        System.out.println(myNumber);

        myNumber = 123;
        System.out.println(myNumber);

//        Change your code to assign the value 123 to myNumber.
//        Why does assigning the value 3.14 to a variable declared as a long not compile, but assigning an integer value does?


//        Change your code to declare myNumber as a float. Assign the value 3.14 to it. What happens? What are two ways we could fix this?
//float a = (float) myNumber;
//          a = 3.14;

//        int x = 5;
//        System.out.println(x++);
//        System.out.println(x);
//        this will print 5 then 6 because the incrementation starts AFTER x is printed

//        int x = 5;
//        System.out.println(++x);
//        System.out.println(x);
//        this will print 6 then 6 because the incrementation starts BEFORE x is printed

//        String theNumberThree = "three";
//        Object o = theNumberThree;
//        int three = (int) o;

//        int three = (int) "three";

        int x = 4;
        x = x + 5;
        x +=5;

        int x = 3;
        int y = 4;
        y = y * x;
        y *= x;
    }
}
