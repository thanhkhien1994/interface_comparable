package Program;

import Shape.*;

public class TestShape {
    public static void main(String[] args) {
        Circle circle = new Circle();
        System.out.println(circle);

        circle = new Circle(3.5);
        System.out.println(circle);

        circle = new Circle("indigo", false, 3.5);
        System.out.println(circle);
        System.out.println("-------------------------------------------");
        /*-------------------------------------------------------------*/

        Shape shape = new Shape();
        System.out.println(shape);

        shape = new Shape("Red", false);
        System.out.println(shape);
        System.out.println("--------------------------------------------");
        /*--------------------------------------------------------------*/

        Square square = new Square(2.3);
        System.out.println(square);

        square = new Square("Yellow", true, 5.8);
        System.out.println(square);
        System.out.println("--------------------------------------------");
        /*---------------------------------------------------------------*/

        Rectangle rectangle = new Rectangle(3.5, 2.8);
        System.out.println(rectangle);

        rectangle = new Rectangle("Yellow", true, 5.5, 2.2);
        System.out.println(rectangle);

    }
}