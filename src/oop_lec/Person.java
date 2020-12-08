package oop_lec;

public class Person {

//        // SLIDE 3
//        public String firstName;
//        public String lastName;


        // SLIDE 4

//        // instance variables
        public String firstName;
        public String lastName;
//
//        // instance method
        public String sayHello(char punctuation) {
                return lastName + ", " + firstName + " says hi" + punctuation;
        }


        // SLIDE 7
//        public static long worldPopulation = 7_500_000_000L; // class property
//        public String name;                                  // instance property
//
//        public static void main(String[] args) {
//
//                System.out.println(oop_lec.Person.worldPopulation);
//                oop_lec.Person.worldPopulation -= 1;
//                System.out.println(worldPopulation);
//
//
//                oop_lec.Person theBestDrummerAlive = new oop_lec.Person();
//                theBestDrummerAlive.name = "Neil Peart";
//                oop_lec.Person.worldPopulation += 1; // accessing a static property
//                // this also works, but is usually not a good idea
//                System.out.println(theBestDrummerAlive.worldPopulation); // 7500000001
//                // DONT DO THIS, it will not compile
////                 System.out.println(oop_lec.Person.name);
//        }

}
