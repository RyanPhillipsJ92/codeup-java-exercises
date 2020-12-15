package shapes;

public abstract class Quadrilateral extends Shape implements Measurable {

    protected double length;
    protected double width;
    protected double side;

    public Quadrilateral(double l, double w){
    this.length = l;
    this.width = w;
    }

    public double getLength() {
        return this.length;
    }

    public double getWidth() {
        return this.width;
    }
    public double getPerimeter(){
        return 2 * length + 2 * width;
    }

    public double getArea(){
        return length * width;
    }

    public abstract double setLength();
    public abstract double setWidth();
}
