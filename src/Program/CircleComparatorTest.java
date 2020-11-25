package Program;

import Comparator.*;
import Shape.Circle;

import java.util.Arrays;

public class CircleComparatorTest {
    public static void main(String[] args) {
        Circle[] circle = new Circle[3];
        circle[0] = new Circle(3.6);
        circle[0] = new Circle();
        circle[0] = new Circle("indiago", false, 3.5 );

        for (Circle c: circle) {
            System.out.println(c);
        }

        Comparator circleComparator = new CircleComparator();
        System.out.println("After-sorted:");
        for (Circle c : circle) {
            System.out.println(circle);
        }
    }

}
