package oop_lec;

public class Person {

        private String name;

        public Person(){
                this.name = "default";
        }

        public Person(String name){
                this.name = name;
        }

        public String getName(){
        //TODO: return the person's name
                return this.name;
        }

        public void setName(String name) {
                this.name = name;
        }
        public void sayHello(){
//TODO: print a message to the console using the person's name
                System.out.printf("Hello %s, How are you?%n", name);
        }

        public static void main(String[] args) {

//              Person person1 = new Person("John");
//                Person person2 = new Person("John");
//                System.out.println(person1.getName().equals(person2.getName()));
//                System.out.println(person1 == person2);
//
//                Person person1 = new Person("John");
//                Person person2 = person1;
//                System.out.println(person1 == person2);

                Person person1 = new Person("John");
                Person person2 = new Person();
                System.out.println(person1.getName());
                System.out.println(person2.getName());
                person2.setName("Jane");
                person1.setName("John");
                System.out.println(person1.getName());
                System.out.println(person2.getName());
        }

}
