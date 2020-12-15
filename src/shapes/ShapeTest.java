package shapes;

public class ShapeTest {
    public static void main(String[] args) {
        Measurable myShape = new Square(5);
        Measurable myShape2 = new Rectangle(4, 5);

        System.out.println("the Perimeter of my shape is: " + myShape.getPerimeter());
        System.out.println("the Area of my shape is: " + myShape.getArea());

        System.out.println("the Perimeter of my shape is: " + myShape2.getPerimeter());
        System.out.println("the Area of my shape is: " + myShape2.getArea());

//        Rectangle box1 = new Rectangle(5,4);
//        System.out.println("Area = " + box1.getArea());
//        System.out.println("Perimeter = " + box1.getPerimeter());
//
//        Rectangle box2 = new Square(5);
//        System.out.println("Area = " + box2.getArea());
//        System.out.println("Perimeter = " + box2.getPerimeter());

//        Square box3 = new Square(4);
//        System.out.println("Area = " + box3.getArea());
//        System.out.println("Perimeter = " + box3.getPerimeter());
//        System.out.println(box2 instanceof Rectangle);
//        System.out.println(box2 instanceof Square);
//        System.out.println(box1 instanceof Rectangle);
//        System.out.println(box1 instanceof Square);
    }
}
