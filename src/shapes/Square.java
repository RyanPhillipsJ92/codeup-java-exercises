package shapes;

public class Square extends Quadrilateral {



    public Square(double side) {
        super(side, side);

    }
    @Override
    public double setLength(){
        return side;
    };

    @Override
    public double setWidth(){
        return side;
    };


}
