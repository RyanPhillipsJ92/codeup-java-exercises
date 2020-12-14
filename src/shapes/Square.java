package shapes;

public class Square extends Rectangle {

    protected int sides;

    public Square(int side){
        super(side, side);
        sides = side;
    }



    public int  getArea(){
        System.out.println("Square get area");

        return  length* width;
//        return (int) Math.pow(sides, 2);
    }


    public int  getPerimeter(){
        System.out.println("Square get perimeter");
        return sides * 4;
    }

}
