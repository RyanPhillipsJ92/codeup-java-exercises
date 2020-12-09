package shapes;

import java.util.Scanner;

public class Circle {
    private Scanner sc;
    int circleRadius;
    public Circle(){
        this.sc = new Scanner(System.in);
        System.out.println("what is the radius of the circle");
       circleRadius = sc.nextInt();
        System.out.printf("the area of the circle is %.2f%n",getArea(circleRadius));
        System.out.printf("The circumference of the circle is %.2f%n",getCircumference(circleRadius));
    }

    private double pi = Math.PI;

//    public Circle(double radius){
//        System.out.printf("the area of the circle is %.2f",getArea(radius));
//        System.out.printf("The circumference of the circle is %.2f",getCircumference(double radius));
//    }
    public double getArea(double radius){
        double area = pi * (radius * radius);
        return area;
    }

    public double getCircumference(double radius){
        double circumference = 2 * pi * radius;
        return circumference;
    }

}
