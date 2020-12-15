package shapes;

public class Rectangle extends Quadrilateral implements Measurable{

    public Rectangle(double l, double w) {
        super(l, w);
    }

    @Override
    public double setLength() {
        return length;
    }

    @Override
    public double setWidth() {
        return width;
    }

}

