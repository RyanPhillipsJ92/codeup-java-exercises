package shapes;

import util.Input;

public class CircleApp {
    public static void main(String[] args) {

        boolean more;
        do {
            Circle circle = new Circle();
            Input moreCircles = new  Input();
           more = moreCircles.yesNo();
        }while (more);

        System.out.println("You have created " + Circle.returnCircleCount() + "circles, bye.");

    }
}
