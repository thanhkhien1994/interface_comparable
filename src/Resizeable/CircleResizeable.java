package Resizeable;

import Shape.Circle;

public class CircleResizeable extends Circle implements Resizeable {
    @Override
    public void resize(double percent) {
        setRadius(percent/100*getRadius()+getRadius());
    }
}
