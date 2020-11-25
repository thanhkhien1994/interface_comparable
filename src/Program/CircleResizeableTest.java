package Program;

import Resizeable.CircleResizeable;

public class CircleResizeableTest {
    public static void main(String[] args) {
        CircleResizeable circleResizeable = new CircleResizeable();
        System.out.println(circleResizeable);
        circleResizeable.resize(50);
        System.out.println(circleResizeable);
    }
}
