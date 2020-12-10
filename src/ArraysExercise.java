import oop_lec.Person;

import java.util.Arrays;
import java.util.Scanner;

public class ArraysExercise {



    public static Person[] addPerson(Person[] threePeeps, Person person){
       threePeeps = Arrays.copyOf(threePeeps, threePeeps.length + 1);
       threePeeps[threePeeps.length - 1] = person;
       return threePeeps;
    }

    public static void main(String[] args) {

        Person[] threePeeps = new Person[3];
       threePeeps[0] = new Person("yo");
        threePeeps[1] = new Person("me") ;
        threePeeps[2] = new Person("you");
        for (Person people : threePeeps){
            System.out.println(people.getName());
        }

//        1st way prior to refactoring to enhanced for each loop
//        for (int i = 0; i < threePeeps.length; i += 1) {
//            System.out.println(threePeeps[i].getName());
//        }
        Person person = new Person("Ryan");
        threePeeps = addPerson(threePeeps, person);
//
        for (Person people : threePeeps){
            System.out.println(people.getName());
        }

    }
}

