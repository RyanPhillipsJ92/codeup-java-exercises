package shapes;

public class Square extends Rectangle {

    protected double sides;

    public Square(double side){
        super(side, side);
        sides = side;
    }



    public double  getArea(){
        System.out.println("Square get area");

//        return  length * width;
        return Math.pow(sides, 2);
    }


    public double  getPerimeter(){
        System.out.println("Square get perimeter");
        return sides * 4;
    }

}
