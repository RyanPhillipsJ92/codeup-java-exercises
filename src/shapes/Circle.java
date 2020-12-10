package shapes;

import java.util.Scanner;

public class Circle {
    private Scanner sc;

    double circleRadius;

    public Circle(){
        this.sc = new Scanner(System.in);
        System.out.println("what is the radius of the circle");
        circleRadius = sc.nextDouble();
        System.out.printf("The area of the circle is %.2f%n",getArea(circleRadius));
        System.out.printf("The circumference of the circle is %.2f%n",getCircumference(circleRadius));
    }

    private double pi = Math.PI;

    public double getArea(double radius){
        return pi * (radius * radius);
    }

    public double getCircumference(double radius){
        return 2 * pi * radius;
    }

}
